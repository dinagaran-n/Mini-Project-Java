# 📦 Grocery Inventory System

A simple inventory management system for grocery items, built with Java and enhanced with a responsive HTML/CSS/JavaScript frontend.

---

## 🧱 Project Structure

```
GroceryInventory/
├── src/
│   └── groceryinventory/
│       └── GroceryBasics/
│           ├── GroceryInventorySystem.java
│           ├── GroceryItem.java
│           └── Inventory.java
├── inventory.txt
├── frontend/
│   ├── index.html
│   ├── style.css
│   └── script.js
└── README.md
```

---

## ⚙️ Backend (Java)

### Features
- Add grocery items with name, barcode, price, and quantity
- Search items by barcode
- Update item quantity
- Display all items
- Persistent storage via `inventory.txt`

### How to Run
1. Open the project in your Java IDE (e.g., IntelliJ, Eclipse)
2. Run `GroceryInventorySystem.java` from the `GroceryBasics` package
3. Follow the console prompts to interact with the inventory

---

## 🌐 Frontend (HTML/CSS/JS)

### Features
- Add items via form
- Search items by barcode
- Update quantity
- Display all items
- Fully client-side (in-memory)

### How to Run
1. Navigate to the `frontend/` folder
2. Open `index.html` in your browser
3. Or run a local server:
   ```bash
   cd frontend
   python -m http.server 8000
   ```
   Then visit `http://localhost:8000`

> Note: The frontend currently uses in-memory storage. To connect it to the Java backend, you’ll need to expose REST APIs using Spring Boot.

---

## 🚀 Future Enhancements
- ✅ Connect frontend to backend via REST API
- ✅ Add login/authentication
- ✅ Filter and sort inventory
- ✅ Export inventory to CSV or PDF
- ✅ Mobile-friendly layout

---

## 📄 License
This project is open-source and free to use for educational and personal purposes.
