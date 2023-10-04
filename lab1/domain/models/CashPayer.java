package domain.models;


public class CashPayer implements PaymentMethod {
    @Override
    public void handlePayment(Customer customer, Clothing clothing) {
        System.out.println(customer.getName() + " decided to pay with cash.");
        customer.payCash(clothing);
    }
}