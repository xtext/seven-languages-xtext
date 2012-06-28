package org.xtext.builddsl.lib.impl;

import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

@SuppressWarnings("all")
public class TaskStateImpl {
  private boolean _maySkip = true;
  
  public boolean isMaySkip() {
    return this._maySkip;
  }
  
  public void setMaySkip(final boolean maySkip) {
    this._maySkip = maySkip;
  }
  
  private final ArrayList<Procedure2<? super String,? super Throwable>> _finishListeners = new Function0<ArrayList<Procedure2<? super String,? super Throwable>>>() {
    public ArrayList<Procedure2<? super String,? super Throwable>> apply() {
      ArrayList<Procedure2<? super String,? super Throwable>> _newArrayList = CollectionLiterals.<Procedure2<? super String,? super Throwable>>newArrayList();
      return _newArrayList;
    }
  }.apply();
  
  public ArrayList<Procedure2<? super String,? super Throwable>> getFinishListeners() {
    return this._finishListeners;
  }
}
