package GroceryBasics;

public class GroceryItem {
    private String name;
    private String barcode;
    private double price;
    private int quantity;

    public GroceryItem(String name, String barcode, double price, int quantity) {
        this.name = name;
        this.barcode = barcode;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() { return name; }
    public String getBarcode() { return barcode; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public void displayItem() {
        System.out.printf("Name: %s | Barcode: %s | Price: %.2f | Quantity: %d\n",
                name, barcode, price, quantity);
    }
}
