import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class MyWebsite {
  private String title = "No Title";

  public void setTitle(final String title) {
    this.title = title;
  }

  public String getTitle() {
    return this.title;
  }

  private String author = "No Author";

  public void setAuthor(final String author) {
    this.author = author;
  }

  public String getAuthor() {
    return this.author;
  }

  private String description = "No Description";

  public void setDescription(final String description) {
    this.description = description;
  }

  public String getDescription() {
    return this.description;
  }

  private ArrayList<Section> sections = new ArrayList<Section>();

  public void setSections(final ArrayList<Section> sections) {
    this.sections = sections;
  }

  public ArrayList<Section> getSections() {
    return this.sections;
  }

  private CharSequence generate() {
    StringBuilder _appendable = new StringBuilder();
    
    _appendable.append(org.eclipse.xtext.xbase.lib.ObjectExtensions.operator_elvis("-->\n<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n\t<meta charset=\"utf-8\">\n\t<title>",""));
    _appendable.append(org.eclipse.xtext.xbase.lib.ObjectExtensions.operator_elvis(this.title,""));
    _appendable.append(org.eclipse.xtext.xbase.lib.ObjectExtensions.operator_elvis("</title>\n\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n\t<meta name=\"description\"\n\t\tcontent=\"",""));
    _appendable.append(org.eclipse.xtext.xbase.lib.ObjectExtensions.operator_elvis(this.description,""));
    _appendable.append(org.eclipse.xtext.xbase.lib.ObjectExtensions.operator_elvis("\">\n\t<meta name=\"author\" content=\"",""));
    _appendable.append(org.eclipse.xtext.xbase.lib.ObjectExtensions.operator_elvis(this.author,""));
    _appendable.append(org.eclipse.xtext.xbase.lib.ObjectExtensions.operator_elvis("\">\n</head>\n<body>\n",""));
    StringBuilder _forLoopResult = new StringBuilder();
    for (final Section element : this.sections) {
      StringBuilder _appendable_1 = new StringBuilder();
      
      _appendable_1.append(org.eclipse.xtext.xbase.lib.ObjectExtensions.operator_elvis("\n\t<div class=\"section\">\n\t\t<h1>",""));
      String _title = element.getTitle();
      _appendable_1.append(org.eclipse.xtext.xbase.lib.ObjectExtensions.operator_elvis(_title,""));
      _appendable_1.append(org.eclipse.xtext.xbase.lib.ObjectExtensions.operator_elvis("</h1>\n\t\t",""));
      Object _richstringif = null;
      String _description = element.getDescription();
      boolean _tripleNotEquals = (_description != null);
      if (_tripleNotEquals) {
        StringBuilder _appendable_2 = new StringBuilder();
        
        _appendable_2.append(org.eclipse.xtext.xbase.lib.ObjectExtensions.operator_elvis("\n\t\t\t<p>",""));
        String _description_1 = element.getDescription();
        _appendable_2.append(org.eclipse.xtext.xbase.lib.ObjectExtensions.operator_elvis(_description_1,""));
        _appendable_2.append(org.eclipse.xtext.xbase.lib.ObjectExtensions.operator_elvis("</p>\n\t\t",""));
        _richstringif = ((Object)_appendable_2);
      }
      _appendable_1.append(org.eclipse.xtext.xbase.lib.ObjectExtensions.operator_elvis(_richstringif,""));
      _appendable_1.append(org.eclipse.xtext.xbase.lib.ObjectExtensions.operator_elvis("\n\t\t<p>",""));
      String _body = element.getBody();
      _appendable_1.append(org.eclipse.xtext.xbase.lib.ObjectExtensions.operator_elvis(_body,""));
      _appendable_1.append(org.eclipse.xtext.xbase.lib.ObjectExtensions.operator_elvis("</p>\n\t</div>\n",""));
      _forLoopResult.append(_appendable_1);
    }
    _appendable.append(org.eclipse.xtext.xbase.lib.ObjectExtensions.operator_elvis(_forLoopResult,""));
    _appendable.append(org.eclipse.xtext.xbase.lib.ObjectExtensions.operator_elvis("\n</body>\n</html>",""));
    return ((CharSequence)_appendable);
  }

  public String generate(final Procedure1<MyWebsite> init) {
    if (init != null)
    	init.apply(this);
    String result = generate().toString();
    // remove leading -->
    result = result.replaceAll("^-->\\n","");
    // trim multi-newline to single newline
    result = result.replaceAll("\\n\\s*\\n","\n");
    return result;
  }
}
