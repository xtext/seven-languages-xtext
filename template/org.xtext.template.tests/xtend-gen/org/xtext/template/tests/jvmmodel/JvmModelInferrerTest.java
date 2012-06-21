package org.xtext.template.tests.jvmmodel;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.parameterized.InjectParameter;
import org.eclipse.xtext.junit4.parameterized.ParameterizedXtextRunner;
import org.eclipse.xtext.junit4.parameterized.ResourceURIs;
import org.eclipse.xtext.junit4.parameterized.XpectString;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.template.TemplateInjectorProvider;
import org.xtext.template.tests.jvmmodel.JvmModelSignatureGenerator;

@InjectWith(value = TemplateInjectorProvider.class)
@RunWith(value = ParameterizedXtextRunner.class)
@ResourceURIs(baseDir = "src/org/xtext/template/tests/jvmmodel", fileExtensions = "template")
@SuppressWarnings("all")
public class JvmModelInferrerTest {
  @InjectParameter
  private XtextResource resource;
  
  @Inject
  private JvmModelSignatureGenerator signatureGenerator;
  
  @Inject
  private ValidationTestHelper validator;
  
  @Test
  public void noErrors() {
    EList<EObject> _contents = this.resource.getContents();
    EObject _get = _contents.get(0);
    this.validator.assertNoErrors(_get);
  }
  
  @XpectString
  public String javaSignatures() {
    String _xblockexpression = null;
    {
      InMemoryFileSystemAccess _inMemoryFileSystemAccess = new InMemoryFileSystemAccess();
      final InMemoryFileSystemAccess fsa = _inMemoryFileSystemAccess;
      this.signatureGenerator.doGenerate(this.resource, fsa);
      Map<String,CharSequence> _files = fsa.getFiles();
      Collection<CharSequence> _values = _files.values();
      String _join = IterableExtensions.join(_values, "\n");
      String _trim = _join.trim();
      _xblockexpression = (_trim);
    }
    return _xblockexpression;
  }
}
