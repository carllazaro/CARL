import java.util.*;
public class LabExer2 {
    private String itemName;
    private double itemPrice;
    private int itemQuantity;
    private static double amountDue;

    public void setItemName(String newItemName) {
        itemName = newItemName;
    }
    public void setTotalCost(int quantity, double price) {
        itemQuantity = quantity;
        price = amountDue;
    }
    public String getItemName() {
        return itemName;
    }
    public double getTotalCost() {
        return amountDue;
    }
    public static void readInput() {
        Scanner s = new Scanner(System.in);
        LabExer2 LabExer = new LabExer2();
        System.out.println("Enter the name of the item you are purchasing.");
        String itemName = s.nextLine();
        LabExer.setItemName(itemName);
        System.out.println("Enter the quantity and price seperated by a space.");
        int itemQuantity = s.nextInt();
        LabExer.setItemQuantity(itemQuantity);
        double itemPrice = s.nextDouble();
        LabExer.setItemPrice(itemPrice);
        amountDue = itemPrice * itemQuantity;
        LabExer.writeOutput();
        System.out.printf("Amount due is " + "%.2f", amountDue);
    }
    public void writeOutput() {
        System.out.println("You are purchasing " + getItemQuantity() + " " + getItemName() + "(s)" + " at " + getItemPrice() + " each.");
    }
    public void setItemPrice(double price) {
        itemPrice = price;
    }
    public void setItemQuantity(int quantity) {
        itemQuantity = quantity;
    }
    public static void main(String[] args) {
        readInput();
    }
    public int getItemQuantity() {
        return itemQuantity;
    }
    public double getItemPrice() {
        return itemPrice;
    }
}
