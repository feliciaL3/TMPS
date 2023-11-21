package domain.patterns.decorator;

public interface Cart {
    double calculateTotal();
}

//Interfața Cart reprezintă componenta de bază a pattern-ului și definește operația calculateTotal()

//LoyaltyPointsDecorator extinde ShoppingCartDecorator și adaugă funcționalități specifice (puncte de loialitate) la operația calculateTotal()
//PriceModifierDecorator extinde, de asemenea, ShoppingCartDecorator și adaugă funcționalități specifice (modificare preț) la operația calculateTotal().
//ShoppingCartDecorator este clasa abstractă de decorator care conține o referință la o interfață ShoppingCartInterface și implementează operația de bază calculateTotal().