package sample;

import org.eclipse.xtext.xbase.lib.InputOutput;

public class DeepThought {
  public static void main(final String... args) {
    int _plus = (17 + 4);
    final int answer = (2 * _plus);
    String _plus_1 = ("The answer is " + Integer.valueOf(answer));
    InputOutput.<String>println(_plus_1);
  }
}
