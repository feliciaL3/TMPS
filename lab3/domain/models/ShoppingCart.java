package domain.models;

import java.util.ArrayList;
import java.util.List;
import domain.patterns.bridge.Cloth; 

public class ShoppingCart implements ShoppingCartInterface {
    private List<ShoppingCartItem> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    @Override // Indicates that this method is intended to override a method from the interface.
    public void addItem(ShoppingCartItem item) {
        items.add(item);
    }

    @Override // Indicates that this method is intended to override a method from the interface.
    public double calculateTotal() {
        double total = 0.0;
        for (ShoppingCartItem item : items) {
            total += calculateItemTotal(item);
            decreaseClothStock(item);
        }
        return total;
    }

    // Calculate the total price of an item
    private double calculateItemTotal(ShoppingCartItem item) {
        return item.getCloth().getPrice() * item.getQuantity();
    }

    // Decrease the stock of the Cloth item
    private void decreaseClothStock(ShoppingCartItem item) {
        Cloth cloth = item.getCloth();
        int quantity = item.getQuantity();
        cloth.decreaseStock(quantity);
    }
}
