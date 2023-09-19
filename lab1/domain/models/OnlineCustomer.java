package domain.models;

public class OnlineCustomer extends Customer {

    public OnlineCustomer(String name, String email) {
        super(name, email);
    }

    @Override
    public void payCard(Clothing clothing) {
        super.payCard(clothing);
        System.out.println(this.getName() + " paid with his Visa Card.");
    }

}

//Liskov Substitution Principle