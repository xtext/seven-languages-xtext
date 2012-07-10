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
	
	@Test def testDeepThought() {
		'''
			val answer = 7 * 6;
			println(answer)
		'''.assertCompilesTo('''
			import org.eclipse.xtext.xbase.lib.InputOutput;
			
			public class __synthetic0 {
			  public static void main(final String... args) {
			    final int answer = (7 * 6);
			    InputOutput.<Integer>println(Integer.valueOf(answer));
			  }
			}
		''')
	}	
	
	@Test def testMixedImports() {
		'''
			import java.io.File
			val file = new File('test')
			
			import java.io.FileoutputStream
			val stream = new FileOutputStream(file)
			
			import java.io.*
			val buffered = new BufferedOutputStream(stream) 
		'''.assertCompilesTo('''
			import java.io.BufferedOutputStream;
			import java.io.File;
			import java.io.FileOutputStream;
			import org.eclipse.xtext.xbase.lib.Exceptions;
			
			public class __synthetic0 {
			  public static void main(final String... args) {
			    try {
			      File _file = new File("test");
			      final File file = _file;
			      FileOutputStream _fileOutputStream = new FileOutputStream(file);
			      final FileOutputStream stream = _fileOutputStream;
			      BufferedOutputStream _bufferedOutputStream = new BufferedOutputStream(stream);
			      final BufferedOutputStream buffered = _bufferedOutputStream;
			    } catch (Exception _e) {
			      throw Exceptions.sneakyThrow(_e);
			    }
			  }
			}
		''')
	}	
	
}