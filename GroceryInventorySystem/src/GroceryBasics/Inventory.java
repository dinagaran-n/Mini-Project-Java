package GroceryBasics;
import java.io.*;
import java.util.ArrayList;

public class Inventory {
    private ArrayList<GroceryItem> items;
    private final String FILE_NAME = "inventory.txt";

    public Inventory() {
        items = new ArrayList<>();
        loadFromFile(); // Load saved items at startup
    }

    public void addItem(GroceryItem item) {
        items.add(item);
        System.out.println("Item added successfully!");
        saveToFile();
    }

    public GroceryItem searchByBarcode(String barcode) {
        for (GroceryItem item : items) {
            if (item.getBarcode().equals(barcode)) return item;
        }
        return null;
    }

    public void updateQuantity(String barcode, int newQuantity) {
        GroceryItem item = searchByBarcode(barcode);
        if (item != null) {
            item.setQuantity(newQuantity);
            System.out.println("Quantity updated successfully!");
            saveToFile();
        } else {
            System.out.println("Item not found!");
        }
    }

    public void displayAllItems() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty!");
            return;
        }
        System.out.println("----- Inventory Items -----");
        for (GroceryItem item : items) {
            item.displayItem();
        }
    }

    private void saveToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (GroceryItem item : items) {
                writer.write(item.getName() + "," + item.getBarcode() + "," +
                             item.getPrice() + "," + item.getQuantity());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }

    private void loadFromFile() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String name = parts[0];
                    String barcode = parts[1];
                    double price = Double.parseDouble(parts[2]);
                    int quantity = Integer.parseInt(parts[3]);
                    items.add(new GroceryItem(name, barcode, price, quantity));
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading file: " + e.getMessage());
        }
    }
}
