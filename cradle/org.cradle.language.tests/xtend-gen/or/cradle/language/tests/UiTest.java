package or.cradle.language.tests;

import com.google.inject.Inject;
import org.cradle.language.CradleUiInjectorProvider;
import org.cradle.language.MyInterface;
import org.cradle.language.MyInterface.ImplB;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(value = XtextRunner.class)
@InjectWith(value = CradleUiInjectorProvider.class)
@SuppressWarnings("all")
public class UiTest {
  @Inject
  private MyInterface interf;
  
  @Test
  public void simpleTest() {
    Assert.assertTrue((this.interf instanceof ImplB));
  }
}
