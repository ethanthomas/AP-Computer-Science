package inheritance;

public class PassengerJet extends Airplane {

    private double myWeight;
    private double myLength;
    private int mPassengerCount;

    public PassengerJet(double weight, double length, int passengerCount) {
        super(weight, length);
        myWeight = weight;
        myLength = length;
    }

    public int getPassengerCount() {
        return mPassengerCount;
    }
}
