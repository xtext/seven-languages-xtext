import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@Data
@SuppressWarnings("all")
public class Section {
  private final String title;
  
  private final String description;
  
  private final String body;
  
  public Section(final String title, final String description, final String body) {
    super();
    this.title = title;
    this.description = description;
    this.body = body;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.title== null) ? 0 : this.title.hashCode());
    result = prime * result + ((this.description== null) ? 0 : this.description.hashCode());
    return prime * result + ((this.body== null) ? 0 : this.body.hashCode());
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
    if (this.title == null) {
      if (other.title != null)
        return false;
    } else if (!this.title.equals(other.title))
      return false;
    if (this.description == null) {
      if (other.description != null)
        return false;
    } else if (!this.description.equals(other.description))
      return false;
    if (this.body == null) {
      if (other.body != null)
        return false;
    } else if (!this.body.equals(other.body))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("title", this.title);
    b.add("description", this.description);
    b.add("body", this.body);
    return b.toString();
  }
  
  @Pure
  public String getTitle() {
    return this.title;
  }
  
  @Pure
  public String getDescription() {
    return this.description;
  }
  
  @Pure
  public String getBody() {
    return this.body;
  }
}
