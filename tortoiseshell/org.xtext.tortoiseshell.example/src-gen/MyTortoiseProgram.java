import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.xtext.tortoiseshell.runtime.Tortoise;

public class MyTortoiseProgram extends Tortoise {
  public void main() {
    final double innerRadius = 100.0;
    final double outerRadius = 140.0;
    final int numPeaks = 5;
    final double alpha = (360.0 / numPeaks);
    double _multiply = (2 * innerRadius);
    double _divide = (alpha / 2);
    double _radians = Math.toRadians(_divide);
    double _sin = Math.sin(_radians);
    final double innerEdge = (_multiply * _sin);
    double _divide_1 = (alpha / 2);
    double _radians_1 = Math.toRadians(_divide_1);
    double _cos = Math.cos(_radians_1);
    double _multiply_1 = (innerRadius * _cos);
    final double peakHeight = (outerRadius - _multiply_1);
    double _multiply_2 = (2 * peakHeight);
    double _divide_2 = (_multiply_2 / innerEdge);
    double _atan = Math.atan(_divide_2);
    final double beta = Math.toDegrees(_atan);
    double _multiply_3 = (peakHeight * peakHeight);
    double _multiply_4 = (innerEdge * innerEdge);
    double _divide_3 = (_multiply_4 / 4);
    double _plus = (_multiply_3 + _divide_3);
    final double starEdge = Math.sqrt(_plus);
    IntegerRange _upTo = new IntegerRange(1, numPeaks);
    for (final Integer i : _upTo) {
      {
        this.forward(starEdge);
        double _multiply_5 = (2 * beta);
        this.turnLeft(_multiply_5);
        this.forward(starEdge);
        double _multiply_6 = (2 * beta);
        double _plus_1 = (_multiply_6 + alpha);
        this.turnRight(_plus_1);
      }
    }
  }
}
