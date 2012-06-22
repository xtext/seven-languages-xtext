package org.xtext.cradle.ui.highlighting;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.io.File;
import java.util.Arrays;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.access.jdt.IJavaProjectProvider;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.xtext.cradle.lib.FileExtensions;
import org.xtext.cradle.lib.Literals;

@SuppressWarnings("all")
public class FileInterpreter {
  @Inject
  private IJavaProjectProvider _iJavaProjectProvider;
  
  protected File _getFile(final XExpression lit) {
    return null;
  }
  
  protected File _getFile(final XBinaryOperation call) {
    File _xblockexpression = null;
    {
      boolean _or = false;
      JvmIdentifiableElement _feature = call.getFeature();
      boolean _equals = Objects.equal(_feature, null);
      if (_equals) {
        _or = true;
      } else {
        JvmIdentifiableElement _feature_1 = call.getFeature();
        boolean _eIsProxy = _feature_1.eIsProxy();
        _or = (_equals || _eIsProxy);
      }
      if (_or) {
        return null;
      }
      File _switchResult = null;
      JvmIdentifiableElement _feature_2 = call.getFeature();
      String _simpleName = _feature_2.getSimpleName();
      final String _switchValue = _simpleName;
      boolean _matched = false;
      if (!_matched) {
        if (Objects.equal(_switchValue,"operator_divide")) {
          _matched=true;
          File _xifexpression = null;
          XExpression _rightOperand = call.getRightOperand();
          if ((_rightOperand instanceof XStringLiteral)) {
            File _xtrycatchfinallyexpression = null;
            try {
              XExpression _leftOperand = call.getLeftOperand();
              final File left = this.getFile(_leftOperand);
              XExpression _rightOperand_1 = call.getRightOperand();
              final String right = ((XStringLiteral) _rightOperand_1).getValue();
              return FileExtensions.operator_divide(left, right);
            } catch (final Throwable _t) {
              if (_t instanceof Throwable) {
                final Throwable t = (Throwable)_t;
                _xtrycatchfinallyexpression = null;
              } else {
                throw Exceptions.sneakyThrow(_t);
              }
            }
            _xifexpression = _xtrycatchfinallyexpression;
          }
          _switchResult = _xifexpression;
        }
      }
      _xblockexpression = (_switchResult);
    }
    return _xblockexpression;
  }
  
  protected File _getFile(final XFeatureCall call) {
    File _xblockexpression = null;
    {
      final JvmIdentifiableElement feature = call.getFeature();
      File _xifexpression = null;
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(feature, null));
      if (!_notEquals) {
        _and = false;
      } else {
        boolean _eIsProxy = feature.eIsProxy();
        boolean _not = (!_eIsProxy);
        _and = (_notEquals && _not);
      }
      if (_and) {
        File _switchResult = null;
        boolean _matched = false;
        if (!_matched) {
          if (feature instanceof JvmMember) {
            final JvmMember _jvmMember = (JvmMember)feature;
            _matched=true;
            File _staticFile = this.getStaticFile(_jvmMember);
            _switchResult = _staticFile;
          }
        }
        if (!_matched) {
          if (feature instanceof XVariableDeclaration) {
            final XVariableDeclaration _xVariableDeclaration = (XVariableDeclaration)feature;
            _matched=true;
            XExpression _right = _xVariableDeclaration.getRight();
            File _file = this.getFile(_right);
            _switchResult = _file;
          }
        }
        _xifexpression = _switchResult;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  public IProject getProject(final EObject ctx) {
    Resource _eResource = ctx.eResource();
    ResourceSet _resourceSet = _eResource.getResourceSet();
    IJavaProject _javaProject = this._iJavaProjectProvider.getJavaProject(_resourceSet);
    IProject _project = _javaProject==null?(IProject)null:_javaProject.getProject();
    return _project;
  }
  
  private File _getStaticFile(final JvmOperation call) {
    File _xblockexpression = null;
    {
      boolean _or = false;
      EList<JvmFormalParameter> _parameters = call.getParameters();
      boolean _isEmpty = _parameters.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _or = true;
      } else {
        boolean _isStatic = call.isStatic();
        boolean _not_1 = (!_isStatic);
        _or = (_not || _not_1);
      }
      if (_or) {
        return null;
      }
      File _xifexpression = null;
      JvmDeclaredType _declaringType = call.getDeclaringType();
      String _qualifiedName = _declaringType.getQualifiedName();
      Package _package = Literals.class.getPackage();
      String _name = _package.getName();
      boolean _startsWith = _qualifiedName.startsWith(_name);
      if (_startsWith) {
        File _switchResult = null;
        String _simpleName = call.getSimpleName();
        final String _switchValue = _simpleName;
        boolean _matched = false;
        if (!_matched) {
          if (Objects.equal(_switchValue,"git")) {
            _matched=true;
            IProject _project = this.getProject(call);
            IPath _location = _project==null?(IPath)null:_project.getLocation();
            File _file = _location==null?(File)null:_location.toFile();
            File _containingGitRepository = _file==null?(File)null:FileExtensions.containingGitRepository(_file);
            _switchResult = _containingGitRepository;
          }
        }
        if (!_matched) {
          if (Objects.equal(_switchValue,"project")) {
            _matched=true;
            IProject _project_1 = this.getProject(call);
            IPath _location_1 = _project_1==null?(IPath)null:_project_1.getLocation();
            File _file_1 = _location_1==null?(File)null:_location_1.toFile();
            _switchResult = _file_1;
          }
        }
        if (!_matched) {
          if (Objects.equal(_switchValue,"workspace")) {
            _matched=true;
            IProject _project_2 = this.getProject(call);
            IWorkspace _workspace = _project_2==null?(IWorkspace)null:_project_2.getWorkspace();
            IWorkspaceRoot _root = _workspace==null?(IWorkspaceRoot)null:_workspace.getRoot();
            IPath _location_2 = _root==null?(IPath)null:_root.getLocation();
            File _file_2 = _location_2==null?(File)null:_location_2.toFile();
            _switchResult = _file_2;
          }
        }
        if (!_matched) {
          if (Objects.equal(_switchValue,"file")) {
            _matched=true;
            File _file_3 = new File("/");
            _switchResult = _file_3;
          }
        }
        _xifexpression = _switchResult;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  private File _getStaticFile(final JvmMember call) {
    return null;
  }
  
  public File getFile(final XExpression call) {
    if (call instanceof XBinaryOperation) {
      return _getFile((XBinaryOperation)call);
    } else if (call instanceof XFeatureCall) {
      return _getFile((XFeatureCall)call);
    } else if (call != null) {
      return _getFile(call);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(call).toString());
    }
  }
  
  private File getStaticFile(final JvmMember call) {
    if (call instanceof JvmOperation) {
      return _getStaticFile((JvmOperation)call);
    } else if (call != null) {
      return _getStaticFile(call);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(call).toString());
    }
  }
}
