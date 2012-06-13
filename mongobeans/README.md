mongoBeans
==========

A small Xtext-based DSL providing JavaBeans access to mongoDB documents.

[MongoDB](http://www.mongodb.org) is a very popular document-based database management system. The standard [mongoDB Java driver](http://www.mongodb.org/display/DOCS/Java+Language+Center) allows to manipulate mongoDB entries as raw maps. This results in two major annoyances

1. you loose Java's static typing and

2. constructing a graph of nested maps is pretty inconvenient in Java.

In this project, we have created a small DSL based on [Xtext](http://www.xtext.org) that allows to create basic entity classes that are backed by mongoDB objects but provide a statically typed JavaBeans API. In addition, we show how to use [Xtend](http://www.xtend-lang.org) to significantly simplify the creation of such object graphs.


Running the example
-------------------

You'll need [Eclipse 3.6 or higher](http://www.eclipse.org/download), [Xtext 2.3](http://www.xtext.org) and [Xtend 2.3](http://www.xtend-lang.org). Also get the Java driver for mongoDB from Eclipse orbit, e.g. via the [team project](./mongobeans/blob/master/mongoDBdriver.psf) and of course the [mongoDB implementation for your platform](http://www.mongodb.org/downloads).

Import the projects into an Eclipse workspace and run the launch config "Run (org.eclipse.xtext.mongobeans)".  Import the example plug-in into the new workspace and run 'MusicDBXtendTest' as a JUnit test.


The DSL Approach
----------------

Similar to traditional OR-mapping, we define how to map mongoDB documents to JavaBeans. 
We use a domain-specific language (DSL) based on Xtext for this purpose. An example Mongo DSL file looks like this:

```
import java.util.*

package org.musicdb {
	// a mongo bean
	Artist {
		String name    // single valued property
		Album* albums  // array property
		// an operation
		Iterable<Track> getOevre() {
			albums.map[tracks].flatten
		}
	}
	
	// another mongo bean
	Album {
		String title 
		int year 
		// inline definition of a mongo bean
		Track {        
			String title
			int seconds
		}* tracks
	}
}
```

In the DSL we define MongoBeans. MongoBeans define statically typed MongoProperties, which can be single-valued or array-valued denoted by an '*' following the type name. The type of a MongoProperty can also be defined inline. MongoBeans can also define MongoOperations, e.g. to compute derived properties or convert values. Instead of defining all possible expressions for the body of an operation, we leverage Xtext's expression language library [Xbase](http://www.eclipse.org/Xtext/documentation/2_3_0/199d-xbase-expressions.php).
In addition, we allow package declarations and imports as in Java.

The complete grammar can be found [here](./mongobeans/blob/master/org.eclipse.xtext.mongobeans/src/org/eclipse/xtext/mongobeans/MongoBeans.xtext). 

Defining the type of a MongoProperty inline requires to adapt the language infrastructure a bit:
* the qualified name of a MongoBean should not contain the names of container MongoBeans or MongoProperties ([MongoQualifiedNameProvider](./mongoBeans/blob/master/org.eclipse.xtext.mongobeans/src/org/eclipse/xtext/mongobeans/scoping/MongoQualifiedNameProvider.java))
* all MongoBeans should be visible within the same package ([MongoImportedNamespaceAwareScopeProvider](./mongoBeans/blob/master/org.eclipse.xtext.mongobeans/src/org/eclipse/xtext/mongobeans/scoping/MongoImportedNamespaceAwareScopeProvier.java))

The Java driver for mongoDB cannot map all Java types to monogoDB types. To enforce that constraint, we've added a [MongoBeansJavaValidator](./mongoBeans/blob/master/org.eclipse.xtext.mongobeans/src/org/eclipse/xtext/mongobeans/validation/MongoBeansJavaValidator.java). Note that we can use MongoBeans as plain Java types, because we define a mapping for MongoBeans to Java classes (see next section). 

To improve the language visually, we've also tuned [syntax highlighting](./mongoBeans/tree/master/org.eclipse.xtext.mongobeans.ui/src/org/eclipse/xtext/mongobeans/ui/syntaxcoloring) and the [outline](./mongoBeans/blob/master/org.eclipse.xtext.mongobeans.ui/src/org/eclipse/xtext/mongobeans/ui/outline/MongoBeansOutlineTreeProvider.java) a bit.


Inferred Java Code
------------------

The generated Java code will provide:
* a Java class for each MongoBean,
* a field and a getter for the wrapped DBObject,
* two constructors to create a MongoBean from a given DBObject or from scratch,
* accessor methods for each MongoProperty delegating to the wrapped DBObject and automatically casting the result,
* a method for each MongoOperation executing the compiled Xbase body.

The mapping to Java code is defined in the [MongoBeansJvmModelInferrer](./mongoBeans/blob/master/org.eclipse.xtext.mongobeans/src/org/eclipse/xtext/mongobeans/jvmmodel/MongoBeansJvmModelInferrer.xtend). It uses a couple of helper classes from the Xtext framework to construct a model of the Java classes to be created from the MongoBeans model. It's written in Xtend, thus reducing the syntactic noise significantly compared to Java. Please consult the [Xtext documentation](http://www.eclipse.org/Xtext/documentation/2_3_0/199c-xbase-inferred-type.php) for more information on JVM model inference.

It doesn't make sense to generate exactly the same code over and over again. That's why we introduced a thin runtime library [org.eclipse.xtext.example.mongobeans.runtime](./mongoBeans/tree/master/org.eclipse.xtext.mongobeans.runtime) containing a common interface [IMongoBean](./mongoBeans/blob/master/org.eclipse.xtext.mongobeans.runtime/src/org/eclipse/xtext/mongobeans/IMongoBean.java) to access the DBObject of a MongoBean and a couple of helper classes the generated code works with.


Client Extensions
-----------------

We now have a statically typed Java API for mongoDB documents. Let's compare Java client code to its JSON counterpart:

```java
Artist john = new Artist();         // {
john.setName("John Coltrane");      //   name = "John Coltrane" 
Album album = new Album();          //   albums = [ {
album.setTitle("A Love Supreme");   //     title = "A Love Supreme"
john.getAlbums().add(album);        //   } ]
...                                 // }  
```
 
Oh no: We've sold readability for static typing! A pretty bad bargain. This is where [Xtend](http://www.xtend-lang.org) comes to our help. In Xtend, we can define extension methods that create elements, add it to a container and initialize it with a lambda expression, e.g.:

```xtend
def protected addAlbum(Artist it, (Album)=>void initializer) {
	albums += new Album => initializer
}	
```

With this extension, the construction can look like this:

```xtend
val john = new Artist => [
	name = 'John Coltrane'
	addAlbum [
		title = 'A Love Supreme'
	]
]
```

For a more elaborate example, have a look at [MusicDB.mongo](./mongoBeans/blob/master/org.eclipse.xtext.mongobeans.example/src/org/eclipse/xtext/mongobeans/example/MusicDB.mongo) and [MusicDBXtendTest](./mongoBeans/blob/master/org.eclipse.xtext.mongobeans.example/src/org/eclipse/xtext/mongobeans/example/MusicDBXtendTest.xtend).