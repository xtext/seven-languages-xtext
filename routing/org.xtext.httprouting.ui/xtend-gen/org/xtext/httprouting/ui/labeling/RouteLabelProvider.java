package org.xtext.httprouting.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.xbase.ui.labeling.XbaseLabelProvider;
import org.xtext.httprouting.route.RequestType;
import org.xtext.httprouting.route.Route;
import org.xtext.httprouting.route.URL;

@SuppressWarnings("all")
public class RouteLabelProvider extends XbaseLabelProvider {
  @Inject
  public RouteLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  public CharSequence text(final Route route) {
    StringConcatenation _builder = new StringConcatenation();
    RequestType _requestType = route.getRequestType();
    String _name = _requestType.name();
    _builder.append(_name, "");
    _builder.append(" ");
    URL _url = route.getUrl();
    ICompositeNode _node = NodeModelUtils.getNode(_url);
    String _text = _node.getText();
    _builder.append(_text, "");
    return _builder;
  }
}
