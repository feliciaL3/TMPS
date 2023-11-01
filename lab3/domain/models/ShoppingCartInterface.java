package domain.models;

public interface ShoppingCartInterface {
    public double calculateTotal();
    public void addItem(ShoppingCartItem item);

}
