/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.tortoiseshell.lib;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@Data
@SuppressWarnings("all")
public class MoveEvent implements ITortoiseEvent {
  private final Tortoise tortoise;
  
  private final Point oldPosition;
  
  public MoveEvent(final Tortoise tortoise, final Point oldPosition) {
    super();
    this.tortoise = tortoise;
    this.oldPosition = oldPosition;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.tortoise== null) ? 0 : this.tortoise.hashCode());
    return prime * result + ((this.oldPosition== null) ? 0 : this.oldPosition.hashCode());
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
    MoveEvent other = (MoveEvent) obj;
    if (this.tortoise == null) {
      if (other.tortoise != null)
        return false;
    } else if (!this.tortoise.equals(other.tortoise))
      return false;
    if (this.oldPosition == null) {
      if (other.oldPosition != null)
        return false;
    } else if (!this.oldPosition.equals(other.oldPosition))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("tortoise", this.tortoise);
    b.add("oldPosition", this.oldPosition);
    return b.toString();
  }
  
  @Pure
  @Override
  public Tortoise getTortoise() {
    return this.tortoise;
  }
  
  @Pure
  public Point getOldPosition() {
    return this.oldPosition;
  }
}
