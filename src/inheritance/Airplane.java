package inheritance;

/**
 * Created by user on 1/7/15.
 */
public class Airplane {

    private double myWeight;
    private double myLength;

        public Airplane(double weight, double length){
            myWeight = weight;
            myLength = length;
        }

    public double getMyLength() {
        return myLength;
    }

    public double getMyWeight() {
        return myWeight;
    }
}
