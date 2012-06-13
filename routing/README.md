HttpRouting
===========

A small Xtext-based DSL to define HttpRoutes with full support of expressions.

There are several different frameworks out there to support HttpRoutes like [Play](https://github.com/playframework/Play20/wiki/ScalaRouting). 
Normally routes are defined in a special format is a separated file. In most of the cases there is no tooling except a normal text/XML editor. The only way to decide which route matches is the URL with different wildcards and placeholders. 
The order of the routes defined in the file is important to decide which matches first. There is no support to access parts of the URL while the mapping is done.

In most of the cases you might want to have full control via expressions to decide which action should be called. 

In this project, we have created a small DSL base on [Xtext](http://www.xtext.org) that allows to create routing with full support of expressions and access to the URL while the routing is done. 
The result is a javax.servlet.http.HttpServlet that has methods for the different routes with optional conditions and [Guice](http://code.google.com/p/google-guice/) bindings. Depending on the order in the file, the pattern and the conditions the respective method is called. 
Eventually, we do only have a single javax.servlet.http.HttpServlet containing the logic for routing implemented in Java. 

Running the example
--------------------

You'll need [Eclipse 3.5 or higher](http://www.eclipse.org/download), [Xtext 2.3](http://www.xtext.org) and [Xtend 2.3](http://www.xtend-lang.org). The Servelet-API on the class path of your project.

The DSL
--------------------

To define routes you'll have to create a file with the extension '.route'.

The first part of a route defines the type of the route and the pattern.

GET /client/foo/:id/bar/:rest*

- :id means a placeholder for a word
- :rest* means match everything to the rest of the url

Then you have the possibility to define a condition like:

GET /client/foo/:id/bar/:rest* when id == "42" and rest == "xtext/rocks"

Here you have access to id and rest statically typed to String. The servlet will provide the value of the placeholder or wildcard when the mapping takes place.

An optional annotated Guice-key could be used after the condition or pattern to get an instance of that type/interface and trigger an operation. 

GET /client/foo/:id/bar/:rest* when id == "42" and rest == "xtext/rocks" ActionClass->doSomething(Integer::parseInt(id))  

You'll see that there is access to all features of the bound type/interface with access to the placeholders or wildcard values from the URL.

If you want to call static methods there is no need for a Guice-key. 

GET /client/foo/:id/bar/:rest* when id == "42" and rest == "xtext/rocks" ActionClass::doSomethingStatic(id)

The complete grammar can be found [here](./HttpRouting/blob/master/org.xtext.httprouting/src/org/xtext/httprouting/Route.xtext).  
 
Inferred Java Code
------------------
The mapping to Java code is defined in the [RouteJvmModelInferrer](./HttpRouting/blob/master/org.xtext.httprouting/src/org/xtext/httprouting/jvmmodel/RouteJvmModelInferrer.xtend). It uses a couple of helper classes from the Xtext framework to construct a model of the Java classes to be created from the Route model. It's written in Xtend, thus reducing the syntactic noise significantly compared to Java. Please consult the [Xtext documentation](http://www.eclipse.org/Xtext/documentation/2_3_0/199c-xbase-inferred-type.php) for more information on JVM model inference.

For a more elaborate example, have a look at [RouteExample.route](./HttpRouting/blob/master/org.xtext.httprouting.example/src/RouteExample.route).





