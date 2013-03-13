/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.httprouting.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.httprouting.route.AbstractDeclaration;
import org.xtext.httprouting.route.Dependency;
import org.xtext.httprouting.route.Model;
import org.xtext.httprouting.route.RequestType;
import org.xtext.httprouting.route.Route;
import org.xtext.httprouting.route.URL;
import org.xtext.httprouting.route.Variable;

/**
 * Translates a file of routes to a Java Servlet class with
 * the desired dispatching logic.
 */
@SuppressWarnings("all")
public class RouteJvmModelInferrer extends AbstractModelInferrer {
  private final static String HTTP_REQUEST = "javax.servlet.http.HttpServletRequest";
  
  private final static String HTTP_RESPONSE = "javax.servlet.http.HttpServletResponse";
  
  private final static String HTTP_SERVLET = "javax.servlet.http.HttpServlet";
  
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  /**
   * The main entry point for this class.
   */
  protected void _infer(final Model model, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    String _javaClassName = this.javaClassName(model);
    JvmGenericType _class = this._jvmTypesBuilder.toClass(model, _javaClassName);
    IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_class);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          EList<JvmTypeReference> _superTypes = it.getSuperTypes();
          JvmTypeReference _newTypeRef = RouteJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(model, RouteJvmModelInferrer.HTTP_SERVLET);
          RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _newTypeRef);
          EList<JvmAnnotationReference> _annotations = it.getAnnotations();
          JvmAnnotationReference _annotation = RouteJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(model, SuppressWarnings.class, "serial");
          RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
          EList<AbstractDeclaration> _declarations = model.getDeclarations();
          Iterable<Dependency> _filter = Iterables.<Dependency>filter(_declarations, Dependency.class);
          for (final Dependency field : _filter) {
            EList<JvmMember> _members = it.getMembers();
            String _name = field.getName();
            JvmTypeReference _type = field.getType();
            final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
                public void apply(final JvmField it) {
                  EList<JvmAnnotationReference> _annotations = it.getAnnotations();
                  JvmAnnotationReference _annotation = RouteJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(field, Inject.class);
                  RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
                  EList<XAnnotation> _annotations_1 = field.getAnnotations();
                  RouteJvmModelInferrer.this._jvmTypesBuilder.translateAnnotationsTo(_annotations_1, it);
                }
              };
            JvmField _field = RouteJvmModelInferrer.this._jvmTypesBuilder.toField(field, _name, _type, _function);
            RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmMember>operator_add(_members, _field);
          }
          Iterable<Route> _routes = RouteJvmModelInferrer.this.routes(model);
          final Function1<Route,Boolean> _function_1 = new Function1<Route,Boolean>() {
              public Boolean apply(final Route it) {
                URL _url = it.getUrl();
                boolean _notEquals = (!Objects.equal(_url, null));
                return Boolean.valueOf(_notEquals);
              }
            };
          Iterable<Route> _filter_1 = IterableExtensions.<Route>filter(_routes, _function_1);
          for (final Route route : _filter_1) {
            {
              EList<JvmMember> _members_1 = it.getMembers();
              JvmField _routePatternField = RouteJvmModelInferrer.this.toRoutePatternField(route);
              RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmMember>operator_add(_members_1, _routePatternField);
              XExpression _condition = route.getCondition();
              boolean _notEquals = (!Objects.equal(_condition, null));
              if (_notEquals) {
                EList<JvmMember> _members_2 = it.getMembers();
                JvmOperation _routeConditionMethod = RouteJvmModelInferrer.this.toRouteConditionMethod(route);
                RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmMember>operator_add(_members_2, _routeConditionMethod);
              }
              EList<JvmMember> _members_3 = it.getMembers();
              JvmOperation _routeCallMethod = RouteJvmModelInferrer.this.toRouteCallMethod(route);
              RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmMember>operator_add(_members_3, _routeCallMethod);
            }
          }
          Iterable<Route> _routes_1 = RouteJvmModelInferrer.this.routes(model);
          final Function1<Route,Boolean> _function_2 = new Function1<Route,Boolean>() {
              public Boolean apply(final Route it) {
                RequestType _requestType = it.getRequestType();
                boolean _equals = Objects.equal(_requestType, RequestType.GET);
                return Boolean.valueOf(_equals);
              }
            };
          final Iterable<Route> getRoutes = IterableExtensions.<Route>filter(_routes_1, _function_2);
          boolean _isEmpty = IterableExtensions.isEmpty(getRoutes);
          boolean _not = (!_isEmpty);
          if (_not) {
            EList<JvmMember> _members_1 = it.getMembers();
            JvmOperation _requestHandlerMethod = RouteJvmModelInferrer.this.toRequestHandlerMethod(model, "doGet", getRoutes);
            RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmMember>operator_add(_members_1, _requestHandlerMethod);
          }
          Iterable<Route> _routes_2 = RouteJvmModelInferrer.this.routes(model);
          final Function1<Route,Boolean> _function_3 = new Function1<Route,Boolean>() {
              public Boolean apply(final Route it) {
                RequestType _requestType = it.getRequestType();
                boolean _equals = Objects.equal(_requestType, RequestType.POST);
                return Boolean.valueOf(_equals);
              }
            };
          final Iterable<Route> postRoutes = IterableExtensions.<Route>filter(_routes_2, _function_3);
          boolean _isEmpty_1 = IterableExtensions.isEmpty(postRoutes);
          boolean _not_1 = (!_isEmpty_1);
          if (_not_1) {
            EList<JvmMember> _members_2 = it.getMembers();
            JvmOperation _requestHandlerMethod_1 = RouteJvmModelInferrer.this.toRequestHandlerMethod(model, "doPost", postRoutes);
            RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmMember>operator_add(_members_2, _requestHandlerMethod_1);
          }
          Iterable<Route> _routes_3 = RouteJvmModelInferrer.this.routes(model);
          final Function1<Route,Boolean> _function_4 = new Function1<Route,Boolean>() {
              public Boolean apply(final Route it) {
                RequestType _requestType = it.getRequestType();
                boolean _equals = Objects.equal(_requestType, RequestType.PUT);
                return Boolean.valueOf(_equals);
              }
            };
          final Iterable<Route> putRoutes = IterableExtensions.<Route>filter(_routes_3, _function_4);
          boolean _isEmpty_2 = IterableExtensions.isEmpty(putRoutes);
          boolean _not_2 = (!_isEmpty_2);
          if (_not_2) {
            EList<JvmMember> _members_3 = it.getMembers();
            JvmOperation _requestHandlerMethod_2 = RouteJvmModelInferrer.this.toRequestHandlerMethod(model, "doPut", putRoutes);
            RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmMember>operator_add(_members_3, _requestHandlerMethod_2);
          }
          Iterable<Route> _routes_4 = RouteJvmModelInferrer.this.routes(model);
          final Function1<Route,Boolean> _function_5 = new Function1<Route,Boolean>() {
              public Boolean apply(final Route it) {
                RequestType _requestType = it.getRequestType();
                boolean _equals = Objects.equal(_requestType, RequestType.DELETE);
                return Boolean.valueOf(_equals);
              }
            };
          final Iterable<Route> deleteRoutes = IterableExtensions.<Route>filter(_routes_4, _function_5);
          boolean _isEmpty_3 = IterableExtensions.isEmpty(deleteRoutes);
          boolean _not_3 = (!_isEmpty_3);
          if (_not_3) {
            EList<JvmMember> _members_4 = it.getMembers();
            JvmOperation _requestHandlerMethod_3 = RouteJvmModelInferrer.this.toRequestHandlerMethod(model, "doDelete", deleteRoutes);
            RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmMember>operator_add(_members_4, _requestHandlerMethod_3);
          }
          Iterable<Route> _routes_5 = RouteJvmModelInferrer.this.routes(model);
          final Function1<Route,Boolean> _function_6 = new Function1<Route,Boolean>() {
              public Boolean apply(final Route it) {
                RequestType _requestType = it.getRequestType();
                boolean _equals = Objects.equal(_requestType, RequestType.HEAD);
                return Boolean.valueOf(_equals);
              }
            };
          final Iterable<Route> headRoutes = IterableExtensions.<Route>filter(_routes_5, _function_6);
          boolean _isEmpty_4 = IterableExtensions.isEmpty(headRoutes);
          boolean _not_4 = (!_isEmpty_4);
          if (_not_4) {
            EList<JvmMember> _members_5 = it.getMembers();
            JvmOperation _requestHandlerMethod_4 = RouteJvmModelInferrer.this.toRequestHandlerMethod(model, "doHead", headRoutes);
            RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmMember>operator_add(_members_5, _requestHandlerMethod_4);
          }
        }
      };
    _accept.initializeLater(_function);
  }
  
  /**
   * computes the Servlet name
   */
  public String javaClassName(final Model it) {
    Resource _eResource = it.eResource();
    URI _uRI = _eResource.getURI();
    URI _trimFileExtension = _uRI.trimFileExtension();
    String _lastSegment = _trimFileExtension.lastSegment();
    String _plus = ("routes." + _lastSegment);
    return _plus;
  }
  
  /**
   * Creates a method for the route's target call.
   * Gives scope and live to the expression.
   */
  protected JvmOperation toRouteCallMethod(final Route route) {
    String _nameOfRouteMethod = this.nameOfRouteMethod(route);
    JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(route, Void.TYPE);
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
        public void apply(final JvmOperation it) {
          EList<JvmFormalParameter> _parameters = it.getParameters();
          JvmTypeReference _newTypeRef = RouteJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(route, RouteJvmModelInferrer.HTTP_REQUEST);
          JvmFormalParameter _parameter = RouteJvmModelInferrer.this._jvmTypesBuilder.toParameter(route, "request", _newTypeRef);
          RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
          EList<JvmFormalParameter> _parameters_1 = it.getParameters();
          JvmTypeReference _newTypeRef_1 = RouteJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(route, RouteJvmModelInferrer.HTTP_RESPONSE);
          JvmFormalParameter _parameter_1 = RouteJvmModelInferrer.this._jvmTypesBuilder.toParameter(route, "response", _newTypeRef_1);
          RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
          URL _url = route.getUrl();
          EList<Variable> _variables = _url.getVariables();
          for (final Variable variable : _variables) {
            EList<JvmFormalParameter> _parameters_2 = it.getParameters();
            String _name = variable.getName();
            JvmTypeReference _newTypeRef_2 = RouteJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(route, String.class);
            JvmFormalParameter _parameter_2 = RouteJvmModelInferrer.this._jvmTypesBuilder.toParameter(variable, _name, _newTypeRef_2);
            RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_2, _parameter_2);
          }
          XExpression _call = route.getCall();
          RouteJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _call);
        }
      };
    JvmOperation _method = this._jvmTypesBuilder.toMethod(route, _nameOfRouteMethod, _newTypeRef, _function);
    return _method;
  }
  
  /**
   * Creates a field for the URL pattern
   */
  protected JvmField toRoutePatternField(final Route route) {
    URL _url = route.getUrl();
    int _index = this.index(route);
    String _plus = ("_pattern" + Integer.valueOf(_index));
    JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(route, Pattern.class);
    final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
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
    JvmField _field = this._jvmTypesBuilder.toField(_url, _plus, _newTypeRef, _function);
    return _field;
  }
  
  /**
   * Creates a method for a route's when-part.
   * Gives scope and live to the expression.
   */
  protected JvmOperation toRouteConditionMethod(final Route route) {
    String _nameOfRouteMethod = this.nameOfRouteMethod(route);
    String _plus = (_nameOfRouteMethod + "Condition");
    JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(route, Boolean.TYPE);
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
        public void apply(final JvmOperation it) {
          EList<JvmFormalParameter> _parameters = it.getParameters();
          JvmTypeReference _newTypeRef = RouteJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(route, RouteJvmModelInferrer.HTTP_REQUEST);
          JvmFormalParameter _parameter = RouteJvmModelInferrer.this._jvmTypesBuilder.toParameter(route, "request", _newTypeRef);
          RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
          EList<JvmFormalParameter> _parameters_1 = it.getParameters();
          JvmTypeReference _newTypeRef_1 = RouteJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(route, RouteJvmModelInferrer.HTTP_RESPONSE);
          JvmFormalParameter _parameter_1 = RouteJvmModelInferrer.this._jvmTypesBuilder.toParameter(route, "response", _newTypeRef_1);
          RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
          URL _url = route.getUrl();
          EList<Variable> _variables = _url.getVariables();
          for (final Variable variable : _variables) {
            EList<JvmFormalParameter> _parameters_2 = it.getParameters();
            String _name = variable.getName();
            JvmTypeReference _newTypeRef_2 = RouteJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(route, String.class);
            JvmFormalParameter _parameter_2 = RouteJvmModelInferrer.this._jvmTypesBuilder.toParameter(variable, _name, _newTypeRef_2);
            RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_2, _parameter_2);
          }
          XExpression _condition = route.getCondition();
          RouteJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _condition);
        }
      };
    JvmOperation _method = this._jvmTypesBuilder.toMethod(route, _plus, _newTypeRef, _function);
    return _method;
  }
  
  /**
   * Creates a servlet request handling method for the given routes
   */
  protected JvmOperation toRequestHandlerMethod(final Model model, final String name, final Iterable<Route> routes) {
    JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(model, Void.TYPE);
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
        public void apply(final JvmOperation it) {
          EList<JvmAnnotationReference> _annotations = it.getAnnotations();
          JvmAnnotationReference _annotation = RouteJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(model, Override.class);
          RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
          EList<JvmFormalParameter> _parameters = it.getParameters();
          JvmTypeReference _newTypeRef = RouteJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(model, RouteJvmModelInferrer.HTTP_REQUEST);
          JvmFormalParameter _parameter = RouteJvmModelInferrer.this._jvmTypesBuilder.toParameter(model, "request", _newTypeRef);
          RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
          EList<JvmFormalParameter> _parameters_1 = it.getParameters();
          JvmTypeReference _newTypeRef_1 = RouteJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(model, RouteJvmModelInferrer.HTTP_RESPONSE);
          JvmFormalParameter _parameter_1 = RouteJvmModelInferrer.this._jvmTypesBuilder.toParameter(model, "response", _newTypeRef_1);
          RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
          final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
              public void apply(final ITreeAppendable it) {
                StringConcatenation _builder = new StringConcatenation();
                _builder.append("String url =  request.getRequestURL().toString();");
                _builder.newLine();
                {
                  for(final Route route : routes) {
                    _builder.append("{");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("java.util.regex.Matcher _matcher = _pattern");
                    int _index = RouteJvmModelInferrer.this.index(route);
                    _builder.append(_index, "	");
                    _builder.append(".matcher(url);");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("if (_matcher.find()) {");
                    _builder.newLine();
                    {
                      URL _url = route.getUrl();
                      EList<Variable> _variables = _url.getVariables();
                      for(final Variable variable : _variables) {
                        _builder.append("\t\t");
                        _builder.append("String ");
                        String _name = variable.getName();
                        _builder.append(_name, "		");
                        _builder.append(" = _matcher.group(");
                        int _index_1 = RouteJvmModelInferrer.this.index(variable);
                        int _plus = (_index_1 + 1);
                        _builder.append(_plus, "		");
                        _builder.append(");");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                    _builder.append("\t\t");
                    StringConcatenation _builder_1 = new StringConcatenation();
                    String _nameOfRouteMethod = RouteJvmModelInferrer.this.nameOfRouteMethod(route);
                    _builder_1.append(_nameOfRouteMethod, "");
                    _builder_1.append("(request, response");
                    {
                      URL _url_1 = route.getUrl();
                      EList<Variable> _variables_1 = _url_1.getVariables();
                      for(final Variable v : _variables_1) {
                        _builder_1.append(", ");
                        String _name_1 = v.getName();
                        _builder_1.append(_name_1, "");
                      }
                    }
                    _builder_1.append(");");
                    final String routeMethodCall = _builder_1.toString();
                    _builder.newLineIfNotEmpty();
                    {
                      XExpression _condition = route.getCondition();
                      boolean _notEquals = (!Objects.equal(_condition, null));
                      if (_notEquals) {
                        _builder.append("\t\t");
                        _builder.append("if (");
                        String _nameOfRouteMethod_1 = RouteJvmModelInferrer.this.nameOfRouteMethod(route);
                        _builder.append(_nameOfRouteMethod_1, "		");
                        _builder.append("Condition(request, response");
                        {
                          URL _url_2 = route.getUrl();
                          EList<Variable> _variables_2 = _url_2.getVariables();
                          boolean _hasElements = false;
                          for(final Variable v_1 : _variables_2) {
                            if (!_hasElements) {
                              _hasElements = true;
                              _builder.append(", ", "		");
                            } else {
                              _builder.appendImmediate(", ", "		");
                            }
                            String _name_2 = v_1.getName();
                            _builder.append(_name_2, "		");
                          }
                        }
                        _builder.append(")) {");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append(routeMethodCall, "			");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("return;");
                        _builder.newLine();
                        _builder.append("\t\t");
                        _builder.append("}");
                        _builder.newLine();
                      } else {
                        _builder.append("\t\t");
                        _builder.append(routeMethodCall, "		");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.append("return;");
                        _builder.newLine();
                      }
                    }
                    _builder.append("\t");
                    _builder.append("}");
                    _builder.newLine();
                    _builder.append("}");
                    _builder.newLine();
                  }
                }
                it.append(_builder);
              }
            };
          RouteJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
        }
      };
    JvmOperation _method = this._jvmTypesBuilder.toMethod(model, name, _newTypeRef, _function);
    return _method;
  }
  
  protected String nameOfRouteMethod(final Route route) {
    RequestType _requestType = route.getRequestType();
    String _literal = _requestType.getLiteral();
    String _lowerCase = _literal.toLowerCase();
    String _firstUpper = StringExtensions.toFirstUpper(_lowerCase);
    String _plus = ("_do" + _firstUpper);
    int _index = this.index(route);
    String _plus_1 = (_plus + Integer.valueOf(_index));
    return _plus_1;
  }
  
  /**
   * a generic method computing the index of an AST object between its siblings
   */
  protected int index(final EObject obj) {
    EObject _eContainer = obj.eContainer();
    EList<EObject> _eContents = _eContainer.eContents();
    int _indexOf = _eContents.indexOf(obj);
    return _indexOf;
  }
  
  protected String getRegExPattern(final String originalPattern, final List<Variable> variables) {
    String pattern = originalPattern;
    for (final Variable variable : variables) {
      boolean _isWildcard = this.isWildcard(variable);
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
    return pattern;
  }
  
  public Iterable<Route> routes(final Model model) {
    EList<AbstractDeclaration> _declarations = model.getDeclarations();
    Iterable<Route> _filter = Iterables.<Route>filter(_declarations, Route.class);
    return _filter;
  }
  
  public boolean isWildcard(final Variable it) {
    boolean _switchResult = false;
    EObject _eContainer = it.eContainer();
    final EObject parent = _eContainer;
    boolean _matched = false;
    if (!_matched) {
      if (parent instanceof URL) {
        final URL _uRL = (URL)parent;
        _matched=true;
        boolean _and = false;
        EList<Variable> _variables = _uRL.getVariables();
        Variable _last = IterableExtensions.<Variable>last(_variables);
        boolean _equals = Objects.equal(_last, it);
        if (!_equals) {
          _and = false;
        } else {
          boolean _isWildcard = _uRL.isWildcard();
          _and = (_equals && _isWildcard);
        }
        _switchResult = _and;
      }
    }
    if (!_matched) {
      _switchResult = false;
    }
    return _switchResult;
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
