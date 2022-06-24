/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.tortoiseshell.lib;

import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@Data
@SuppressWarnings("all")
public class TurnEvent implements ITortoiseEvent {
  private final Tortoise tortoise;

  private final double oldAngle;

  public TurnEvent(final Tortoise tortoise, final double oldAngle) {
    super();
    this.tortoise = tortoise;
    this.oldAngle = oldAngle;
  }

  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.tortoise== null) ? 0 : this.tortoise.hashCode());
    return prime * result + (int) (Double.doubleToLongBits(this.oldAngle) ^ (Double.doubleToLongBits(this.oldAngle) >>> 32));
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
    TurnEvent other = (TurnEvent) obj;
    if (this.tortoise == null) {
      if (other.tortoise != null)
        return false;
    } else if (!this.tortoise.equals(other.tortoise))
      return false;
    if (Double.doubleToLongBits(other.oldAngle) != Double.doubleToLongBits(this.oldAngle))
      return false; 
    return true;
  }

  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("tortoise", this.tortoise);
    b.add("oldAngle", this.oldAngle);
    return b.toString();
  }

  @Pure
  @Override
  public Tortoise getTortoise() {
    return this.tortoise;
  }

  @Pure
  public double getOldAngle() {
    return this.oldAngle;
  }
}
