
/** 
 * @Kevin Li
 * @Sept 25, 2023
 */
public class OrderedPair{
    private double x;
    private double y;

    public OrderedPair(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public OrderedPair() {
        this.x = 0;
        this.y = 0;

    }

    public String toString(){
        return x + "," + y;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


}
