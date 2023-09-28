
/**
 * ProblemSet2C
 *
 * @Kevin Li
 * @Sept 28, 2023
 */
public class Functions {
    public static OrderedPair findQuadraticRoots (double a, double b, double c){
        double x1 = (-b + Math.sqrt(b*b - 4*a*c)) / 2*a;
        double x2 = (-b - Math.sqrt(b*b - 4*a*c)) / 2*a;
        OrderedPair answer = new OrderedPair(x1,x2);
        return answer;
    }
    public static double findSlope (OrderedPair A, OrderedPair B){
        double slope = (double) (B.getY() - A.getY()) / (B.getX() - A.getX());
        return slope;
    }
    public static OrderedPair findMidpoint (OrderedPair A, OrderedPair B){
        double midpointX = (A.getX() + B.getX()) / 2.0 ;
        double midpointY = (A.getY() + B.getY()) / 2.0 ;
        OrderedPair answer = new OrderedPair(midpointX , midpointY);
        return answer;
    }
    public static double findArithmeticSeriesSum (double a, double d, int k){
        double sum = 0.5*k*(2*a + (k-1)*d);
        return sum;
    }
    public static double findGeometricSeriesSum (double a, double r, int k){
        double sum = a* ((1-Math.pow(r,k)) / (1-r));
        return sum;
    }
    public static int rollDie (int sides){
        return (int) (Math.random()*sides) +1;
    }

}
