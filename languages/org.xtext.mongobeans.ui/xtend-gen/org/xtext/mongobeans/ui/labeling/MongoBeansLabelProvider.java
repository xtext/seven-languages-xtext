package org.xtext.mongobeans.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.xbase.ui.labeling.XbaseLabelProvider;
import org.xtext.mongobeans.mongoBeans.Import;
import org.xtext.mongobeans.mongoBeans.MongoBean;
import org.xtext.mongobeans.mongoBeans.MongoOperation;
import org.xtext.mongobeans.mongoBeans.MongoProperty;
import org.xtext.mongobeans.mongoBeans.PackageDeclaration;

@SuppressWarnings("all")
public class MongoBeansLabelProvider extends XbaseLabelProvider {
  @Inject
  public MongoBeansLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  public Object image(final Object element) {
    Object _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (element instanceof MongoBean) {
        final MongoBean _mongoBean = (MongoBean)element;
        _matched=true;
        _switchResult = "Letter-B-blue-icon.png";
      }
    }
    if (!_matched) {
      if (element instanceof MongoProperty) {
        final MongoProperty _mongoProperty = (MongoProperty)element;
        _matched=true;
        _switchResult = "Letter-P-orange-icon.png";
      }
    }
    if (!_matched) {
      if (element instanceof MongoOperation) {
        final MongoOperation _mongoOperation = (MongoOperation)element;
        _matched=true;
        _switchResult = "Letter-O-red-icon.png";
      }
    }
    if (!_matched) {
      if (element instanceof Import) {
        final Import _import = (Import)element;
        _matched=true;
        _switchResult = "imp_obj.gif";
      }
    }
    if (!_matched) {
      if (element instanceof PackageDeclaration) {
        final PackageDeclaration _packageDeclaration = (PackageDeclaration)element;
        _matched=true;
        _switchResult = "package_obj.gif";
      }
    }
    if (!_matched) {
      Object _image = super.image(element);
      _switchResult = _image;
    }
    return _switchResult;
  }
}
