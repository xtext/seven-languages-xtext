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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
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
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      @Override
      public void apply(final JvmGenericType it) {
        EList<JvmTypeReference> _superTypes = it.getSuperTypes();
        JvmTypeReference _typeRef = RouteJvmModelInferrer.this._typeReferenceBuilder.typeRef(RouteJvmModelInferrer.HTTP_SERVLET);
        RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _typeRef);
        EList<JvmAnnotationReference> _annotations = it.getAnnotations();
        JvmAnnotationReference _annotationRef = RouteJvmModelInferrer.this._annotationTypesBuilder.annotationRef(SuppressWarnings.class, "serial");
        RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotationRef);
        Iterable<Dependency> _filter = Iterables.<Dependency>filter(model.getDeclarations(), Dependency.class);
        for (final Dependency field : _filter) {
          EList<JvmMember> _members = it.getMembers();
          final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
            @Override
            public void apply(final JvmField it) {
              EList<JvmAnnotationReference> _annotations = it.getAnnotations();
              JvmAnnotationReference _annotationRef = RouteJvmModelInferrer.this._annotationTypesBuilder.annotationRef(Inject.class);
              RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotationRef);
              RouteJvmModelInferrer.this._jvmTypesBuilder.addAnnotations(it, field.getAnnotations());
            }
          };
          JvmField _field = RouteJvmModelInferrer.this._jvmTypesBuilder.toField(field, field.getName(), field.getType(), _function);
          RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members, _field);
        }
        final Function1<Route, Boolean> _function_1 = new Function1<Route, Boolean>() {
          @Override
          public Boolean apply(final Route it) {
            URL _url = it.getUrl();
            return Boolean.valueOf((_url != null));
          }
        };
        Iterable<Route> _filter_1 = IterableExtensions.<Route>filter(RouteJvmModelInferrer.this.routes(model), _function_1);
        for (final Route route : _filter_1) {
          {
            EList<JvmMember> _members_1 = it.getMembers();
            JvmField _routePatternField = RouteJvmModelInferrer.this.toRoutePatternField(route);
            RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_1, _routePatternField);
            XExpression _condition = route.getCondition();
            boolean _tripleNotEquals = (_condition != null);
            if (_tripleNotEquals) {
              EList<JvmMember> _members_2 = it.getMembers();
              JvmOperation _routeConditionMethod = RouteJvmModelInferrer.this.toRouteConditionMethod(route);
              RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _routeConditionMethod);
            }
            EList<JvmMember> _members_3 = it.getMembers();
            JvmOperation _routeCallMethod = RouteJvmModelInferrer.this.toRouteCallMethod(route);
            RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_3, _routeCallMethod);
          }
        }
        final Function1<Route, Boolean> _function_2 = new Function1<Route, Boolean>() {
          @Override
          public Boolean apply(final Route it) {
            RequestType _requestType = it.getRequestType();
            return Boolean.valueOf(Objects.equal(_requestType, RequestType.GET));
          }
        };
        final Iterable<Route> getRoutes = IterableExtensions.<Route>filter(RouteJvmModelInferrer.this.routes(model), _function_2);
        boolean _isEmpty = IterableExtensions.isEmpty(getRoutes);
        boolean _not = (!_isEmpty);
        if (_not) {
          EList<JvmMember> _members_1 = it.getMembers();
          JvmOperation _requestHandlerMethod = RouteJvmModelInferrer.this.toRequestHandlerMethod(model, "doGet", getRoutes);
          RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _requestHandlerMethod);
        }
        final Function1<Route, Boolean> _function_3 = new Function1<Route, Boolean>() {
          @Override
          public Boolean apply(final Route it) {
            RequestType _requestType = it.getRequestType();
            return Boolean.valueOf(Objects.equal(_requestType, RequestType.POST));
          }
        };
        final Iterable<Route> postRoutes = IterableExtensions.<Route>filter(RouteJvmModelInferrer.this.routes(model), _function_3);
        boolean _isEmpty_1 = IterableExtensions.isEmpty(postRoutes);
        boolean _not_1 = (!_isEmpty_1);
        if (_not_1) {
          EList<JvmMember> _members_2 = it.getMembers();
          JvmOperation _requestHandlerMethod_1 = RouteJvmModelInferrer.this.toRequestHandlerMethod(model, "doPost", postRoutes);
          RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _requestHandlerMethod_1);
        }
        final Function1<Route, Boolean> _function_4 = new Function1<Route, Boolean>() {
          @Override
          public Boolean apply(final Route it) {
            RequestType _requestType = it.getRequestType();
            return Boolean.valueOf(Objects.equal(_requestType, RequestType.PUT));
          }
        };
        final Iterable<Route> putRoutes = IterableExtensions.<Route>filter(RouteJvmModelInferrer.this.routes(model), _function_4);
        boolean _isEmpty_2 = IterableExtensions.isEmpty(putRoutes);
        boolean _not_2 = (!_isEmpty_2);
        if (_not_2) {
          EList<JvmMember> _members_3 = it.getMembers();
          JvmOperation _requestHandlerMethod_2 = RouteJvmModelInferrer.this.toRequestHandlerMethod(model, "doPut", putRoutes);
          RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_3, _requestHandlerMethod_2);
        }
        final Function1<Route, Boolean> _function_5 = new Function1<Route, Boolean>() {
          @Override
          public Boolean apply(final Route it) {
            RequestType _requestType = it.getRequestType();
            return Boolean.valueOf(Objects.equal(_requestType, RequestType.DELETE));
          }
        };
        final Iterable<Route> deleteRoutes = IterableExtensions.<Route>filter(RouteJvmModelInferrer.this.routes(model), _function_5);
        boolean _isEmpty_3 = IterableExtensions.isEmpty(deleteRoutes);
        boolean _not_3 = (!_isEmpty_3);
        if (_not_3) {
          EList<JvmMember> _members_4 = it.getMembers();
          JvmOperation _requestHandlerMethod_3 = RouteJvmModelInferrer.this.toRequestHandlerMethod(model, "doDelete", deleteRoutes);
          RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_4, _requestHandlerMethod_3);
        }
        final Function1<Route, Boolean> _function_6 = new Function1<Route, Boolean>() {
          @Override
          public Boolean apply(final Route it) {
            RequestType _requestType = it.getRequestType();
            return Boolean.valueOf(Objects.equal(_requestType, RequestType.HEAD));
          }
        };
        final Iterable<Route> headRoutes = IterableExtensions.<Route>filter(RouteJvmModelInferrer.this.routes(model), _function_6);
        boolean _isEmpty_4 = IterableExtensions.isEmpty(headRoutes);
        boolean _not_4 = (!_isEmpty_4);
        if (_not_4) {
          EList<JvmMember> _members_5 = it.getMembers();
          JvmOperation _requestHandlerMethod_4 = RouteJvmModelInferrer.this.toRequestHandlerMethod(model, "doHead", headRoutes);
          RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_5, _requestHandlerMethod_4);
        }
      }
    };
    acceptor.<JvmGenericType>accept(this._jvmTypesBuilder.toClass(model, this.javaClassName(model)), _function);
  }
  
  /**
   * computes the Servlet name
   */
  public String javaClassName(final Model it) {
    String _lastSegment = it.eResource().getURI().trimFileExtension().lastSegment();
    return ("routes." + _lastSegment);
  }
  
  /**
   * Creates a method for the route's target call.
   * Gives scope and live to the expression.
   */
  protected JvmOperation toRouteCallMethod(final Route route) {
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
      @Override
      public void apply(final JvmOperation it) {
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmFormalParameter _parameter = RouteJvmModelInferrer.this._jvmTypesBuilder.toParameter(route, "request", RouteJvmModelInferrer.this._typeReferenceBuilder.typeRef(RouteJvmModelInferrer.HTTP_REQUEST));
        RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        EList<JvmFormalParameter> _parameters_1 = it.getParameters();
        JvmFormalParameter _parameter_1 = RouteJvmModelInferrer.this._jvmTypesBuilder.toParameter(route, "response", RouteJvmModelInferrer.this._typeReferenceBuilder.typeRef(RouteJvmModelInferrer.HTTP_RESPONSE));
        RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
        EList<Variable> _variables = route.getUrl().getVariables();
        for (final Variable variable : _variables) {
          EList<JvmFormalParameter> _parameters_2 = it.getParameters();
          JvmFormalParameter _parameter_2 = RouteJvmModelInferrer.this._jvmTypesBuilder.toParameter(variable, variable.getName(), RouteJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class));
          RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_2, _parameter_2);
        }
        RouteJvmModelInferrer.this._jvmTypesBuilder.setBody(it, route.getCall());
      }
    };
    return this._jvmTypesBuilder.toMethod(route, this.nameOfRouteMethod(route), this._typeReferenceBuilder.typeRef(void.class), _function);
  }
  
  /**
   * Creates a field for the URL pattern
   */
  protected JvmField toRoutePatternField(final Route route) {
    URL _url = route.getUrl();
    int _index = this.index(route);
    String _plus = ("_pattern" + Integer.valueOf(_index));
    final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
      @Override
      public void apply(final JvmField it) {
        it.setStatic(true);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append(Pattern.class);
            _builder.append(".compile(\"");
            String _regExPattern = RouteJvmModelInferrer.this.getRegExPattern(NodeModelUtils.getNode(route.getUrl()).getText().trim(), route.getUrl().getVariables());
            _builder.append(_regExPattern);
            _builder.append("\")");
          }
        };
        RouteJvmModelInferrer.this._jvmTypesBuilder.setInitializer(it, _client);
      }
    };
    return this._jvmTypesBuilder.toField(_url, _plus, this._typeReferenceBuilder.typeRef(Pattern.class), _function);
  }
  
  /**
   * Creates a method for a route's when-part.
   * Gives scope and live to the expression.
   */
  protected JvmOperation toRouteConditionMethod(final Route route) {
    String _nameOfRouteMethod = this.nameOfRouteMethod(route);
    String _plus = (_nameOfRouteMethod + "Condition");
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
      @Override
      public void apply(final JvmOperation it) {
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmFormalParameter _parameter = RouteJvmModelInferrer.this._jvmTypesBuilder.toParameter(route, "request", RouteJvmModelInferrer.this._typeReferenceBuilder.typeRef(RouteJvmModelInferrer.HTTP_REQUEST));
        RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        EList<JvmFormalParameter> _parameters_1 = it.getParameters();
        JvmFormalParameter _parameter_1 = RouteJvmModelInferrer.this._jvmTypesBuilder.toParameter(route, "response", RouteJvmModelInferrer.this._typeReferenceBuilder.typeRef(RouteJvmModelInferrer.HTTP_RESPONSE));
        RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
        EList<Variable> _variables = route.getUrl().getVariables();
        for (final Variable variable : _variables) {
          EList<JvmFormalParameter> _parameters_2 = it.getParameters();
          JvmFormalParameter _parameter_2 = RouteJvmModelInferrer.this._jvmTypesBuilder.toParameter(variable, variable.getName(), RouteJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class));
          RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_2, _parameter_2);
        }
        RouteJvmModelInferrer.this._jvmTypesBuilder.setBody(it, route.getCondition());
      }
    };
    return this._jvmTypesBuilder.toMethod(route, _plus, this._typeReferenceBuilder.typeRef(Boolean.TYPE), _function);
  }
  
  /**
   * Creates a servlet request handling method for the given routes
   */
  protected JvmOperation toRequestHandlerMethod(final Model model, final String name, final Iterable<Route> routes) {
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
      @Override
      public void apply(final JvmOperation it) {
        EList<JvmAnnotationReference> _annotations = it.getAnnotations();
        JvmAnnotationReference _annotationRef = RouteJvmModelInferrer.this._annotationTypesBuilder.annotationRef(Override.class);
        RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotationRef);
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmFormalParameter _parameter = RouteJvmModelInferrer.this._jvmTypesBuilder.toParameter(model, "request", RouteJvmModelInferrer.this._typeReferenceBuilder.typeRef(RouteJvmModelInferrer.HTTP_REQUEST));
        RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        EList<JvmFormalParameter> _parameters_1 = it.getParameters();
        JvmFormalParameter _parameter_1 = RouteJvmModelInferrer.this._jvmTypesBuilder.toParameter(model, "response", RouteJvmModelInferrer.this._typeReferenceBuilder.typeRef(RouteJvmModelInferrer.HTTP_RESPONSE));
        RouteJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("String url =  request.getRequestURL().toString();");
            _builder.newLine();
            {
              for(final Route route : routes) {
                _builder.append("{");
                _builder.newLine();
                _builder.append("\t");
                _builder.append(Matcher.class, "\t");
                _builder.append(" _matcher = _pattern");
                int _index = RouteJvmModelInferrer.this.index(route);
                _builder.append(_index, "\t");
                _builder.append(".matcher(url);");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("if (_matcher.find()) {");
                _builder.newLine();
                {
                  EList<Variable> _variables = route.getUrl().getVariables();
                  for(final Variable variable : _variables) {
                    _builder.append("\t\t");
                    _builder.append("String ");
                    String _name = variable.getName();
                    _builder.append(_name, "\t\t");
                    _builder.append(" = _matcher.group(");
                    int _index_1 = RouteJvmModelInferrer.this.index(variable);
                    int _plus = (_index_1 + 1);
                    _builder.append(_plus, "\t\t");
                    _builder.append(");");
                    _builder.newLineIfNotEmpty();
                  }
                }
                _builder.append("\t\t");
                StringConcatenation _builder_1 = new StringConcatenation();
                String _nameOfRouteMethod = RouteJvmModelInferrer.this.nameOfRouteMethod(route);
                _builder_1.append(_nameOfRouteMethod);
                _builder_1.append("(request, response");
                {
                  EList<Variable> _variables_1 = route.getUrl().getVariables();
                  for(final Variable v : _variables_1) {
                    _builder_1.append(", ");
                    String _name_1 = v.getName();
                    _builder_1.append(_name_1);
                  }
                }
                _builder_1.append(");");
                final String routeMethodCall = _builder_1.toString();
                _builder.newLineIfNotEmpty();
                {
                  XExpression _condition = route.getCondition();
                  boolean _tripleNotEquals = (_condition != null);
                  if (_tripleNotEquals) {
                    _builder.append("\t\t");
                    _builder.append("if (");
                    String _nameOfRouteMethod_1 = RouteJvmModelInferrer.this.nameOfRouteMethod(route);
                    _builder.append(_nameOfRouteMethod_1, "\t\t");
                    _builder.append("Condition(request, response");
                    {
                      EList<Variable> _variables_2 = route.getUrl().getVariables();
                      boolean _hasElements = false;
                      for(final Variable v_1 : _variables_2) {
                        if (!_hasElements) {
                          _hasElements = true;
                          _builder.append(", ", "\t\t");
                        } else {
                          _builder.appendImmediate(", ", "\t\t");
                        }
                        String _name_2 = v_1.getName();
                        _builder.append(_name_2, "\t\t");
                      }
                    }
                    _builder.append(")) {");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t");
                    _builder.append("\t");
                    _builder.append(routeMethodCall, "\t\t\t");
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
                    _builder.append(routeMethodCall, "\t\t");
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
          }
        };
        RouteJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
      }
    };
    return this._jvmTypesBuilder.toMethod(model, name, this._typeReferenceBuilder.typeRef(Void.TYPE), _function);
  }
  
  protected String nameOfRouteMethod(final Route route) {
    String _firstUpper = StringExtensions.toFirstUpper(route.getRequestType().getLiteral().toLowerCase());
    String _plus = ("_do" + _firstUpper);
    int _index = this.index(route);
    return (_plus + Integer.valueOf(_index));
  }
  
  /**
   * a generic method computing the index of an AST object between its siblings
   */
  protected int index(final EObject obj) {
    return obj.eContainer().eContents().indexOf(obj);
  }
  
  protected String getRegExPattern(final String originalPattern, final List<Variable> variables) {
    String pattern = originalPattern;
    for (final Variable variable : variables) {
      boolean _isWildcard = this.isWildcard(variable);
      if (_isWildcard) {
        String _name = variable.getName();
        String _plus = ("(:" + _name);
        String _plus_1 = (_plus + "\\*)");
        pattern = pattern.replaceAll(_plus_1, "(.+)");
      } else {
        String _name_1 = variable.getName();
        String _plus_2 = ("(:" + _name_1);
        String _plus_3 = (_plus_2 + ")");
        pattern = originalPattern.replaceAll(_plus_3, "(\\\\\\\\w+)");
      }
    }
    return pattern;
  }
  
  public Iterable<Route> routes(final Model model) {
    return Iterables.<Route>filter(model.getDeclarations(), Route.class);
  }
  
  public boolean isWildcard(final Variable it) {
    boolean _switchResult = false;
    EObject _eContainer = it.eContainer();
    final EObject parent = _eContainer;
    boolean _matched = false;
    if (parent instanceof URL) {
      _matched=true;
      _switchResult = (Objects.equal(IterableExtensions.<Variable>last(((URL)parent).getVariables()), it) && ((URL)parent).isWildcard());
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
