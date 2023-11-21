package domain.patterns.decorator;

import domain.models.ShoppingCartInterface;

public class LoyalityPointsDecorator extends ShoppingCartDecorator {
    private int loyaltyPoints;

    //super  is used to refer to the superclass,  the class from which the current class is derived. 
    public LoyalityPointsDecorator(ShoppingCartInterface decoratedCart, int loyaltyPoints) {
        super(decoratedCart);
        this.loyaltyPoints = loyaltyPoints;
    }

    @Override
    public double calculateTotal() {
        // Calculate the total by deducting the value of loyalty points from the original total
        double originalTotal = decoratedCart.calculateTotal();
        double loyaltyDiscount = loyaltyPoints * 0.1; // 1 loyalty point = $0.01 discount
        double discountedTotal = originalTotal - loyaltyDiscount;

        // Ensure the total is non-negative
        return Math.max(discountedTotal, 0.0);
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }
}
