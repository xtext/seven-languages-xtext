import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public class Section {
  private final String _title;
  
  private final String _description;
  
  private final String _body;
  
  public Section(final String title, final String description, final String body) {
    super();
    this._title = title;
    this._description = description;
    this._body = body;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this._title== null) ? 0 : this._title.hashCode());
    result = prime * result + ((this._description== null) ? 0 : this._description.hashCode());
    result = prime * result + ((this._body== null) ? 0 : this._body.hashCode());
    return result;
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Section other = (Section) obj;
    if (this._title == null) {
      if (other._title != null)
        return false;
    } else if (!this._title.equals(other._title))
      return false;
    if (this._description == null) {
      if (other._description != null)
        return false;
    } else if (!this._description.equals(other._description))
      return false;
    if (this._body == null) {
      if (other._body != null)
        return false;
    } else if (!this._body.equals(other._body))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
  
  @Pure
  public String getTitle() {
    return this._title;
  }
  
  @Pure
  public String getDescription() {
    return this._description;
  }
  
  @Pure
  public String getBody() {
    return this._body;
  }
}
