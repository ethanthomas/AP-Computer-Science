package inheritanceproject;

import java.util.ArrayList;

/**
 * Created by user on 2/9/15.
 */
public class PersonImplementation {

    public static void main(String[] args){

        ArrayList<Person> arrayList = new ArrayList<Person>();
        Person p1 = new Person("Eric", "T");
        Person p2 = new Person("Jacob", "T");
        Person p3 = new Person("Jacob", "");
        p1.includeMeIn(arrayList);
        p2.includeMeIn(arrayList);
        p3.includeMeIn(arrayList);
        for (Person p : arrayList)
            System.out.println(p.getFirstName());
    }
}
