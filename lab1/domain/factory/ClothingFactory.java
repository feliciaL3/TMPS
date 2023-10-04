package domain.factory;

import domain.models.Clothing;

public class ClothingFactory {
    public Clothing createClothing(String store, String string, String color, double price) {
        return new Clothing(store, string, color, price );
    }
}