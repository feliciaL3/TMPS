package domain.patterns.facade;

import domain.models.*;
import domain.patterns.bridge.*;
import domain.patterns.decorator.LoyalityPointsDecorator;
import domain.patterns.decorator.PriceModifierDecorator;
import domain.patterns.adapter.*;

public class OrderFacade {
    public void placeOrder(Cloth cloth, int quantity, PaymentProcessor paymentProcessor, String paymentDetails, int loyaltyPoints) {
        System.out.println();
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new ShoppingCartItem(cloth, quantity));
        System.out.println();

        // Create a LoyaltyPointsDecorator based on the loyalty points
        LoyalityPointsDecorator loyalityCart = new LoyalityPointsDecorator(cart, loyaltyPoints);

        var priceModifierCart = new PriceModifierDecorator(cart, 100.0); 

        System.out.println("Initial cost: $" + cart.calculateTotal());
        System.out.println("Cost with price modifier: $" + priceModifierCart.calculateTotal());
        System.out.println("Cost with loyalty points : $" + loyalityCart.calculateTotal());

        Order order = new Order(cart, paymentProcessor, paymentDetails, priceModifierCart.getpriceModifier(), loyaltyPoints);
        order.processOrder();
    }
}


//    OrderFacade acts as a facade by providing a simplified and unified interface for placing an order. 
//It hides the complexity of creating a shopping cart, applying decorators, calculating costs, and creating an order.
//    OrderFacade encapsulates the steps required to place an order, providing a higher-level interface to clients.
//    It abstracts away the details of the shopping cart and the application of decorators to the cart, 
//making it easy for clients to place orders without dealing with these details directly.