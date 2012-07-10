package org.xtext.tortoiseshell.scoping;

import com.google.common.base.Objects;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.xbase.featurecalls.IdentifiableSimpleNameProvider;
import org.xtext.tortoiseshell.jvmmodel.TortoiseShellJvmModelInferrer;

@SuppressWarnings("all")
public class TortoiseShellIdentifiableSimpleNameProvider extends IdentifiableSimpleNameProvider {
  public String getSimpleName(final JvmIdentifiableElement element) {
    String _xifexpression = null;
    String _simpleName = element.getSimpleName();
    boolean _equals = Objects.equal(_simpleName, TortoiseShellJvmModelInferrer.INFERRED_CLASS_NAME);
    if (_equals) {
      _xifexpression = "this";
    } else {
      String _simpleName_1 = super.getSimpleName(element);
      _xifexpression = _simpleName_1;
    }
    return _xifexpression;
  }
}
