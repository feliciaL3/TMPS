package domain.models;


public class Customer {
    public String name;
    public String email;
    public Clothing clothingCustomerChoice;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void payCard(Clothing clothing) {
        this.clothingCustomerChoice = clothing;
        System.out.println(name + " paid " + clothing.toString() + " with a card.");
    }

    public void payCash(Clothing clothing) {
        this.clothingCustomerChoice = clothing;
        System.out.println(name + " paid " + clothing.toString() + " with cash.");
    }

    @Override
    public String toString() {
        return "\nCustomer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", clothingCustomerChoice=" + (clothingCustomerChoice != null ? clothingCustomerChoice : "None") +
                '}';
    }
}

//liskov with online customer