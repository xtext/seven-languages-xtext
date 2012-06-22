package org.xtext.cradle.lib.impl;

import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.xtext.cradle.lib.impl.TaskSkippedException;
import org.xtext.cradle.lib.impl.TaskStateImpl;

@SuppressWarnings("all")
public class TaskState {
  private final static ThreadLocal<TaskStateImpl> state = new Function0<ThreadLocal<TaskStateImpl>>() {
    public ThreadLocal<TaskStateImpl> apply() {
      ThreadLocal<TaskStateImpl> _threadLocal = new ThreadLocal<TaskStateImpl>();
      return _threadLocal;
    }
  }.apply();
  
  private static TaskStateImpl getImpl() {
    TaskStateImpl _get = TaskState.state.get();
    TaskStateImpl _taskStateImpl = new TaskStateImpl();
    TaskStateImpl _elvis = ObjectExtensions.<TaskStateImpl>operator_elvis(_get, _taskStateImpl);
    final Procedure1<TaskStateImpl> _function = new Procedure1<TaskStateImpl>() {
        public void apply(final TaskStateImpl it) {
          TaskState.state.set(it);
        }
      };
    TaskStateImpl _doubleArrow = ObjectExtensions.<TaskStateImpl>operator_doubleArrow(_elvis, _function);
    return _doubleArrow;
  }
  
  public static void setMaySkip(final boolean value) {
    TaskStateImpl _impl = TaskState.getImpl();
    _impl.setMaySkip(value);
  }
  
  public static void skipTask(final String message) {
    TaskStateImpl _impl = TaskState.getImpl();
    boolean _isMaySkip = _impl.isMaySkip();
    if (_isMaySkip) {
      TaskState.setMaySkip(false);
      TaskSkippedException _taskSkippedException = new TaskSkippedException(message);
      throw _taskSkippedException;
    }
  }
  
  public static boolean addTaskFinishListener(final Procedure2<? super String,? super Throwable> listener) {
    TaskStateImpl _impl = TaskState.getImpl();
    ArrayList<Procedure2<? super String,? super Throwable>> _finishListeners = _impl.getFinishListeners();
    boolean _add = _finishListeners.add(listener);
    return _add;
  }
  
  public static void fireFinishTask(final String name, final Throwable t) {
    TaskStateImpl _impl = TaskState.getImpl();
    final ArrayList<Procedure2<? super String,? super Throwable>> listeners = _impl.getFinishListeners();
    final Procedure1<Procedure2<? super String,? super Throwable>> _function = new Procedure1<Procedure2<? super String,? super Throwable>>() {
        public void apply(final Procedure2<? super String,? super Throwable> it) {
          it.apply(name, t);
        }
      };
    IterableExtensions.<Procedure2<? super String,? super Throwable>>forEach(listeners, _function);
    listeners.clear();
  }
}
