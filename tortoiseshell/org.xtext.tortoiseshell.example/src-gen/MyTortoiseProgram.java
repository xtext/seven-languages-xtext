import org.xtext.tortoiseshell.runtime.Tortoise;

public class MyTortoiseProgram extends Tortoise {
  public void main() {
    final double a = 3.0;
    final double b = 4.0;
    final double c = 5.0;
    final double length = 100.0;
    double _divide = (a / c);
    double _asin = Math.asin(_divide);
    final double alpha = Math.toDegrees(_asin);
    final double scaleA = (a / c);
    final double scaleB = (b / c);
    this.setDelay(0);
    this.squares(length, alpha, scaleA, scaleB);
  }
  
  public void squares(final double length, final double alpha, final double scaleA, final double scaleB) {
    boolean _greaterThan = (length > 6);
    if (_greaterThan) {
      this.square(length);
      this.forward(length);
      this.turnLeft(alpha);
      double _multiply = (length * scaleB);
      this.squares(_multiply, alpha, scaleA, scaleB);
      this.turnRight(90);
      double _multiply_1 = (length * scaleB);
      this.forward(_multiply_1);
      double _multiply_2 = (length * scaleA);
      this.squares(_multiply_2, alpha, scaleA, scaleB);
      double _multiply_3 = (length * scaleB);
      this.back(_multiply_3);
      double _minus = (alpha - 90);
      this.turnRight(_minus);
      this.back(length);
    } else {
      this.turnRight(90);
      this.penDown();
      this.forward(length);
      this.penUp();
      this.back(length);
      this.turnLeft(90);
    }
  }
  
  public void square(final double length) {
    this.penDown();
    this.forward(length);
    this.turnRight(90);
    this.forward(length);
    this.turnRight(90);
    this.forward(length);
    this.turnRight(90);
    this.forward(length);
    this.turnRight(90);
    this.penUp();
  }
}
