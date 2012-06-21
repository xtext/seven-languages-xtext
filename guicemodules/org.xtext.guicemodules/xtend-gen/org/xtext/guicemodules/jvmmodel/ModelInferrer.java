package org.xtext.guicemodules.jvmmodel;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmExecutable;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.compiler.TypeReferenceSerializer;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.compiler.output.TreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.guicemodules.jvmmodel.CodeGenerationContext;

@SuppressWarnings("all")
public class ModelInferrer extends AbstractModelInferrer {
  @Inject
  private TypeReferences _typeReferences;
  
  @Inject
  private TypeReferenceSerializer serializer;
  
  @Inject
  private JvmTypesBuilder _jvmTypesBuilder;
  
  public Procedure1<? super ITreeAppendable> body(final JvmExecutable exec, final Function1<? super CodeGenerationContext,? extends String> strategy) {
    final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
        public void apply(final ITreeAppendable it) {
          CodeGenerationContext _codeGenerationContext = new CodeGenerationContext(exec, ((TreeAppendable) it), ModelInferrer.this.serializer, ModelInferrer.this._typeReferences);
          String _apply = strategy.apply(_codeGenerationContext);
          it.append(_apply);
        }
      };
    return _function;
  }
  
  public JvmTypeReference type(final EObject ctx, final String qn, final JvmTypeReference... args) {
    JvmTypeReference _typeForName = this._typeReferences.getTypeForName(qn, ctx, args);
    return _typeForName;
  }
  
  public void parameters(final JvmExecutable container, final Pair<String,String> typeAndName) {
    String _key = typeAndName.getKey();
    final JvmTypeReference typeRef = this.type(container, _key);
    String _value = typeAndName.getValue();
    final JvmFormalParameter param = this._jvmTypesBuilder.toParameter(container, _value, typeRef);
    EList<JvmFormalParameter> _parameters = container.getParameters();
    this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, param);
  }
  
  public JvmWildcardTypeReference wildcard() {
    JvmWildcardTypeReference _wildCard = this._typeReferences.wildCard();
    return _wildCard;
  }
}
