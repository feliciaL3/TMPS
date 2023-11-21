package domain.patterns.decorator;

import domain.models.*;

public abstract class ShoppingCartDecorator {
    public ShoppingCartInterface decoratedCart;

    public ShoppingCartDecorator(ShoppingCartInterface decoratedCart) {
        this.decoratedCart = decoratedCart;
    }

    public double calculateTotal() {
        return decoratedCart.calculateTotal();
    }
}


//ShoppingCartDecorator definește o interfață comună pentru toți decoratorii prin intermediul metodei calculateTotal()
//(Decoratorul de Bază):
// ShoppingCartDecorator este o clasă abstractă care servește ca bază pentru toți ceilalți decoratori specifici 