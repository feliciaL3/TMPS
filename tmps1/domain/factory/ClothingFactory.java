public package domain.factory;

import domain.models.Clothing;

public class ClothingFactory {
    public Clothing createClothing(String brand, String size, String type, double price, int stockCount) {
        return new Clothing(brand, size, type, price, stockCount);
    }
}
 ClothingFactory {
    
}
