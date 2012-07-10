package org.xtext.tortoiseshell.lib;

import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;
import org.xtext.tortoiseshell.lib.ITortoiseEvent;
import org.xtext.tortoiseshell.lib.Tortoise;

@Data
@SuppressWarnings("all")
public class TurnEvent implements ITortoiseEvent {
  private final Tortoise _tortoise;
  
  public Tortoise getTortoise() {
    return this._tortoise;
  }
  
  private final double _oldAngle;
  
  public double getOldAngle() {
    return this._oldAngle;
  }
  
  public TurnEvent(final Tortoise tortoise, final double oldAngle) {
    super();
    this._tortoise = tortoise;
    this._oldAngle = oldAngle;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_tortoise== null) ? 0 : _tortoise.hashCode());
    result = prime * result + (int) (Double.doubleToLongBits(_oldAngle) ^ (Double.doubleToLongBits(_oldAngle) >>> 32));
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
    TurnEvent other = (TurnEvent) obj;
    if (_tortoise == null) {
      if (other._tortoise != null)
        return false;
    } else if (!_tortoise.equals(other._tortoise))
      return false;
    if (Double.doubleToLongBits(other._oldAngle) != Double.doubleToLongBits(_oldAngle))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
