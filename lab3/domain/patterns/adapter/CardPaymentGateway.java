package domain.patterns.adapter;

import domain.models.Database;

public class CardPaymentGateway {
    public void processPayment(String cardHolderName, String cardNumber, double amount) {
        // Create a payment record and add it to the database 
        String paymentRecord = createPaymentRecord(cardHolderName, cardNumber, amount);
        Database.addTransaction(paymentRecord);
    }

    private String createPaymentRecord(String cardHolderName, String cardNumber, double amount) {
        // Extract the last four digits of the card number.
    //    String lastFourDigits = cardNumber.substring(cardNumber.length() - 4);
    //    return cardHolderName + " paid $" + amount + " using card number ending in " + lastFourDigits;
        return cardHolderName + " paid $" + amount ;
    }
}
