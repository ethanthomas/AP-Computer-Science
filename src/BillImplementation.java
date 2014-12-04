import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 12/3/14.
 */
public class BillImplementation {

    public static void main(String[] args) {


        ArrayList<CheckItem> billList = new ArrayList<CheckItem>();

        billList.add(new CheckItem(10.342, "Tuna", 1));
        billList.add(new CheckItem(12.229, "Steak", 2));
        billList.add(new CheckItem(20.239, "Salad", 1));
        billList.add(new CheckItem(8.839, "Sandwich", 2));
        billList.add(new CheckItem(11.239, "Chicken", 3));

        Bill bill = new Bill(billList, 8.29, 20);

        bill.getBill();
    }


}
