package inheritance;

/**
 * Created by user on 1/7/15.
 */
public class MilitaryJet extends Airplane {

    double mweight;
    double mlength;
    double mstealth;
    double mbombCapacity;

    public MilitaryJet(double weight, double length, double stealth, double bombCapacity) {
        super(weight, length);
        mweight = weight;
        mlength = length;
        mstealth = stealth;
        mbombCapacity = bombCapacity;
    }

    public double getBombCapacity() {
        return mbombCapacity;
    }

    public double getStealth() {
        return mstealth;
    }
}
