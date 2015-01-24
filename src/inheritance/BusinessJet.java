package inheritance;

/**
 * Created by user on 1/7/15.
 */
public class BusinessJet extends Airplane {

    double mWeight;
    double mLength;
    boolean isJet;

    public BusinessJet(double weight, double length) {
        super(weight, length);
        mWeight = weight;
        mLength = length;
    }

    public void setJet(boolean isJet) {
        this.isJet = isJet;
    }

    public boolean isJet() {
        return isJet;
    }
}
