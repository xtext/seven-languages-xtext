/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.scripting.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.scripting.ScriptingInjectorProvider

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

			@SuppressWarnings("all")
			public class MyFile {
			  public static void main(final String[] args) {
			    final int answer = (7 * 6);
			    InputOutput.<Integer>println(Integer.valueOf(answer));
			  }
			}
		''')
	}	
	
	@Test def testMixedImports() {
		'''
			val file = new java.io.File('test')			
			val stream = new java.io.FileOutputStream(file)
			val buffered = new java.io.BufferedOutputStream(stream)
		'''.assertCompilesTo('''
			import java.io.BufferedOutputStream;
			import java.io.File;
			import java.io.FileOutputStream;
			import org.eclipse.xtext.xbase.lib.Exceptions;
			
			@SuppressWarnings("all")
			public class MyFile {
			  public static void main(final String[] args) {
			    try {
			      File _file = new File("test");
			      final File file = _file;
			      FileOutputStream _fileOutputStream = new FileOutputStream(file);
			      final FileOutputStream stream = _fileOutputStream;
			      BufferedOutputStream _bufferedOutputStream = new BufferedOutputStream(stream);
			      final BufferedOutputStream buffered = _bufferedOutputStream;
			    } catch (Throwable _e) {
			      throw Exceptions.sneakyThrow(_e);
			    }
			  }
			}
		''')
	}	
	
}