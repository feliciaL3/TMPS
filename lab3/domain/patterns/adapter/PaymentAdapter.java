package domain.patterns.adapter;

public class PaymentAdapter implements PaymentProcessor {
    private String type = "card";
    private CardPaymentGateway gateway;

    public PaymentAdapter(CardPaymentGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public void pay(String FirstName, String details, double amount) {
        // Split payment details by "-" to extract the card number
        String[] cardDetails = details.split("-");
        String cardNumber = cardDetails[0].trim();

        // Call the CardPaymentGateway to process the payment
        gateway.processPayment(FirstName, cardNumber, amount);
    }

    @Override
    public String getType() {
        return this.type;
    }
}
