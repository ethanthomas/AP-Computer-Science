/**
 * Created by user on 11/14/14.
 */
public class APPoint {

    private double myX;
    private double myY;

    public APPoint(double x, double y){
        myX = x;
        myY = y;

    }

    public void move(double x, double y){
        myY += x;
        myX += y;
    }

    public double getMyX(){
        return myX;

    }


    public double getMyY(){
        return myY;

    }

    public void setMyX(double x){
        this.myX = x;

    }

    public void setMyY(double myY) {
        this.myY = myY;
    }

}
