package inheritanceproject;

import java.util.ArrayList;

/**
 * Created by user on 1/16/15.
 */
public class Person {

    private String mFirstName, mLastName;

    public Person(String firstName, String lastName) {
        mFirstName = firstName;
        mLastName = lastName;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public String getInfo() {
        return mLastName + ", " + mFirstName;
    }

    public void includeMeIn(ArrayList<Person> a){
        boolean containedIn = false;
        for (Person p : a) {
            if (p.getFirstName().equals(this.getFirstName()))
                containedIn = true;
        }
        if (!containedIn)
            a.add(this);
    }
}
