package inheritance.employees;

/**
 * Created by user on 1/13/15.
 */


public class SalesSupervisor extends SalesAssistant {
    private String mySafeKey;
    private int sub;

    public SalesSupervisor(String name, int employeeID, int secureCode, String safeKey, int sub) {
        super(name, employeeID, secureCode);
        mySafeKey = safeKey;
        this.sub = sub;
    }

    public String getSafeKey() {
        return mySafeKey;
    }

    public int getSub() {
        return sub;
    }
}
