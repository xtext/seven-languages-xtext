package org.xtext.scripting.tests

import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.xtext.scripting.ScriptingInjectorProvider
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper
import com.google.inject.Inject
import org.junit.Test

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(ScriptingInjectorProvider))
class CompilationTest {

	@Inject extension CompilationTestHelper
	
	@Test def testHelloWorld() {
		'''
			script sample.HelloWorld

			println('Hello World!')
		'''.assertCompilesTo('''
			package sample;
			
			import org.eclipse.xtext.xbase.lib.InputOutput;
			
			public class HelloWorld {
			  public static void main(final String... args) {
			    InputOutput.<String>println("Hello World!");
			  }
			}
		''')
	}	
	
	@Test def testDeepThought() {
		'''
			script sample.DeepThought
			val answer = 7 * 6;
			println(answer)
		'''.assertCompilesTo('''
			package sample;
			
			import org.eclipse.xtext.xbase.lib.InputOutput;
			
			public class DeepThought {
			  public static void main(final String... args) {
			    final int answer = (7 * 6);
			    InputOutput.<Integer>println(Integer.valueOf(answer));
			  }
			}
		''')
	}	
	
}