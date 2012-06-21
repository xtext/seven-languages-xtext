package org.xtext.template.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.compiler.TypeReferenceSerializer;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.xtext.template.jvmmodel.ExpCtx;
import org.xtext.template.jvmmodel.StmtCtx;
import org.xtext.template.template.BlockStmt;
import org.xtext.template.template.ExpressionStmt;
import org.xtext.template.template.ForStmt;
import org.xtext.template.template.IfStmt;
import org.xtext.template.template.IfStmtBody;
import org.xtext.template.template.Parameter;
import org.xtext.template.template.TemplateFile;
import org.xtext.template.template.TextStmt;

/**
 * <p>Infers a JVM model from the source model.</p>
 */
@SuppressWarnings("all")
public class TemplateJvmModelInferrer extends AbstractModelInferrer {
  @Inject
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  private TypeReferences _typeReferences;
  
  @Inject
  private TypeReferenceSerializer _typeReferenceSerializer;
  
  @Inject
  private ITypeProvider _iTypeProvider;
  
  protected void _infer(final TemplateFile element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    Resource _eResource = element.eResource();
    URI _uRI = _eResource.getURI();
    URI _trimFileExtension = _uRI.trimFileExtension();
    final String simpleName = _trimFileExtension.lastSegment();
    String _xifexpression = null;
    String _package = element.getPackage();
    boolean _notEquals = (!Objects.equal(_package, null));
    if (_notEquals) {
      String _package_1 = element.getPackage();
      String _plus = (_package_1 + ".");
      String _plus_1 = (_plus + simpleName);
      _xifexpression = _plus_1;
    } else {
      _xifexpression = simpleName;
    }
    final String qualifiedName = _xifexpression;
    final JvmGenericType root = this._jvmTypesBuilder.toClass(element, qualifiedName);
    IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(root);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          EList<Parameter> _params = element.getParams();
          for (final Parameter p : _params) {
            {
              String _name = p.getName();
              JvmTypeReference _type = p.getType();
              XExpression _defaultexp = p.getDefaultexp();
              JvmTypeReference _type_1 = TemplateJvmModelInferrer.this._iTypeProvider.getType(_defaultexp);
              JvmTypeReference _elvis = ObjectExtensions.<JvmTypeReference>operator_elvis(_type, _type_1);
              final JvmField field = TemplateJvmModelInferrer.this._jvmTypesBuilder.toField(p, _name, _elvis);
              XExpression _defaultexp_1 = p.getDefaultexp();
              boolean _notEquals = (!Objects.equal(_defaultexp_1, null));
              if (_notEquals) {
                XExpression _defaultexp_2 = p.getDefaultexp();
                TemplateJvmModelInferrer.this._jvmTypesBuilder.setInitializer(field, _defaultexp_2);
              }
              EList<JvmMember> _members = it.getMembers();
              TemplateJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members, field);
            }
          }
          EList<JvmMember> _members = it.getMembers();
          final Procedure1<JvmConstructor> _function = new Procedure1<JvmConstructor>() {
              public void apply(final JvmConstructor it) {
              }
            };
          JvmConstructor _constructor = TemplateJvmModelInferrer.this._jvmTypesBuilder.toConstructor(element, _function);
          TemplateJvmModelInferrer.this._jvmTypesBuilder.<JvmConstructor>operator_add(_members, _constructor);
          EList<JvmMember> _members_1 = it.getMembers();
          final Procedure1<JvmConstructor> _function_1 = new Procedure1<JvmConstructor>() {
              public void apply(final JvmConstructor it) {
                EList<JvmFormalParameter> _parameters = it.getParameters();
                JvmTypeReference _newTypeRef = TemplateJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(root);
                JvmFormalParameter _parameter = TemplateJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "other", _newTypeRef);
                TemplateJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                EList<Parameter> _params = element.getParams();
                boolean _isEmpty = _params.isEmpty();
                boolean _not = (!_isEmpty);
                if (_not) {
                  final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                      public void apply(final ITreeAppendable it) {
                        EList<Parameter> _params = element.getParams();
                        for (final Parameter p : _params) {
                          {
                            EList<Parameter> _params_1 = element.getParams();
                            Parameter _head = IterableExtensions.<Parameter>head(_params_1);
                            boolean _notEquals = (!Objects.equal(p, _head));
                            if (_notEquals) {
                              it.newLine();
                            }
                            StringConcatenation _builder = new StringConcatenation();
                            _builder.append("this.");
                            String _name = p.getName();
                            _builder.append(_name, "");
                            _builder.append(" = other.");
                            String _name_1 = p.getName();
                            _builder.append(_name_1, "");
                            _builder.append(";");
                            it.append(_builder);
                          }
                        }
                      }
                    };
                  TemplateJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
                }
              }
            };
          JvmConstructor _constructor_1 = TemplateJvmModelInferrer.this._jvmTypesBuilder.toConstructor(element, _function_1);
          TemplateJvmModelInferrer.this._jvmTypesBuilder.<JvmConstructor>operator_add(_members_1, _constructor_1);
          final HashMap<XExpression,String> expr2call = CollectionLiterals.<XExpression, String>newHashMap();
          TreeIterator<EObject> _eAllContents = element.eAllContents();
          Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_eAllContents);
          for (final EObject expr : _iterable) {
            EList<JvmMember> _members_2 = it.getMembers();
            ExpCtx _expCtx = new ExpCtx(_members_2, expr2call);
            TemplateJvmModelInferrer.this.genExpression(_expCtx, expr);
          }
          EList<JvmMember> _members_3 = it.getMembers();
          JvmTypeReference _newTypeRef = TemplateJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, String.class);
          final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                    public void apply(final ITreeAppendable it) {
                      final JvmType type = TemplateJvmModelInferrer.this._typeReferences.findDeclaredType(StringBuilder.class, element);
                      it.append(type);
                      it.append(" out = new ");
                      it.append(type);
                      it.append("();");
                      it.newLine();
                      StmtCtx _stmtCtx = new StmtCtx(it, expr2call);
                      BlockStmt _body = element.getBody();
                      TemplateJvmModelInferrer.this.genStatement(_stmtCtx, _body);
                      it.newLine();
                      it.append("return out.toString();");
                    }
                  };
                TemplateJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
              }
            };
          JvmOperation _method = TemplateJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "generate", _newTypeRef, _function_2);
          TemplateJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_3, _method);
          EList<JvmMember> _members_4 = it.getMembers();
          JvmTypeReference _newTypeRef_1 = TemplateJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, String.class);
          final Procedure1<JvmOperation> _function_3 = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                EList<JvmFormalParameter> _parameters = it.getParameters();
                JvmTypeReference _newTypeRef = TemplateJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(root);
                JvmTypeReference _newTypeRef_1 = TemplateJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, Procedure1.class, _newTypeRef);
                JvmFormalParameter _parameter = TemplateJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "init", _newTypeRef_1);
                TemplateJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                    public void apply(final ITreeAppendable it) {
                      ITreeAppendable _append = it.append("try {");
                      ITreeAppendable _increaseIndentation = _append.increaseIndentation();
                      _increaseIndentation.newLine();
                      it.append(root);
                      ITreeAppendable _append_1 = it.append(" tpl = getClass().getConstructor(getClass()).newInstance(this);");
                      _append_1.newLine();
                      ITreeAppendable _append_2 = it.append("init.apply(tpl);");
                      _append_2.newLine();
                      it.append("return tpl.generate();");
                      ITreeAppendable _decreaseIndentation = it.decreaseIndentation();
                      ITreeAppendable _newLine = _decreaseIndentation.newLine();
                      ITreeAppendable _append_3 = _newLine.append("} catch(Exception e) {");
                      ITreeAppendable _increaseIndentation_1 = _append_3.increaseIndentation();
                      _increaseIndentation_1.newLine();
                      it.append("throw ");
                      JvmType _findDeclaredType = TemplateJvmModelInferrer.this._typeReferences.findDeclaredType(Exceptions.class, element);
                      it.append(_findDeclaredType);
                      it.append(".sneakyThrow(e);");
                      ITreeAppendable _decreaseIndentation_1 = it.decreaseIndentation();
                      ITreeAppendable _newLine_1 = _decreaseIndentation_1.newLine();
                      _newLine_1.append("}");
                    }
                  };
                TemplateJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
              }
            };
          JvmOperation _method_1 = TemplateJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "generate", _newTypeRef_1, _function_3);
          TemplateJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_4, _method_1);
          EList<Parameter> _params_1 = element.getParams();
          for (final Parameter p_1 : _params_1) {
            {
              String _name = p_1.getName();
              String _firstUpper = StringExtensions.toFirstUpper(_name);
              String _plus = ("set" + _firstUpper);
              JvmTypeReference _newTypeRef_2 = TemplateJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, Void.TYPE);
              final Procedure1<JvmOperation> _function_4 = new Procedure1<JvmOperation>() {
                  public void apply(final JvmOperation it) {
                    EList<JvmFormalParameter> _parameters = it.getParameters();
                    String _name = p_1.getName();
                    JvmTypeReference _type = p_1.getType();
                    XExpression _defaultexp = p_1.getDefaultexp();
                    JvmTypeReference _type_1 = TemplateJvmModelInferrer.this._iTypeProvider.getType(_defaultexp);
                    JvmTypeReference _elvis = ObjectExtensions.<JvmTypeReference>operator_elvis(_type, _type_1);
                    JvmFormalParameter _parameter = TemplateJvmModelInferrer.this._jvmTypesBuilder.toParameter(p_1, _name, _elvis);
                    TemplateJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                    final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                        public void apply(final ITreeAppendable it) {
                          StringConcatenation _builder = new StringConcatenation();
                          _builder.append("this.");
                          String _name = p_1.getName();
                          _builder.append(_name, "");
                          _builder.append(" = ");
                          String _name_1 = p_1.getName();
                          _builder.append(_name_1, "");
                          _builder.append(";");
                          it.append(_builder);
                        }
                      };
                    TemplateJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
                  }
                };
              final JvmOperation method = TemplateJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, _plus, _newTypeRef_2, _function_4);
              EList<XAnnotation> _annotations = p_1.getAnnotations();
              TemplateJvmModelInferrer.this._jvmTypesBuilder.translateAnnotationsTo(_annotations, method);
              EList<JvmMember> _members_5 = it.getMembers();
              TemplateJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_5, method);
            }
          }
          EList<JvmMember> _members_5 = it.getMembers();
          JvmTypeReference _newTypeRef_2 = TemplateJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, String.class);
          final Procedure1<JvmOperation> _function_4 = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                    public void apply(final ITreeAppendable it) {
                      final JvmType type = TemplateJvmModelInferrer.this._typeReferences.findDeclaredType(ToStringHelper.class, element);
                      it.append("return new ");
                      it.append(type);
                      it.append("().toString(this);");
                    }
                  };
                TemplateJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
              }
            };
          JvmOperation _method_2 = TemplateJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "toString", _newTypeRef_2, _function_4);
          TemplateJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_5, _method_2);
        }
      };
    _accept.initializeLater(_function);
  }
  
  public Iterable<ForStmt> getAllParameters(final EObject exp) {
    Iterable<ForStmt> _xblockexpression = null;
    {
      final EObject cnt = exp.eContainer();
      Iterable<ForStmt> _switchResult = null;
      boolean _matched = false;
      if (!_matched) {
        if (cnt instanceof TemplateFile) {
          final TemplateFile _templateFile = (TemplateFile)cnt;
          _matched=true;
          List<ForStmt> _emptyList = CollectionLiterals.<ForStmt>emptyList();
          _switchResult = _emptyList;
        }
      }
      if (!_matched) {
        if (cnt instanceof ForStmt) {
          final ForStmt _forStmt = (ForStmt)cnt;
          XExpression _source = _forStmt.getSource();
          boolean _notEquals = (!Objects.equal(_source, exp));
          if (_notEquals) {
            _matched=true;
            Iterable<ForStmt> _allParameters = this.getAllParameters(_forStmt);
            ArrayList<ForStmt> _newArrayList = CollectionLiterals.<ForStmt>newArrayList(_forStmt);
            Iterable<ForStmt> _plus = Iterables.<ForStmt>concat(_allParameters, _newArrayList);
            _switchResult = _plus;
          }
        }
      }
      if (!_matched) {
        Iterable<ForStmt> _allParameters = this.getAllParameters(cnt);
        _switchResult = _allParameters;
      }
      _xblockexpression = (_switchResult);
    }
    return _xblockexpression;
  }
  
  protected void _genStatement(final StmtCtx it, final BlockStmt blockStmt) {
    EList<EObject> _statements = blockStmt.getStatements();
    for (final EObject s : _statements) {
      {
        EList<EObject> _statements_1 = blockStmt.getStatements();
        EObject _head = IterableExtensions.<EObject>head(_statements_1);
        boolean _notEquals = (!Objects.equal(s, _head));
        if (_notEquals) {
          ITreeAppendable _out = it.getOut();
          _out.newLine();
        }
        this.genStatement(it, s);
      }
    }
  }
  
  protected void _genStatement(final StmtCtx it, final TextStmt textStmt) {
    ITreeAppendable _out = it.getOut();
    _out.append("out.append(\"");
    ITreeAppendable _out_1 = it.getOut();
    String _text = textStmt.getText();
    String _replace = _text.replace("\n", "\\n");
    String _replace_1 = _replace.replace("\r", "\\r");
    String _replace_2 = _replace_1.replace("\"", "\\\"");
    _out_1.append(_replace_2);
    ITreeAppendable _out_2 = it.getOut();
    _out_2.append("\");");
  }
  
  protected void _genStatement(final StmtCtx it, final ExpressionStmt exprStmt) {
    ITreeAppendable _out = it.getOut();
    _out.append("out.append(");
    ITreeAppendable _out_1 = it.getOut();
    Map<XExpression,String> _expr2call = it.getExpr2call();
    XExpression _body = exprStmt.getBody();
    String _get = _expr2call.get(_body);
    _out_1.append(_get);
    ITreeAppendable _out_2 = it.getOut();
    _out_2.append(");");
  }
  
  protected void _genStatement(final StmtCtx it, final IfStmt ifStmt) {
    EList<IfStmtBody> _ifbodies = ifStmt.getIfbodies();
    for (final IfStmtBody body : _ifbodies) {
      {
        EList<IfStmtBody> _ifbodies_1 = ifStmt.getIfbodies();
        IfStmtBody _head = IterableExtensions.<IfStmtBody>head(_ifbodies_1);
        boolean _notEquals = (!Objects.equal(body, _head));
        if (_notEquals) {
          ITreeAppendable _out = it.getOut();
          _out.append(" else ");
        }
        ITreeAppendable _out_1 = it.getOut();
        _out_1.append("if(");
        ITreeAppendable _out_2 = it.getOut();
        Map<XExpression,String> _expr2call = it.getExpr2call();
        XExpression _condition = body.getCondition();
        String _get = _expr2call.get(_condition);
        _out_2.append(_get);
        ITreeAppendable _out_3 = it.getOut();
        _out_3.append(") {");
        ITreeAppendable _out_4 = it.getOut();
        ITreeAppendable _increaseIndentation = _out_4.increaseIndentation();
        _increaseIndentation.newLine();
        BlockStmt _body = body.getBody();
        this.genStatement(it, _body);
        ITreeAppendable _out_5 = it.getOut();
        ITreeAppendable _decreaseIndentation = _out_5.decreaseIndentation();
        _decreaseIndentation.newLine();
        ITreeAppendable _out_6 = it.getOut();
        _out_6.append("}");
      }
    }
    BlockStmt _elsebody = ifStmt.getElsebody();
    boolean _notEquals = (!Objects.equal(_elsebody, null));
    if (_notEquals) {
      ITreeAppendable _out = it.getOut();
      _out.append(" else {");
      ITreeAppendable _out_1 = it.getOut();
      ITreeAppendable _increaseIndentation = _out_1.increaseIndentation();
      _increaseIndentation.newLine();
      BlockStmt _elsebody_1 = ifStmt.getElsebody();
      this.genStatement(it, _elsebody_1);
      ITreeAppendable _out_2 = it.getOut();
      ITreeAppendable _decreaseIndentation = _out_2.decreaseIndentation();
      _decreaseIndentation.newLine();
      ITreeAppendable _out_3 = it.getOut();
      _out_3.append("}");
    }
  }
  
  protected void _genStatement(final StmtCtx it, final ForStmt forStmt) {
    ITreeAppendable _out = it.getOut();
    _out.append("for(");
    JvmTypeReference _parameterType = this.getParameterType(forStmt);
    ITreeAppendable _out_1 = it.getOut();
    this._typeReferenceSerializer.serialize(_parameterType, forStmt, _out_1);
    ITreeAppendable _out_2 = it.getOut();
    _out_2.append(" ");
    ITreeAppendable _out_3 = it.getOut();
    JvmFormalParameter _param = forStmt.getParam();
    String _name = _param.getName();
    _out_3.append(_name);
    ITreeAppendable _out_4 = it.getOut();
    _out_4.append(" : ");
    ITreeAppendable _out_5 = it.getOut();
    Map<XExpression,String> _expr2call = it.getExpr2call();
    XExpression _source = forStmt.getSource();
    String _get = _expr2call.get(_source);
    _out_5.append(_get);
    ITreeAppendable _out_6 = it.getOut();
    _out_6.append(") {");
    ITreeAppendable _out_7 = it.getOut();
    _out_7.increaseIndentation();
    ITreeAppendable _out_8 = it.getOut();
    _out_8.newLine();
    BlockStmt _body = forStmt.getBody();
    this.genStatement(it, _body);
    ITreeAppendable _out_9 = it.getOut();
    _out_9.decreaseIndentation();
    ITreeAppendable _out_10 = it.getOut();
    _out_10.newLine();
    ITreeAppendable _out_11 = it.getOut();
    _out_11.append("}");
  }
  
  protected void _genExpression(final ExpCtx it, final ForStmt forStmt) {
    XExpression _source = forStmt.getSource();
    JvmTypeReference _parameterType = this.getParameterType(forStmt);
    JvmWildcardTypeReference _wildCardExtends = this._typeReferences.wildCardExtends(_parameterType);
    JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(forStmt, Iterable.class, _wildCardExtends);
    this.genExpression(it, "loop", _source, _newTypeRef);
  }
  
  protected void _genExpression(final ExpCtx it, final IfStmtBody ifStmt) {
    XExpression _condition = ifStmt.getCondition();
    JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(ifStmt, Boolean.TYPE);
    this.genExpression(it, "cond", _condition, _newTypeRef);
  }
  
  protected void _genExpression(final ExpCtx it, final ExpressionStmt expStmt) {
    XExpression _body = expStmt.getBody();
    JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(expStmt, Object.class);
    this.genExpression(it, "exp", _body, _newTypeRef);
  }
  
  protected void _genExpression(final ExpCtx it, final EObject expStmt) {
  }
  
  public String genExpression(final ExpCtx it, final String prefix, final XExpression exp, final JvmTypeReference type) {
    String _xblockexpression = null;
    {
      List<JvmMember> _members = it.getMembers();
      final String name = this.newMemberName(_members, prefix);
      final Iterable<ForStmt> params = this.getAllParameters(exp);
      List<JvmMember> _members_1 = it.getMembers();
      final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            it.setVisibility(JvmVisibility.PRIVATE);
            for (final ForStmt p : params) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmFormalParameter _param = p.getParam();
              String _name = _param.getName();
              JvmTypeReference _parameterType = TemplateJvmModelInferrer.this.getParameterType(p);
              JvmFormalParameter _parameter = TemplateJvmModelInferrer.this._jvmTypesBuilder.toParameter(exp, _name, _parameterType);
              TemplateJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            }
            TemplateJvmModelInferrer.this._jvmTypesBuilder.setBody(it, exp);
          }
        };
      JvmOperation _method = this._jvmTypesBuilder.toMethod(exp, name, type, _function);
      _members_1.add(_method);
      Map<XExpression,String> _expr2call = it.getExpr2call();
      String _plus = (name + "(");
      final Function1<ForStmt,String> _function_1 = new Function1<ForStmt,String>() {
          public String apply(final ForStmt it) {
            JvmFormalParameter _param = it.getParam();
            String _name = _param.getName();
            return _name;
          }
        };
      Iterable<String> _map = IterableExtensions.<ForStmt, String>map(params, _function_1);
      String _join = IterableExtensions.join(_map, ", ");
      String _plus_1 = (_plus + _join);
      String _plus_2 = (_plus_1 + ")");
      String _put = _expr2call.put(exp, _plus_2);
      _xblockexpression = (_put);
    }
    return _xblockexpression;
  }
  
  public String newMemberName(final List<JvmMember> members, final String prefix) {
    String _xblockexpression = null;
    {
      final Function1<JvmMember,String> _function = new Function1<JvmMember,String>() {
          public String apply(final JvmMember it) {
            String _simpleName = it.getSimpleName();
            return _simpleName;
          }
        };
      List<String> _map = ListExtensions.<JvmMember, String>map(members, _function);
      final Set<String> names = IterableExtensions.<String>toSet(_map);
      IntegerRange _upTo = new IntegerRange(0, Integer.MAX_VALUE);
      final Function1<Integer,Boolean> _function_1 = new Function1<Integer,Boolean>() {
          public Boolean apply(final Integer it) {
            String _plus = (prefix + it);
            boolean _contains = names.contains(_plus);
            boolean _not = (!_contains);
            return Boolean.valueOf(_not);
          }
        };
      Integer _findFirst = IterableExtensions.<Integer>findFirst(_upTo, _function_1);
      String _plus = (prefix + _findFirst);
      _xblockexpression = (_plus);
    }
    return _xblockexpression;
  }
  
  public JvmTypeReference getParameterType(final ForStmt stmt) {
    JvmTypeReference _xifexpression = null;
    JvmFormalParameter _param = stmt.getParam();
    JvmTypeReference _parameterType = _param.getParameterType();
    boolean _notEquals = (!Objects.equal(_parameterType, null));
    if (_notEquals) {
      JvmFormalParameter _param_1 = stmt.getParam();
      JvmTypeReference _parameterType_1 = _param_1.getParameterType();
      JvmTypeReference _copy = EcoreUtil.<JvmTypeReference>copy(_parameterType_1);
      _xifexpression = _copy;
    } else {
      JvmTypeReference _xblockexpression = null;
      {
        XExpression _source = stmt.getSource();
        final JvmTypeReference type = this._iTypeProvider.getType(_source);
        JvmTypeReference _xifexpression_1 = null;
        if ((type instanceof JvmParameterizedTypeReference)) {
          EList<JvmTypeReference> _arguments = ((JvmParameterizedTypeReference) type).getArguments();
          JvmTypeReference _get = _arguments.get(0);
          _xifexpression_1 = _get;
        } else {
          JvmTypeReference _xblockexpression_1 = null;
          {
            String _plus = ("invalid for-expression-type: " + type);
            InputOutput.<String>println(_plus);
            _xblockexpression_1 = (((JvmTypeReference) null));
          }
          _xifexpression_1 = _xblockexpression_1;
        }
        _xblockexpression = (_xifexpression_1);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  public void infer(final EObject element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    if (element instanceof TemplateFile) {
      _infer((TemplateFile)element, acceptor, isPreIndexingPhase);
      return;
    } else if (element != null) {
      _infer(element, acceptor, isPreIndexingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(element, acceptor, isPreIndexingPhase).toString());
    }
  }
  
  public void genStatement(final StmtCtx it, final EObject forStmt) {
    if (forStmt instanceof ForStmt) {
      _genStatement(it, (ForStmt)forStmt);
      return;
    } else if (forStmt instanceof IfStmt) {
      _genStatement(it, (IfStmt)forStmt);
      return;
    } else if (forStmt instanceof BlockStmt) {
      _genStatement(it, (BlockStmt)forStmt);
      return;
    } else if (forStmt instanceof ExpressionStmt) {
      _genStatement(it, (ExpressionStmt)forStmt);
      return;
    } else if (forStmt instanceof TextStmt) {
      _genStatement(it, (TextStmt)forStmt);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it, forStmt).toString());
    }
  }
  
  public void genExpression(final ExpCtx it, final EObject forStmt) {
    if (forStmt instanceof ForStmt) {
      _genExpression(it, (ForStmt)forStmt);
      return;
    } else if (forStmt instanceof ExpressionStmt) {
      _genExpression(it, (ExpressionStmt)forStmt);
      return;
    } else if (forStmt instanceof IfStmtBody) {
      _genExpression(it, (IfStmtBody)forStmt);
      return;
    } else if (forStmt != null) {
      _genExpression(it, forStmt);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it, forStmt).toString());
    }
  }
}
