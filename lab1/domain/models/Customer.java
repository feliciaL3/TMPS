package domain.models;

public class Customer implements CashPayer, CardPayer {
    private String name;
    private String email;
    private Clothing clothingPurchased;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    @Override
    public void payCard(Clothing clothing) {
        this.clothingPurchased = clothing;
        System.out.println(name + " bought " + clothing.toString() + ". ");
    }

    @Override
    public void payCash(Clothing clothing) {
        this.clothingPurchased = clothing;
        System.out.println(name + " bought " + clothing.toString() + ".");
    }

    @Override
    public String toString() {
        return "\nCustomer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", clothingPurchased=" + (clothingPurchased != null ? clothingPurchased : "None") +
                '}';
    }

}