package org.xtext.httprouting.ui.labeling;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.xbase.ui.labeling.XbaseLabelProvider;
import org.xtext.httprouting.route.Condition;
import org.xtext.httprouting.route.Key;
import org.xtext.httprouting.route.RequestType;
import org.xtext.httprouting.route.Route;
import org.xtext.httprouting.route.URL;
import org.xtext.httprouting.route.Variable;

@SuppressWarnings("all")
public class RouteLabelProvider extends XbaseLabelProvider {
  @Inject
  public RouteLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  public String text(final Route route) {
    RequestType _requestType = route.getRequestType();
    String result = _requestType.getName();
    URL _url = route.getUrl();
    boolean _notEquals = (!Objects.equal(_url, null));
    if (_notEquals) {
      String _plus = (result + " ");
      URL _url_1 = route.getUrl();
      String _text = this.getText(_url_1);
      String _plus_1 = (_plus + _text);
      result = _plus_1;
    }
    return result;
  }
  
  public String text(final Variable v) {
    return v.getName();
  }
  
  public Object image(final Variable v) {
    return null;
  }
  
  public String text(final URL url) {
    final ICompositeNode node = NodeModelUtils.getNode(url);
    return node.getText();
  }
  
  public Object image(final URL url) {
    return null;
  }
  
  public String text(final Key key) {
    final ICompositeNode node = NodeModelUtils.getNode(key);
    return node.getText();
  }
  
  public Object image(final Key key) {
    return null;
  }
  
  public String text(final Condition condition) {
    final ICompositeNode node = NodeModelUtils.getNode(condition);
    return node.getText();
  }
  
  public Object image(final Condition cond) {
    return null;
  }
}
