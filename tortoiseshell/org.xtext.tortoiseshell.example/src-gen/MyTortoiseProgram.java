import org.eclipse.draw2d.ColorConstants;
import org.xtext.tortoiseshell.runtime.Tortoise;

public class MyTortoiseProgram extends Tortoise {
  public void main() {
    final int length = 100;
    double _sqrt = Math.sqrt(2);
    final double diagonal = (length * _sqrt);
    this.setLineWidth(2);
    this.square();
    this.turnRight(135);
    this.setLineColor(ColorConstants.blue);
    this.forward(diagonal);
    this.turnLeft(90);
    this.setLineColor(ColorConstants.red);
    double _divide = (diagonal / 2);
    this.forward(_divide);
    this.turnLeft(90);
    double _divide_1 = (diagonal / 2);
    this.forward(_divide_1);
    this.turnLeft(90);
    this.setLineColor(ColorConstants.blue);
    this.forward(diagonal);
  }
  
  public void square() {
    final int length = 100;
    this.forward(length);
    this.turnRight(90);
    this.forward(length);
    this.turnRight(90);
    this.forward(length);
    this.turnRight(90);
    this.forward(length);
  }
}
