package domain.models;

public interface PayVisa extends CardPayer {
    // Constants for Visa card related information
    String VISA_CARD_TYPE = "Visa";
    String VISA_ISSUER = "Visa Inc.";

    // Method to get the card type
    String getCardType();

    // Method to get the card issuer
    String getCardIssuer();

    void authorizeVisaTransaction();
    void processVisaRefund();
}

///////open closed principle by extending class CardPayer