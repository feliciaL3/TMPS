import domain.models.*;
import domain.patterns.bridge.*;
import domain.patterns.facade.*;
import domain.patterns.adapter.*;

public class Main {
    public static void main(String[] args) {
        // Create and add clothing items to the database
        Cloth primarkCloth = new Primark(new AsosManufacturer(), "Wedding Dress", "XS", "cotton", 5, 50);
        Cloth sheinCloth = new ZaraCloth(new SheinManufacturer(), "Formal Suit", "S", "leather", 15, 25);
        Database.addCloth(primarkCloth);
        Database.addCloth(sheinCloth);

        // Create a shopping cart and add items
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new ShoppingCartItem(primarkCloth, 1));

        // Initialize payment processors
        PaymentProcessor cashPayment = new CashPayment();
        PaymentAdapter cardPayment = new PaymentAdapter(new CardPaymentGateway());

        // Create an order facade
        OrderFacade facade = new OrderFacade();

        // Place orders using the facade
        facade.placeOrder(primarkCloth, 1, cashPayment, "Eduard Panza", 1);
        //facade.placeOrder(sheinCloth, 1, cardPayment, "Ed Pinza-22222567890122422", 2);
        facade.placeOrder(sheinCloth, 1, cardPayment, "Emilian Cfetu", 2);

    }
}
