package org.xtext.template.jvmmodel;

import java.util.Map;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public class StmtCtx {
  private final ITreeAppendable _out;
  
  public ITreeAppendable getOut() {
    return this._out;
  }
  
  private final Map<XExpression,String> _expr2call;
  
  public Map<XExpression,String> getExpr2call() {
    return this._expr2call;
  }
  
  public StmtCtx(final ITreeAppendable out, final Map<XExpression,String> expr2call) {
    super();
    this._out = out;
    this._expr2call = expr2call;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_out== null) ? 0 : _out.hashCode());
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
    StmtCtx other = (StmtCtx) obj;
    if (_out == null) {
      if (other._out != null)
        return false;
    } else if (!_out.equals(other._out))
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
