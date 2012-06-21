package org.xtext.guicemodules.tests

import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.InjectWith
import org.xtext.guicemodules.GuiceModulesInjectorProvider
import org.junit.Test
import com.google.inject.Inject
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper
import com.google.inject.Module
import com.google.inject.Guice
import java.util.Collection

import static org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(GuiceModulesInjectorProvider))
class ParserTest {
  
  @Inject extension CompilationTestHelper
  
  @Test def void testSimple() {
    '''
      import java.util.*
      foo.bar.MyModule {
        bind List<String> to-instance newArrayList('one','two')
        bind Collection to List<String>
      }
    '''.compile[
      val module = compiledClass.newInstance as Module
      val col = Guice::createInjector(module).getInstance(typeof(Collection))
      assertEquals('one', col.head)
    ]
  }
}