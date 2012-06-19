package org.xtext.httprouting.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmAnnotationTarget;
import org.eclipse.xtext.common.types.JvmAnnotationType;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVoid;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.httprouting.route.Condition;
import org.xtext.httprouting.route.Key;
import org.xtext.httprouting.route.Model;
import org.xtext.httprouting.route.Route;
import org.xtext.httprouting.route.Type;
import org.xtext.httprouting.route.URL;
import org.xtext.httprouting.route.Variable;

/**
 * @author Holger Schill - Initial contribution and API
 */
@SuppressWarnings("all")
public class RouteJvmModelInferrer extends AbstractModelInferrer {
  private static String REQUEST = "javax.servlet.http.HttpServletRequest";
  
  @Inject
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  protected TypesFactory typesFactory;
  
  public String nameOfRouteMethod(final Route route, final int i) {
    Type _type = route.getType();
    String _literal = _type.getLiteral();
    String _lowerCase = _literal.toLowerCase();
    String _firstUpper = StringExtensions.toFirstUpper(_lowerCase);
    String _plus = ("_do" + _firstUpper);
    String _plus_1 = (_plus + Integer.valueOf(i));
    return _plus_1;
  }
  
  protected void _infer(final Model model, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    JvmGenericType _class = this._jvmTypesBuilder.toClass(model, "org.xtext.httpRouting.HttpMapperServlet");
    IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_class);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          EList<JvmTypeReference> _superTypes = it.getSuperTypes();
          JvmTypeReference _newTypeRef = RouteJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(model, "javax.servlet.http.HttpServlet");
          RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _newTypeRef);
          EList<JvmMember> _members = it.getMembers();
          JvmTypeReference _newTypeRef_1 = RouteJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(model, "long");
          final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
              public void apply(final JvmField it) {
                it.setStatic(true);
                it.setFinal(true);
                final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                    public void apply(final ITreeAppendable it) {
                      StringConcatenation _builder = new StringConcatenation();
                      _builder.append("1L");
                      it.append(_builder);
                    }
                  };
                RouteJvmModelInferrer.this._jvmTypesBuilder.setInitializer(it, _function);
              }
            };
          JvmField _field = RouteJvmModelInferrer.this._jvmTypesBuilder.toField(model, "serialVersionUID", _newTypeRef_1, _function);
          RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members, _field);
          int i = 0;
          final EList<Route> routes = model.getRoutes();
          for (final Route route : routes) {
            {
              URL _url = route.getUrl();
              boolean _notEquals = (!Objects.equal(_url, null));
              if (_notEquals) {
                final String name = RouteJvmModelInferrer.this.nameOfRouteMethod(route, i);
                EList<JvmMember> _members_1 = it.getMembers();
                JvmTypeReference _newTypeRef_2 = RouteJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(model, Void.TYPE);
                final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
                    public void apply(final JvmOperation it) {
                      String _documentation = RouteJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(route);
                      RouteJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
                      boolean _isValidKey = RouteJvmModelInferrer.this.isValidKey(route);
                      if (_isValidKey) {
                        EList<JvmFormalParameter> _parameters = it.getParameters();
                        Key _key = route.getKey();
                        Key _key_1 = route.getKey();
                        JvmTypeReference _type = _key_1.getType();
                        JvmFormalParameter _parameter = RouteJvmModelInferrer.this._jvmTypesBuilder.toParameter(_key, "it", _type);
                        RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                      }
                      EList<JvmFormalParameter> _parameters_1 = it.getParameters();
                      JvmTypeReference _newTypeRef = RouteJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(model, RouteJvmModelInferrer.REQUEST);
                      JvmFormalParameter _parameter_1 = RouteJvmModelInferrer.this._jvmTypesBuilder.toParameter(model, "request", _newTypeRef);
                      RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
                      URL _url = route.getUrl();
                      EList<Variable> _variables = _url.getVariables();
                      for (final Variable variable : _variables) {
                        EList<JvmFormalParameter> _parameters_2 = it.getParameters();
                        String _name = variable.getName();
                        JvmTypeReference _newTypeRef_1 = RouteJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(model, String.class);
                        JvmFormalParameter _parameter_2 = RouteJvmModelInferrer.this._jvmTypesBuilder.toParameter(variable, _name, _newTypeRef_1);
                        RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_2, _parameter_2);
                      }
                      XExpression _call = route.getCall();
                      RouteJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _call);
                    }
                  };
                JvmOperation _method = RouteJvmModelInferrer.this._jvmTypesBuilder.toMethod(route, name, _newTypeRef_2, _function_1);
                RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _method);
                boolean _and = false;
                Condition _condition = route.getCondition();
                boolean _notEquals_1 = (!Objects.equal(_condition, null));
                if (!_notEquals_1) {
                  _and = false;
                } else {
                  Condition _condition_1 = route.getCondition();
                  XExpression _expression = _condition_1.getExpression();
                  boolean _notEquals_2 = (!Objects.equal(_expression, null));
                  _and = (_notEquals_1 && _notEquals_2);
                }
                if (_and) {
                  EList<JvmMember> _members_2 = it.getMembers();
                  String _plus = (name + "Condition");
                  JvmTypeReference _newTypeRef_3 = RouteJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(model, Boolean.TYPE);
                  final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
                      public void apply(final JvmOperation it) {
                        EList<JvmFormalParameter> _parameters = it.getParameters();
                        JvmTypeReference _newTypeRef = RouteJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(model, RouteJvmModelInferrer.REQUEST);
                        JvmFormalParameter _parameter = RouteJvmModelInferrer.this._jvmTypesBuilder.toParameter(model, "request", _newTypeRef);
                        RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                        URL _url = route.getUrl();
                        EList<Variable> _variables = _url.getVariables();
                        for (final Variable variable : _variables) {
                          EList<JvmFormalParameter> _parameters_1 = it.getParameters();
                          String _name = variable.getName();
                          JvmTypeReference _newTypeRef_1 = RouteJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(model, String.class);
                          JvmFormalParameter _parameter_1 = RouteJvmModelInferrer.this._jvmTypesBuilder.toParameter(variable, _name, _newTypeRef_1);
                          RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
                        }
                        Condition _condition = route.getCondition();
                        XExpression _expression = _condition.getExpression();
                        RouteJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _expression);
                      }
                    };
                  JvmOperation _method_1 = RouteJvmModelInferrer.this._jvmTypesBuilder.toMethod(route, _plus, _newTypeRef_3, _function_2);
                  RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _method_1);
                }
                boolean _isValidKey = RouteJvmModelInferrer.this.isValidKey(route);
                if (_isValidKey) {
                  Key _key = route.getKey();
                  String _plus_1 = ("_key" + Integer.valueOf(i));
                  Key _key_1 = route.getKey();
                  JvmTypeReference _type = _key_1.getType();
                  final JvmField keyField = RouteJvmModelInferrer.this._jvmTypesBuilder.toField(_key, _plus_1, _type);
                  RouteJvmModelInferrer.this.addInjectAnnotation(keyField, model);
                  Key _key_2 = route.getKey();
                  EList<XAnnotation> _annotations = _key_2.getAnnotations();
                  RouteJvmModelInferrer.this._jvmTypesBuilder.translateAnnotationsTo(_annotations, keyField);
                  EList<JvmMember> _members_3 = it.getMembers();
                  RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_3, keyField);
                }
                URL _url_1 = route.getUrl();
                String _plus_2 = ("_pattern" + Integer.valueOf(i));
                JvmTypeReference _newTypeRef_4 = RouteJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(model, Pattern.class);
                final Procedure1<JvmField> _function_3 = new Procedure1<JvmField>() {
                    public void apply(final JvmField it) {
                      it.setStatic(true);
                      final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                          public void apply(final ITreeAppendable it) {
                            StringConcatenation _builder = new StringConcatenation();
                            _builder.append("Pattern.compile(\"");
                            URL _url = route.getUrl();
                            ICompositeNode _node = NodeModelUtils.getNode(_url);
                            String _text = _node.getText();
                            String _trim = _text.trim();
                            URL _url_1 = route.getUrl();
                            EList<Variable> _variables = _url_1.getVariables();
                            String _regExPattern = RouteJvmModelInferrer.this.getRegExPattern(_trim, _variables);
                            _builder.append(_regExPattern, "");
                            _builder.append("\")");
                            it.append(_builder);
                          }
                        };
                      RouteJvmModelInferrer.this._jvmTypesBuilder.setInitializer(it, _function);
                    }
                  };
                final JvmField patternField = RouteJvmModelInferrer.this._jvmTypesBuilder.toField(_url_1, _plus_2, _newTypeRef_4, _function_3);
                EList<JvmMember> _members_4 = it.getMembers();
                RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_4, patternField);
              }
              int _plus_3 = (i + 1);
              i = _plus_3;
            }
          }
          EList<JvmMember> _members_1 = it.getMembers();
          JvmOperation _createMethod = RouteJvmModelInferrer.this.createMethod("doGet", model, routes, Type.GET);
          RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _createMethod);
          EList<JvmMember> _members_2 = it.getMembers();
          JvmOperation _createMethod_1 = RouteJvmModelInferrer.this.createMethod("doPost", model, routes, Type.POST);
          RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _createMethod_1);
          EList<JvmMember> _members_3 = it.getMembers();
          JvmOperation _createMethod_2 = RouteJvmModelInferrer.this.createMethod("doPut", model, routes, Type.PUT);
          RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_3, _createMethod_2);
          EList<JvmMember> _members_4 = it.getMembers();
          JvmOperation _createMethod_3 = RouteJvmModelInferrer.this.createMethod("doDelete", model, routes, Type.DELETE);
          RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_4, _createMethod_3);
          EList<JvmMember> _members_5 = it.getMembers();
          JvmOperation _createMethod_4 = RouteJvmModelInferrer.this.createMethod("doHead", model, routes, Type.HEAD);
          RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_5, _createMethod_4);
        }
      };
    _accept.initializeLater(_function);
  }
  
  public boolean isValidKey(final Route route) {
    boolean _and = false;
    boolean _and_1 = false;
    Key _key = route.getKey();
    boolean _notEquals = (!Objects.equal(_key, null));
    if (!_notEquals) {
      _and_1 = false;
    } else {
      Key _key_1 = route.getKey();
      JvmTypeReference _type = _key_1.getType();
      boolean _notEquals_1 = (!Objects.equal(_type, null));
      _and_1 = (_notEquals && _notEquals_1);
    }
    if (!_and_1) {
      _and = false;
    } else {
      Key _key_2 = route.getKey();
      JvmTypeReference _type_1 = _key_2.getType();
      boolean _not = (!(_type_1 instanceof JvmVoid));
      _and = (_and_1 && _not);
    }
    return _and;
  }
  
  public boolean addInjectAnnotation(final JvmAnnotationTarget target, final EObject context) {
    boolean _xblockexpression = false;
    {
      final JvmTypeReference injectAnnotation = this._jvmTypesBuilder.newTypeRef(context, Inject.class);
      boolean _xifexpression = false;
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(injectAnnotation, null));
      if (!_notEquals) {
        _and = false;
      } else {
        JvmType _type = injectAnnotation.getType();
        boolean _not = (!(_type instanceof JvmVoid));
        _and = (_notEquals && _not);
      }
      if (_and) {
        boolean _xblockexpression_1 = false;
        {
          final JvmAnnotationReference inject = this.typesFactory.createJvmAnnotationReference();
          JvmType _type_1 = injectAnnotation.getType();
          inject.setAnnotation(((JvmAnnotationType) _type_1));
          EList<JvmAnnotationReference> _annotations = target.getAnnotations();
          boolean _add = this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, inject);
          _xblockexpression_1 = (_add);
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  public JvmOperation createMethod(final String name, final EObject element, final Iterable<Route> routes, final Type filterType) {
    JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(element, Void.TYPE);
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
        public void apply(final JvmOperation it) {
          EList<JvmFormalParameter> _parameters = it.getParameters();
          JvmTypeReference _newTypeRef = RouteJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, RouteJvmModelInferrer.REQUEST);
          JvmFormalParameter _parameter = RouteJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "request", _newTypeRef);
          RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
          EList<JvmFormalParameter> _parameters_1 = it.getParameters();
          JvmTypeReference _newTypeRef_1 = RouteJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, "javax.servlet.http.HttpServletResponse");
          JvmFormalParameter _parameter_1 = RouteJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "response", _newTypeRef_1);
          RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
          final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
              public void apply(final ITreeAppendable it) {
                int x = 0;
                final Function1<Route,Boolean> _function = new Function1<Route,Boolean>() {
                    public Boolean apply(final Route e) {
                      Type _type = e.getType();
                      boolean _equals = Objects.equal(_type, filterType);
                      return Boolean.valueOf(_equals);
                    }
                  };
                boolean _exists = IterableExtensions.<Route>exists(routes, _function);
                if (_exists) {
                  StringConcatenation _builder = new StringConcatenation();
                  _builder.append("String url =  request.getRequestURI();");
                  _builder.newLine();
                  it.append(_builder);
                }
                for (final Route route : routes) {
                  {
                    Type _type = route.getType();
                    boolean _equals = Objects.equal(_type, filterType);
                    if (_equals) {
                      URL _url = route.getUrl();
                      boolean _notEquals = (!Objects.equal(_url, null));
                      if (_notEquals) {
                        JvmTypeReference _newTypeRef = RouteJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, Matcher.class);
                        JvmType _type_1 = _newTypeRef.getType();
                        ITreeAppendable _append = it.append(_type_1);
                        StringConcatenation _builder_1 = new StringConcatenation();
                        _builder_1.append(" ");
                        _builder_1.append("_matcher");
                        _builder_1.append(x, " ");
                        _builder_1.append(" = _pattern");
                        _builder_1.append(x, " ");
                        _builder_1.append(".matcher(url);");
                        _builder_1.newLineIfNotEmpty();
                        _append.append(_builder_1);
                        URL _url_1 = route.getUrl();
                        final EList<Variable> variables = _url_1.getVariables();
                        StringConcatenation _builder_2 = new StringConcatenation();
                        _builder_2.append("if(_matcher");
                        _builder_2.append(x, "");
                        _builder_2.append(".find()){");
                        _builder_2.newLineIfNotEmpty();
                        it.append(_builder_2);
                        for (final Variable variable : variables) {
                          StringConcatenation _builder_3 = new StringConcatenation();
                          _builder_3.append("\t\t");
                          _builder_3.append("String ");
                          String _name = variable.getName();
                          _builder_3.append(_name, "		");
                          _builder_3.append(" = _matcher");
                          _builder_3.append(x, "		");
                          _builder_3.append(".group(");
                          int _indexOf = variables.indexOf(variable);
                          int _plus = (_indexOf + 1);
                          _builder_3.append(_plus, "		");
                          _builder_3.append(");");
                          _builder_3.newLineIfNotEmpty();
                          it.append(_builder_3);
                        }
                        Condition _condition = route.getCondition();
                        boolean _notEquals_1 = (!Objects.equal(_condition, null));
                        if (_notEquals_1) {
                          StringConcatenation _builder_4 = new StringConcatenation();
                          _builder_4.append("\t\t");
                          _builder_4.append("if(");
                          String _nameOfRouteMethod = RouteJvmModelInferrer.this.nameOfRouteMethod(route, x);
                          _builder_4.append(_nameOfRouteMethod, "		");
                          _builder_4.append("Condition(request");
                          it.append(_builder_4);
                          StringConcatenation _builder_5 = new StringConcatenation();
                          {
                            URL _url_2 = route.getUrl();
                            EList<Variable> _variables = _url_2.getVariables();
                            boolean _hasElements = false;
                            for(final Variable v : _variables) {
                              if (!_hasElements) {
                                _hasElements = true;
                                _builder_5.append(", ", "");
                              } else {
                                _builder_5.appendImmediate(", ", "");
                              }
                              String _name_1 = v.getName();
                              _builder_5.append(_name_1, "");
                            }
                          }
                          it.append(_builder_5);
                          StringConcatenation _builder_6 = new StringConcatenation();
                          _builder_6.append("))");
                          _builder_6.newLine();
                          it.append(_builder_6);
                        }
                        StringConcatenation _builder_7 = new StringConcatenation();
                        _builder_7.append("\t\t\t");
                        String _nameOfRouteMethod_1 = RouteJvmModelInferrer.this.nameOfRouteMethod(route, x);
                        _builder_7.append(_nameOfRouteMethod_1, "			");
                        _builder_7.append("(");
                        it.append(_builder_7);
                        boolean _isValidKey = RouteJvmModelInferrer.this.isValidKey(route);
                        if (_isValidKey) {
                          StringConcatenation _builder_8 = new StringConcatenation();
                          _builder_8.append("_key");
                          _builder_8.append(x, "");
                          _builder_8.append(",");
                          it.append(_builder_8);
                        }
                        StringConcatenation _builder_9 = new StringConcatenation();
                        _builder_9.append("request");
                        it.append(_builder_9);
                        StringConcatenation _builder_10 = new StringConcatenation();
                        {
                          URL _url_3 = route.getUrl();
                          EList<Variable> _variables_1 = _url_3.getVariables();
                          boolean _hasElements_1 = false;
                          for(final Variable v_1 : _variables_1) {
                            if (!_hasElements_1) {
                              _hasElements_1 = true;
                              _builder_10.append(", ", "");
                            } else {
                              _builder_10.appendImmediate(", ", "");
                            }
                            String _name_2 = v_1.getName();
                            _builder_10.append(_name_2, "");
                          }
                        }
                        it.append(_builder_10);
                        StringConcatenation _builder_11 = new StringConcatenation();
                        _builder_11.append(");");
                        _builder_11.newLine();
                        it.append(_builder_11);
                        StringConcatenation _builder_12 = new StringConcatenation();
                        _builder_12.append("}");
                        it.append(_builder_12);
                      }
                    }
                    int _plus_1 = (x + 1);
                    x = _plus_1;
                  }
                }
              }
            };
          RouteJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
        }
      };
    JvmOperation _method = this._jvmTypesBuilder.toMethod(element, name, _newTypeRef, _function);
    return _method;
  }
  
  public String getRegExPattern(final String originalPattern, final List<Variable> variables) {
    String _xblockexpression = null;
    {
      String pattern = originalPattern;
      for (final Variable variable : variables) {
        boolean _isWildcard = variable.isWildcard();
        if (_isWildcard) {
          String _name = variable.getName();
          String _plus = ("(:" + _name);
          String _plus_1 = (_plus + "\\*)");
          String _replaceAll = pattern.replaceAll(_plus_1, "(.+)");
          pattern = _replaceAll;
        } else {
          String _name_1 = variable.getName();
          String _plus_2 = ("(:" + _name_1);
          String _plus_3 = (_plus_2 + ")");
          String _replaceAll_1 = originalPattern.replaceAll(_plus_3, "(\\\\\\\\w+)");
          pattern = _replaceAll_1;
        }
      }
      _xblockexpression = (pattern);
    }
    return _xblockexpression;
  }
  
  public void infer(final EObject model, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    if (model instanceof Model) {
      _infer((Model)model, acceptor, isPreIndexingPhase);
      return;
    } else if (model != null) {
      _infer(model, acceptor, isPreIndexingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(model, acceptor, isPreIndexingPhase).toString());
    }
  }
}
