package org.xtext.template.tests.jvmmodel;

import com.google.common.base.Objects;
import java.util.Arrays;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmExecutable;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;

@SuppressWarnings("all")
public class JvmModelSignatureGenerator extends JvmModelGenerator {
  public void generateExecutableBody(final JvmExecutable op, final ITreeAppendable appendable) {
    appendable.append("{...}");
  }
  
  protected boolean _generateMember(final JvmField it, final ITreeAppendable appendable, final boolean first) {
    boolean _xifexpression = false;
    JvmVisibility _visibility = it.getVisibility();
    boolean _notEquals = (!Objects.equal(_visibility, JvmVisibility.PRIVATE));
    if (_notEquals) {
      boolean __generateMember = super._generateMember(it, appendable, first);
      _xifexpression = __generateMember;
    }
    return _xifexpression;
  }
  
  protected boolean _generateMember(final JvmOperation it, final ITreeAppendable appendable, final boolean first) {
    boolean _xifexpression = false;
    JvmVisibility _visibility = it.getVisibility();
    boolean _notEquals = (!Objects.equal(_visibility, JvmVisibility.PRIVATE));
    if (_notEquals) {
      boolean __generateMember = super._generateMember(it, appendable, first);
      _xifexpression = __generateMember;
    }
    return _xifexpression;
  }
  
  public boolean generateMember(final JvmMember it, final ITreeAppendable appendable, final boolean first) {
    if (it instanceof JvmConstructor) {
      return _generateMember((JvmConstructor)it, appendable, first);
    } else if (it instanceof JvmGenericType) {
      return _generateMember((JvmGenericType)it, appendable, first);
    } else if (it instanceof JvmOperation) {
      return _generateMember((JvmOperation)it, appendable, first);
    } else if (it instanceof JvmField) {
      return _generateMember((JvmField)it, appendable, first);
    } else if (it != null) {
      return _generateMember(it, appendable, first);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it, appendable, first).toString());
    }
  }
}
