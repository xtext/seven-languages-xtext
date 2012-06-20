package org.xtext.template.jvmmodel;

import java.util.List;
import java.util.Map;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public class ExpCtx {
  private final List<JvmMember> _members;
  
  public List<JvmMember> getMembers() {
    return this._members;
  }
  
  private final Map<XExpression,String> _expr2call;
  
  public Map<XExpression,String> getExpr2call() {
    return this._expr2call;
  }
  
  public ExpCtx(final List<JvmMember> members, final Map<XExpression,String> expr2call) {
    super();
    this._members = members;
    this._expr2call = expr2call;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_members== null) ? 0 : _members.hashCode());
    result = prime * result + ((_expr2call== null) ? 0 : _expr2call.hashCode());
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
    ExpCtx other = (ExpCtx) obj;
    if (_members == null) {
      if (other._members != null)
        return false;
    } else if (!_members.equals(other._members))
      return false;
    if (_expr2call == null) {
      if (other._expr2call != null)
        return false;
    } else if (!_expr2call.equals(other._expr2call))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
