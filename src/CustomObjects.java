/**
 * Created by user on 11/12/14.
 */
public class CustomObjects {

    private double myWeight, myHeight;
    private String myHair;

    public CustomObjects(double height, double weight, String hair) {

        myWeight = weight;
        myHeight = height;
        myHair = hair;

    }

    public void sleep(int hours) {

        for (int i = 0; i < hours; i++)
            System.out.println("Sleeping...");

    }

    public void talk(){

        myWeight -= .01;
        System.out.println("Talking...");

    }

    public double getMyHeight() {
        return myHeight;
    }

    public double getMyWeight() {
        return myWeight;
    }

    public String getMyHair() {
        return myHair;
    }
}
