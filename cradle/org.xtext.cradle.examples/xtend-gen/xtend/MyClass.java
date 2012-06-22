package xtend;

import cradle.MyTasks;
import cradle.MyTasks.Params;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class MyClass {
  public static void main(final String[] args) {
    final Procedure1<Params> _function = new Procedure1<Params>() {
        public void apply(final Params it) {
          it.name = "Hello from Xtend!";
        }
      };
    MyTasks.MyTask(_function);
  }
}
