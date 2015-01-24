import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 12/4/14.
 */
public class Bill {

    List<CheckItem> bill = new ArrayList<CheckItem>();

    private double itemTotalBeforeTax = 0, itemTotalWithTax = 0, tax = 0, tip = 0;

    public Bill(ArrayList<CheckItem> items, double taxPercentage, double tipPercentage){
            bill = items;
            tax = taxPercentage;
            tip = tipPercentage;
    }

    public void getBill() {

        for (int i = 0; i < bill.size(); i++) {

            System.out.println(bill.get(i).getQuantity() + "\t" + bill.get(i).getItemName() + "\t\t" + bill.get(i).getItemPrice());

            itemTotalBeforeTax += bill.get(i).getItemPrice();
        }

        itemTotalBeforeTax = (int) (itemTotalBeforeTax * 100);
        itemTotalBeforeTax /= 100;

        itemTotalWithTax = (int) ((itemTotalBeforeTax * (1 + tax / 100) * 100));
        itemTotalWithTax /= 100;

        System.out.println("Sub-Total: " + itemTotalBeforeTax);
        System.out.println("\nTotal: " + itemTotalWithTax);

    }

}