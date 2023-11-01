package domain.models;
import domain.patterns.bridge.Cloth;

public class ShoppingCartItem {
    private Cloth cloth;
    private int quantity;

    public ShoppingCartItem(Cloth cloth, int quantity) {
        this.cloth = cloth;
        this.quantity = quantity;
    }

    public Cloth getCloth() {
        return cloth;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}