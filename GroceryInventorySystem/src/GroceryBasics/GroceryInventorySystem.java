package GroceryBasics;
import java.util.Scanner;

public class GroceryInventorySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory();
        int choice;

        do {
            System.out.println("\n--- Grocery Inventory System ---");
            System.out.println("1. Add Item");
            System.out.println("2. Search Item by Barcode");
            System.out.println("3. Update Item Quantity");
            System.out.println("4. Display All Items");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Item Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Barcode: ");
                    String barcode = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();
                    sc.nextLine(); // consume newline
                    inventory.addItem(new GroceryItem(name, barcode, price, quantity));
                    break;

                case 2:
                    System.out.print("Enter Barcode to Search: ");
                    String searchBarcode = sc.nextLine();
                    GroceryItem found = inventory.searchByBarcode(searchBarcode);
                    if (found != null) found.displayItem();
                    else System.out.println("Item not found!");
                    break;

                case 3:
                    System.out.print("Enter Barcode to Update: ");
                    String updateBarcode = sc.nextLine();
                    System.out.print("Enter New Quantity: ");
                    int newQty = sc.nextInt();
                    sc.nextLine(); // consume newline
                    inventory.updateQuantity(updateBarcode, newQty);
                    break;

                case 4:
                    inventory.displayAllItems();
                    break;

                case 5:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
