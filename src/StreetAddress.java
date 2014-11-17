/**
 * Created by user on 11/17/14.
 */
public class StreetAddress {



    public static void main(String[] args) {

        StreetAddress streetAddress = new StreetAddress("124 Main Street", "SpringField", "FL", "31245");

        System.out.println(streetAddress.mailingLabel());

        streetAddress.setStreet("321 N Side Street");

        System.out.println(streetAddress.mailingLabel());

        System.out.println("\n" + streetAddress.getStreet() + "\n" + streetAddress.getCity() + "\n"
                + streetAddress.getState() + "\n" + streetAddress.getZip());
    }

    private String mStreet, mCity, mState, mZip;

    public StreetAddress(String street, String city, String state, String zip) {

        mStreet = street;
        mCity = city;
        mState = state;
        mZip = zip;
    }

    public void setStreet(String street) {
        mStreet = street;
    }

    public void setCity(String city) {
        mCity = city;
    }

    public void setState(String state) {
        mState = state;
    }

    public void setZip(String zip) {
        mZip = zip;

    }

    public String getStreet() {
        return mStreet;
    }


    public String getCity() {
        return mCity;
    }

    public String getState() {
        return mState;
    }

    public String getZip() {
        return mZip;
    }

    public String mailingLabel() {
        return mStreet + "\n" + mCity + ", " + mState + " " + mZip;
    }

}
