/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.tortoiseshell.lib.view;

import com.google.inject.Inject;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.progress.UIJob;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.xtext.tortoiseshell.lib.view.Animation;
import org.xtext.tortoiseshell.lib.view.TortoiseView;

@SuppressWarnings("all")
public class Animator extends UIJob {
  private final int UPDATE_INTERVAL = 20;
  
  @Inject
  private TortoiseView view;
  
  private long lastStart;
  
  private boolean isScheduled;
  
  private Queue<Animation> animationQueue = new ConcurrentLinkedQueue<Animation>();
  
  private boolean isStop;
  
  private boolean isAnimated = true;
  
  public Animator() {
    super("Tortoise Animator");
    this.isScheduled = false;
  }
  
  public void addAnimation(final Animation animation) {
    if (this.isAnimated) {
      this.animationQueue.add(animation);
      if (((!this.isScheduled) && (!this.isStop))) {
        this.schedule(this.UPDATE_INTERVAL);
        this.isScheduled = true;
        this.lastStart = System.currentTimeMillis();
      }
    } else {
      animation.set(this.view.getTortoiseFigure(), 1);
    }
  }
  
  public boolean setAnimated(final boolean isAnimated) {
    boolean _xblockexpression = false;
    {
      this.stop();
      _xblockexpression = this.isAnimated = isAnimated;
    }
    return _xblockexpression;
  }
  
  public boolean stop() {
    try {
      boolean _xblockexpression = false;
      {
        this.isStop = true;
        while ((this.isScheduled && this.isStop)) {
          Display _current = Display.getCurrent();
          boolean _tripleNotEquals = (_current != null);
          if (_tripleNotEquals) {
            Display.getCurrent().readAndDispatch();
          } else {
            this.join();
          }
        }
        this.animationQueue.clear();
        this.isStop = false;
        _xblockexpression = this.isScheduled = false;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public IStatus runInUIThread(final IProgressMonitor monitor) {
    IStatus _xblockexpression = null;
    {
      if (this.isStop) {
        this.isStop = false;
        this.isScheduled = false;
      } else {
        final long now = System.currentTimeMillis();
        Animation currentAnimation = this.animationQueue.peek();
        while (((currentAnimation != null) && (now >= (this.lastStart + currentAnimation.getDelay())))) {
          {
            this.animationQueue.poll().set(this.view.getTortoiseFigure(), 1);
            int _delay = currentAnimation.getDelay();
            long _plus = (this.lastStart + _delay);
            this.lastStart = _plus;
            currentAnimation = this.animationQueue.peek();
          }
        }
        if ((currentAnimation != null)) {
          int _delay = currentAnimation.getDelay();
          final double alpha = (((double) (now - this.lastStart)) / _delay);
          currentAnimation.set(this.view.getTortoiseFigure(), alpha);
          this.schedule(this.UPDATE_INTERVAL);
        } else {
          this.isScheduled = false;
        }
      }
      _xblockexpression = Status.OK_STATUS;
    }
    return _xblockexpression;
  }
}
