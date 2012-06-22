package xtend;

import cradle.MyTasks;
import cradle.MyTasks.MyTasksParams;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class MyClass {
  public static void main(final String[] args) {
    final Procedure1<MyTasksParams> _function = new Procedure1<MyTasksParams>() {
        public void apply(final MyTasksParams it) {
          it.name = "Hello from Xtend!";
        }
      };
    MyTasks.myTask(_function);
  }
}
