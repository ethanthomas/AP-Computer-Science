/**
 * Created by user on 11/14/14.
 */
public class APPoint {

    private double X;
    private double Y;

    public APPoint(double x, double y){
        X = x;
        Y = y;

    }

    public void move(double x, double y){
        Y += x;
        X += y;
    }

    public double getX(){
        return X;

    }

    public double getY(){
        return Y;

    }

    public void setX(double x){
        this.X = x;

    }

    public void setY(double myY) {
        this.Y = myY;
    }

    public static double pDistance(APPoint p, APPoint q){
       return Math.abs(p.getX() - q.getX());
    }

    public static String printAPPoint(APPoint p) {
        return "p is the point (" + p.getX() + ", " + p.getY() + ")";

    }

}
