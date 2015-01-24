package inheritanceproject;

/**
 * Created by user on 1/16/15.
 */
public class Person {

    private String mFirstName, mLastName;

    public Person(String firstName, String lastName) {
        mFirstName = firstName;
        mLastName = lastName;
    }

    public String getInfo() {
        return mLastName + ", " + mFirstName;
    }
}
