import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public class Section {
  private final String _title;
  
  public String getTitle() {
    return this._title;
  }
  
  private final String _description;
  
  public String getDescription() {
    return this._description;
  }
  
  private final String _body;
  
  public String getBody() {
    return this._body;
  }
  
  public Section(final String title, final String description, final String body) {
    super();
    this._title = title;
    this._description = description;
    this._body = body;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_title== null) ? 0 : _title.hashCode());
    result = prime * result + ((_description== null) ? 0 : _description.hashCode());
    result = prime * result + ((_body== null) ? 0 : _body.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Section other = (Section) obj;
    if (_title == null) {
      if (other._title != null)
        return false;
    } else if (!_title.equals(other._title))
      return false;
    if (_description == null) {
      if (other._description != null)
        return false;
    } else if (!_description.equals(other._description))
      return false;
    if (_body == null) {
      if (other._body != null)
        return false;
    } else if (!_body.equals(other._body))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
