package or.cradle.language.tests

import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Test
import org.eclipse.xtext.junit4.InjectWith
import org.cradle.language.CradleUiInjectorProvider
import com.google.inject.Inject
import org.cradle.language.MyInterface

import static org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(CradleUiInjectorProvider))
class UiTest {
	
	@Inject MyInterface interf
	
	@Test def simpleTest() {
		assertTrue(interf instanceof MyInterface$ImplB)
	}
	
}