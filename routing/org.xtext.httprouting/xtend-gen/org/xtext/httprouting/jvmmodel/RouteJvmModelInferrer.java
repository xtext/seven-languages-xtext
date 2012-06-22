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
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVoid;
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
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.httprouting.route.Condition;
import org.xtext.httprouting.route.Key;
import org.xtext.httprouting.route.Model;
import org.xtext.httprouting.route.RequestType;
import org.xtext.httprouting.route.Route;
import org.xtext.httprouting.route.URL;
import org.xtext.httprouting.route.Variable;

/**
 * @author Holger Schill - Initial contribution and API
 */
@SuppressWarnings("all")
public class RouteJvmModelInferrer extends AbstractModelInferrer {
  private final static String HTTP_REQUEST = "javax.servlet.http.HttpServletRequest";
  
  @Inject
  private JvmTypesBuilder _jvmTypesBuilder;
  
  protected void _infer(final Model model, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    JvmGenericType _class = this._jvmTypesBuilder.toClass(model, "org.xtext.httpRouting.HttpMapperServlet");
    IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_class);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          EList<JvmTypeReference> _superTypes = it.getSuperTypes();
          JvmTypeReference _newTypeRef = RouteJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(model, "javax.servlet.http.HttpServlet");
          RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _newTypeRef);
          EList<JvmAnnotationReference> _annotations = it.getAnnotations();
          JvmAnnotationReference _annotation = RouteJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(model, SuppressWarnings.class, "serial");
          RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
          final EList<Route> routes = model.getRoutes();
          int routeCounter = 0;
          for (final Route route : routes) {
            {
              URL _url = route.getUrl();
              boolean _notEquals = (!Objects.equal(_url, null));
              if (_notEquals) {
                RouteJvmModelInferrer.this.addRouteMethod(it, route, routeCounter);
                RouteJvmModelInferrer.this.addRouteConditionMethod(it, route, routeCounter);
                RouteJvmModelInferrer.this.addRouteKeyField(it, route, routeCounter);
                RouteJvmModelInferrer.this.addRoutePatternField(it, route, routeCounter);
              }
              int _plus = (routeCounter + 1);
              routeCounter = _plus;
            }
          }
          RouteJvmModelInferrer.this.addMethod(it, "doGet", model, routes, RequestType.GET);
          RouteJvmModelInferrer.this.addMethod(it, "doPost", model, routes, RequestType.POST);
          RouteJvmModelInferrer.this.addMethod(it, "doPut", model, routes, RequestType.PUT);
          RouteJvmModelInferrer.this.addMethod(it, "doDelete", model, routes, RequestType.DELETE);
          RouteJvmModelInferrer.this.addMethod(it, "doHead", model, routes, RequestType.HEAD);
        }
      };
    _accept.initializeLater(_function);
  }
  
  protected boolean addRouteMethod(final JvmDeclaredType servlet, final Route route, final int routeCounter) {
    boolean _xblockexpression = false;
    {
      final String name = this.nameOfRouteMethod(route, routeCounter);
      EList<JvmMember> _members = servlet.getMembers();
      JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(route, Void.TYPE);
      final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            String _documentation = RouteJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(route);
            RouteJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
            boolean _hasValidKey = RouteJvmModelInferrer.this.hasValidKey(route);
            if (_hasValidKey) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              Key _key = route.getKey();
              Key _key_1 = route.getKey();
              JvmTypeReference _type = _key_1.getType();
              JvmFormalParameter _parameter = RouteJvmModelInferrer.this._jvmTypesBuilder.toParameter(_key, "it", _type);
              RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            }
            EList<JvmFormalParameter> _parameters_1 = it.getParameters();
            JvmTypeReference _newTypeRef = RouteJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(route, RouteJvmModelInferrer.HTTP_REQUEST);
            JvmFormalParameter _parameter_1 = RouteJvmModelInferrer.this._jvmTypesBuilder.toParameter(route, "request", _newTypeRef);
            RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
            URL _url = route.getUrl();
            EList<Variable> _variables = _url.getVariables();
            for (final Variable variable : _variables) {
              EList<JvmFormalParameter> _parameters_2 = it.getParameters();
              String _name = variable.getName();
              JvmTypeReference _newTypeRef_1 = RouteJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(route, String.class);
              JvmFormalParameter _parameter_2 = RouteJvmModelInferrer.this._jvmTypesBuilder.toParameter(variable, _name, _newTypeRef_1);
              RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_2, _parameter_2);
            }
            XExpression _call = route.getCall();
            RouteJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _call);
          }
        };
      JvmOperation _method = this._jvmTypesBuilder.toMethod(route, name, _newTypeRef, _function);
      boolean _add = this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
      _xblockexpression = (_add);
    }
    return _xblockexpression;
  }
  
  protected boolean addRouteConditionMethod(final JvmDeclaredType servlet, final Route route, final int routeCounter) {
    boolean _xifexpression = false;
    boolean _and = false;
    Condition _condition = route.getCondition();
    boolean _notEquals = (!Objects.equal(_condition, null));
    if (!_notEquals) {
      _and = false;
    } else {
      Condition _condition_1 = route.getCondition();
      XExpression _expression = _condition_1.getExpression();
      boolean _notEquals_1 = (!Objects.equal(_expression, null));
      _and = (_notEquals && _notEquals_1);
    }
    if (_and) {
      boolean _xblockexpression = false;
      {
        final String name = this.nameOfRouteMethod(route, routeCounter);
        EList<JvmMember> _members = servlet.getMembers();
        String _plus = (name + "Condition");
        JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(route, Boolean.TYPE);
        final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _newTypeRef = RouteJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(route, RouteJvmModelInferrer.HTTP_REQUEST);
              JvmFormalParameter _parameter = RouteJvmModelInferrer.this._jvmTypesBuilder.toParameter(route, "request", _newTypeRef);
              RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              URL _url = route.getUrl();
              EList<Variable> _variables = _url.getVariables();
              for (final Variable variable : _variables) {
                EList<JvmFormalParameter> _parameters_1 = it.getParameters();
                String _name = variable.getName();
                JvmTypeReference _newTypeRef_1 = RouteJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(route, String.class);
                JvmFormalParameter _parameter_1 = RouteJvmModelInferrer.this._jvmTypesBuilder.toParameter(variable, _name, _newTypeRef_1);
                RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
              }
              Condition _condition = route.getCondition();
              XExpression _expression = _condition.getExpression();
              RouteJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _expression);
            }
          };
        JvmOperation _method = this._jvmTypesBuilder.toMethod(route, _plus, _newTypeRef, _function);
        boolean _add = this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
        _xblockexpression = (_add);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  protected boolean addRouteKeyField(final JvmDeclaredType servlet, final Route route, final int routeCounter) {
    boolean _xifexpression = false;
    boolean _hasValidKey = this.hasValidKey(route);
    if (_hasValidKey) {
      EList<JvmMember> _members = servlet.getMembers();
      Key _key = route.getKey();
      String _plus = ("_key" + Integer.valueOf(routeCounter));
      Key _key_1 = route.getKey();
      JvmTypeReference _type = _key_1.getType();
      JvmField _field = this._jvmTypesBuilder.toField(_key, _plus, _type);
      final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
          public void apply(final JvmField it) {
            EList<JvmAnnotationReference> _annotations = it.getAnnotations();
            JvmAnnotationReference _annotation = RouteJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(route, Inject.class);
            RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
            Key _key = route.getKey();
            EList<XAnnotation> _annotations_1 = _key.getAnnotations();
            RouteJvmModelInferrer.this._jvmTypesBuilder.translateAnnotationsTo(_annotations_1, it);
          }
        };
      JvmField _doubleArrow = ObjectExtensions.<JvmField>operator_doubleArrow(_field, _function);
      boolean _add = this._jvmTypesBuilder.<JvmField>operator_add(_members, _doubleArrow);
      _xifexpression = _add;
    }
    return _xifexpression;
  }
  
  protected boolean addRoutePatternField(final JvmDeclaredType servlet, final Route route, final int routeCounter) {
    boolean _xblockexpression = false;
    {
      URL _url = route.getUrl();
      String _plus = ("_pattern" + Integer.valueOf(routeCounter));
      JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(route, Pattern.class);
      final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
          public void apply(final JvmField it) {
            it.setStatic(true);
            final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                public void apply(final ITreeAppendable it) {
                  it.append("Pattern.compile(\"");
                  URL _url = route.getUrl();
                  ICompositeNode _node = NodeModelUtils.getNode(_url);
                  String _text = _node.getText();
                  String _trim = _text.trim();
                  URL _url_1 = route.getUrl();
                  EList<Variable> _variables = _url_1.getVariables();
                  String _regExPattern = RouteJvmModelInferrer.this.getRegExPattern(_trim, _variables);
                  it.append(_regExPattern);
                  it.append("\")");
                }
              };
            RouteJvmModelInferrer.this._jvmTypesBuilder.setInitializer(it, _function);
          }
        };
      final JvmField patternField = this._jvmTypesBuilder.toField(_url, _plus, _newTypeRef, _function);
      EList<JvmMember> _members = servlet.getMembers();
      boolean _add = this._jvmTypesBuilder.<JvmField>operator_add(_members, patternField);
      _xblockexpression = (_add);
    }
    return _xblockexpression;
  }
  
  protected boolean addMethod(final JvmDeclaredType servlet, final String name, final EObject element, final Iterable<Route> routes, final RequestType filterType) {
    EList<JvmMember> _members = servlet.getMembers();
    JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(element, Void.TYPE);
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
        public void apply(final JvmOperation it) {
          EList<JvmFormalParameter> _parameters = it.getParameters();
          JvmTypeReference _newTypeRef = RouteJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, RouteJvmModelInferrer.HTTP_REQUEST);
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
                      RequestType _requestType = e.getRequestType();
                      boolean _equals = Objects.equal(_requestType, filterType);
                      return Boolean.valueOf(_equals);
                    }
                  };
                boolean _exists = IterableExtensions.<Route>exists(routes, _function);
                if (_exists) {
                  ITreeAppendable _append = it.append("String url =  request.getRequestURI();");
                  _append.newLine();
                }
                for (final Route route : routes) {
                  {
                    RequestType _requestType = route.getRequestType();
                    boolean _equals = Objects.equal(_requestType, filterType);
                    if (_equals) {
                      URL _url = route.getUrl();
                      boolean _notEquals = (!Objects.equal(_url, null));
                      if (_notEquals) {
                        JvmTypeReference _newTypeRef = RouteJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, Matcher.class);
                        JvmType _type = _newTypeRef.getType();
                        it.append(_type);
                        StringConcatenation _builder = new StringConcatenation();
                        _builder.append(" ");
                        _builder.append("_matcher");
                        _builder.append(x, " ");
                        _builder.append(" = _pattern");
                        _builder.append(x, " ");
                        _builder.append(".matcher(url);");
                        it.append(_builder);
                        it.newLine();
                        URL _url_1 = route.getUrl();
                        final EList<Variable> variables = _url_1.getVariables();
                        StringConcatenation _builder_1 = new StringConcatenation();
                        _builder_1.append("if (_matcher");
                        _builder_1.append(x, "");
                        _builder_1.append(".find()) {");
                        ITreeAppendable _append_1 = it.append(_builder_1);
                        _append_1.newLine();
                        for (final Variable variable : variables) {
                          {
                            StringConcatenation _builder_2 = new StringConcatenation();
                            _builder_2.append("\t\t");
                            _builder_2.append("String ");
                            String _name = variable.getName();
                            _builder_2.append(_name, "		");
                            _builder_2.append(" = _matcher");
                            _builder_2.append(x, "		");
                            _builder_2.append(".group(");
                            int _indexOf = variables.indexOf(variable);
                            int _plus = (_indexOf + 1);
                            _builder_2.append(_plus, "		");
                            _builder_2.append(");");
                            it.append(_builder_2);
                            it.newLine();
                          }
                        }
                        Condition _condition = route.getCondition();
                        boolean _notEquals_1 = (!Objects.equal(_condition, null));
                        if (_notEquals_1) {
                          StringConcatenation _builder_2 = new StringConcatenation();
                          _builder_2.append("\t\t");
                          _builder_2.append("if (");
                          String _nameOfRouteMethod = RouteJvmModelInferrer.this.nameOfRouteMethod(route, x);
                          _builder_2.append(_nameOfRouteMethod, "		");
                          _builder_2.append("Condition(request");
                          it.append(_builder_2);
                          StringConcatenation _builder_3 = new StringConcatenation();
                          {
                            URL _url_2 = route.getUrl();
                            EList<Variable> _variables = _url_2.getVariables();
                            boolean _hasElements = false;
                            for(final Variable v : _variables) {
                              if (!_hasElements) {
                                _hasElements = true;
                                _builder_3.append(", ", "");
                              } else {
                                _builder_3.appendImmediate(", ", "");
                              }
                              String _name = v.getName();
                              _builder_3.append(_name, "");
                            }
                          }
                          it.append(_builder_3);
                          StringConcatenation _builder_4 = new StringConcatenation();
                          _builder_4.append("))");
                          it.append(_builder_4);
                          it.newLine();
                        }
                        StringConcatenation _builder_5 = new StringConcatenation();
                        _builder_5.append("\t\t\t");
                        String _nameOfRouteMethod_1 = RouteJvmModelInferrer.this.nameOfRouteMethod(route, x);
                        _builder_5.append(_nameOfRouteMethod_1, "			");
                        _builder_5.append("(");
                        it.append(_builder_5);
                        boolean _hasValidKey = RouteJvmModelInferrer.this.hasValidKey(route);
                        if (_hasValidKey) {
                          StringConcatenation _builder_6 = new StringConcatenation();
                          _builder_6.append("_key");
                          _builder_6.append(x, "");
                          _builder_6.append(",");
                          it.append(_builder_6);
                        }
                        StringConcatenation _builder_7 = new StringConcatenation();
                        _builder_7.append("request");
                        it.append(_builder_7);
                        StringConcatenation _builder_8 = new StringConcatenation();
                        {
                          URL _url_3 = route.getUrl();
                          EList<Variable> _variables_1 = _url_3.getVariables();
                          boolean _hasElements_1 = false;
                          for(final Variable v_1 : _variables_1) {
                            if (!_hasElements_1) {
                              _hasElements_1 = true;
                              _builder_8.append(", ", "");
                            } else {
                              _builder_8.appendImmediate(", ", "");
                            }
                            String _name_1 = v_1.getName();
                            _builder_8.append(_name_1, "");
                          }
                        }
                        it.append(_builder_8);
                        StringConcatenation _builder_9 = new StringConcatenation();
                        _builder_9.append(");");
                        it.append(_builder_9);
                        it.newLine();
                        StringConcatenation _builder_10 = new StringConcatenation();
                        _builder_10.append("}");
                        it.append(_builder_10);
                        it.newLine();
                      }
                    }
                    int _plus = (x + 1);
                    x = _plus;
                  }
                }
              }
            };
          RouteJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
        }
      };
    JvmOperation _method = this._jvmTypesBuilder.toMethod(element, name, _newTypeRef, _function);
    boolean _add = this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
    return _add;
  }
  
  protected String nameOfRouteMethod(final Route route, final int routeCounter) {
    RequestType _requestType = route.getRequestType();
    String _literal = _requestType.getLiteral();
    String _lowerCase = _literal.toLowerCase();
    String _firstUpper = StringExtensions.toFirstUpper(_lowerCase);
    String _plus = ("_do" + _firstUpper);
    String _plus_1 = (_plus + Integer.valueOf(routeCounter));
    return _plus_1;
  }
  
  protected boolean hasValidKey(final Route route) {
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
  
  protected String getRegExPattern(final String originalPattern, final List<Variable> variables) {
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
