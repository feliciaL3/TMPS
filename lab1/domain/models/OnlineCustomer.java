package domain.models;

public class OnlineCustomer extends Customer {
    public OnlineCustomer(String name, String email) {
        super(name, email);
    }

    public String getName() {
        return name;
    }

    @Override
    public void payCard(Clothing clothing) {
        super.payCard(clothing);
    }

    @Override
    public void payCash(Clothing clothing) {
        super.payCash(clothing);
    }

    @Override
    public String toString() {
        return "\nOnlineCustomer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", clothingCustomerChoice=" + (clothingCustomerChoice != null ? clothingCustomerChoice : "None") +
                '}';
    }
}
