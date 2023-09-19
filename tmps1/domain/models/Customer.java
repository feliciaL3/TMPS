package domain.models;

public class Customer implements Buyer {
    private String name;
    private String email;
    private Clothing clothingPurchased;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void buyClothing(Clothing clothing) {
        this.clothingPurchased = clothing;
    }

    public void returnClothing() {
        this.clothingPurchased = null;
    }

    public String getName() {
        return name;
    }

    public Clothing getClothingPurchased() {
        return clothingPurchased;
    }

    @Override
    public void buy(Buyable item, PurchaseMethod method) {
        if (method == PurchaseMethod.ONLINE) {
            System.out.println(name + " bought " + item.toString() + " online.");
        } else {
            System.out.println(name + " bought " + item.toString() + " in-store.");
        }
        clothingPurchased = (Clothing) item;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", clothingPurchased=" + (clothingPurchased != null ? clothingPurchased.toString() : "None") +
                '}';
    }

    // ... any other methods or setters you might need
}
