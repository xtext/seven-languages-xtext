package org.xtext.simple.jvmmodel;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.simple.simpleExpressions.Application;

/**
 * <p>Infers a JVM model from the source model.</p>
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>
 */
@SuppressWarnings("all")
public class SimpleExpressionsJvmModelInferrer extends AbstractModelInferrer {
  @Inject
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  protected void _infer(final Application application, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(application);
    JvmGenericType _class = this._jvmTypesBuilder.toClass(application, _fullyQualifiedName);
    IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_class);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          EList<JvmMember> _members = it.getMembers();
          JvmTypeReference _newTypeRef = SimpleExpressionsJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(application, Void.TYPE);
          final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                EList<JvmFormalParameter> _parameters = it.getParameters();
                JvmTypeReference _newTypeRef = SimpleExpressionsJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(application, String.class);
                JvmTypeReference _addArrayTypeDimension = SimpleExpressionsJvmModelInferrer.this._jvmTypesBuilder.addArrayTypeDimension(_newTypeRef);
                JvmFormalParameter _parameter = SimpleExpressionsJvmModelInferrer.this._jvmTypesBuilder.toParameter(application, "args", _addArrayTypeDimension);
                SimpleExpressionsJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                it.setStatic(true);
                XBlockExpression _main = application.getMain();
                SimpleExpressionsJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _main);
              }
            };
          JvmOperation _method = SimpleExpressionsJvmModelInferrer.this._jvmTypesBuilder.toMethod(application, "main", _newTypeRef, _function);
          SimpleExpressionsJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
        }
      };
    _accept.initializeLater(_function);
  }
  
  public void infer(final EObject application, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    if (application instanceof Application) {
      _infer((Application)application, acceptor, isPreIndexingPhase);
      return;
    } else if (application != null) {
      _infer(application, acceptor, isPreIndexingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(application, acceptor, isPreIndexingPhase).toString());
    }
  }
}
