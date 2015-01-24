package inheritance.employees;

/**
 * Created by user on 1/13/15.
 */
public class SalesAssistant extends Employee {
    private int mySecureCode;

    public SalesAssistant(String name, int employeeID, int secureCode) {
        super(name, employeeID);
        mySecureCode = secureCode;
    }

    public int getSecureCode() {
        return mySecureCode;
    }
}