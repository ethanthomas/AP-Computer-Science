/**
 * Created by user on 12/3/14.
 */
public class CheckItem {

    private double itemPrice;
    private int itemQuantity = 1;
    private String itemName;

    public CheckItem(double price, String name, int quantity){
            itemPrice = price;
            itemName = name;
            itemQuantity = quantity;
    }

    public CheckItem(double price, String name){
        itemPrice = price;
        itemName = name;

    }

    public double getItemPrice() {
        return itemPrice;
    }

    public int getQuantity() {
        return itemQuantity;
    }

    public void setQuantity(int quantity) {
        this.itemQuantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }
}
