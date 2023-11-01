package domain.patterns.adapter;
import domain.models.Database;

public class CashPayment implements PaymentProcessor {
    private String type = "cash";

    @Override
    public void pay(String FirstName, String LastName, double amount) {
        // Create a payment record for a cash payment.
        String paymentRecord = createPaymentRecord(FirstName, LastName, amount);
        
        // Add the payment record to the database.
        Database.addTransaction(paymentRecord);
    }

    @Override
    public String getType() {
        return this.type;
    }

    // Helper method to create a payment record for cash payments.
    private String createPaymentRecord(String FirstName, String LastName, double amount) {
        return FirstName + " " + LastName + " is making a cash payment of $" + amount;
    }
}
