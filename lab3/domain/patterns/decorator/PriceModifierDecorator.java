package domain.patterns.decorator;

import domain.models.*;

public class PriceModifierDecorator extends ShoppingCartDecorator {
    private double priceModifier;

    //super  is used to refer to the superclass,  the class from which the current class is derived. 
    public PriceModifierDecorator(ShoppingCartInterface decoratedCart, double priceModifier) {
        super(decoratedCart);
        this.priceModifier = priceModifier;
    }

    public double calculateTotal() {
        return decoratedCart.calculateTotal() + priceModifier;
    }

    public double getpriceModifier() {
        return priceModifier;
    }
}