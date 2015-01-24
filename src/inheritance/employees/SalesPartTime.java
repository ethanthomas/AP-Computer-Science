package inheritance.employees;

/**
 * Created by user on 1/13/15.
 */
public class SalesPartTime extends SalesAssistant {
    int hours;

    public SalesPartTime(String name, int employeeID, int secureCode,
                         int hours) {
        super(name, employeeID, secureCode);
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }
}