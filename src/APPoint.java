/**
 * Created by user on 11/14/14.
 */
public class APPoint {

    private double x;
    private double y;

    public APPoint(double x, double y){
        this.x = x;
        this.y = y;

    }

    public void move(double x, double y){
        y += x;
        x += y;
    }

    public double getX(){
        return x;

    }

    public double getY(){
        return y;

    }

    public void setX(double x){
        this.x = x;

    }

    public void setY(double myY) {
        this.y = myY;
    }

    public static double pDistance(APPoint p, APPoint q){
       return Math.abs(p.getX() - q.getX());
    }

    public static String printAPPoint(APPoint p) {
        return "p is the point (" + p.getX() + ", " + p.getY() + ")";
    }

    public double getCircleArea(APPoint d) {
        double r = ptDistance(this, d);
        return (Math.PI * r * r);
    }

    public static double ptDistance(APPoint p, APPoint q) {
        double xdiff = Math.abs(p.getX() - q.getX());
        double ydiff = Math.abs(p.getY() - q.getY());
        double dist = Math.sqrt((xdiff * xdiff) + (ydiff* ydiff));
        return (int) (100.0 * dist) / 100.0;
    }

    public double distance(APPoint p) {
        return ptDistance(this, p);
    }

    public double circleCircumference(APPoint d){
        return Math.PI * 2 * distance(d);
    }
    public double circleCircumference(){
        return Math.PI * 2 * distance(this);
    }
}
