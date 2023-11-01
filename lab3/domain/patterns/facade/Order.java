package domain.patterns.facade;

import domain.models.*;
import domain.patterns.adapter.PaymentProcessor;

public class Order {
    private ShoppingCart cart;
    private PaymentProcessor paymentProcessor;
    private String paymentDetails;
    private double priceModifierCost;
    private double discount;

    public Order(ShoppingCart cart, PaymentProcessor paymentProcessor, String paymentDetails, double priceModifierCost,
            double discount) {
        this.cart = cart;
        this.paymentProcessor = paymentProcessor;
        this.paymentDetails = paymentDetails;
        this.priceModifierCost = priceModifierCost;
        this.discount = discount;
    }

    public void processOrder() {
        double total = calculateTotalWithDiscountAndpriceModifier();
        System.out.println("Cost with priceModifier and discount: " + total);
        String FirstName = "";
        String details = extractPaymentDetails();
        if (paymentProcessor.getType().equals("cash")) {
            String[] paymentInfo = paymentDetails.split(" ");
            FirstName = paymentInfo[0].trim();
        } else if (paymentProcessor.getType().equals("card")) {
            String[] paymentInfo = paymentDetails.split("/");
            FirstName = paymentInfo[0].trim();
        }
        paymentProcessor.pay(FirstName, details, total);
        System.out.println();
    }
    private double calculateTotalWithDiscountAndpriceModifier() {
        double total = (cart.calculateTotal() * (1 - this.discount)) + this.priceModifierCost;
        return total;
    }

    private String extractPaymentDetails() {
        String[] paymentInfo = paymentDetails.split(" ");
        if (paymentProcessor.getType().equals("cash") && paymentInfo.length > 1) {
            return paymentInfo[1].trim();
        } else if (paymentProcessor.getType().equals("card")) {
            String[] cardInfo = paymentDetails.split("-");
            if (cardInfo.length > 1) {
                return cardInfo[1].trim();
            }
        }
        return "";
    }
    
}
