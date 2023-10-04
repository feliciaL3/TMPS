package domain.models;


public class CardPayer implements PaymentMethod {
    @Override
    public void handlePayment(Customer customer, Clothing clothing) {
        System.out.println(customer.getName() + " decided to pay with a card.");
        System.out.println(customer.getName() + " is an online customer.");
        customer.payCard(clothing);
    }
}