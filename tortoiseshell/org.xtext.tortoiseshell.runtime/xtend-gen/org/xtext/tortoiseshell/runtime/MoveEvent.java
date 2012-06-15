package org.xtext.tortoiseshell.runtime;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;
import org.xtext.tortoiseshell.runtime.ITortoiseEvent;
import org.xtext.tortoiseshell.runtime.Tortoise;

@Data
@SuppressWarnings("all")
public class MoveEvent implements ITortoiseEvent {
  private final Tortoise _tortoise;
  
  public Tortoise getTortoise() {
    return this._tortoise;
  }
  
  private final Point _oldPosition;
  
  public Point getOldPosition() {
    return this._oldPosition;
  }
  
  public MoveEvent(final Tortoise tortoise, final Point oldPosition) {
    super();
    this._tortoise = tortoise;
    this._oldPosition = oldPosition;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_tortoise== null) ? 0 : _tortoise.hashCode());
    result = prime * result + ((_oldPosition== null) ? 0 : _oldPosition.hashCode());
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
    MoveEvent other = (MoveEvent) obj;
    if (_tortoise == null) {
      if (other._tortoise != null)
        return false;
    } else if (!_tortoise.equals(other._tortoise))
      return false;
    if (_oldPosition == null) {
      if (other._oldPosition != null)
        return false;
    } else if (!_oldPosition.equals(other._oldPosition))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
