package client;

import domain.factory.ClothingFactory;
import domain.models.Clothing;

public class ClothingOptionsGenerator {
    private ClothingFactory clothingFactory;

    public ClothingOptionsGenerator(ClothingFactory clothingFactory) {
        this.clothingFactory = clothingFactory;
    }

    public Clothing[] generateClothingOptions() {
        return new Clothing[] {
            clothingFactory.createClothing("Zara", "M", "green", 120.00),
            clothingFactory.createClothing("H&M", "L", "red", 128.00),
            clothingFactory.createClothing("Gucci", "S", "blue", 134.00),
            clothingFactory.createClothing("Lacoste", "XL", "black", 119.00),
            clothingFactory.createClothing("Puma", "S", "yellow", 75.00),
            clothingFactory.createClothing("Tommy Hilfiger", "M","navy", 95.00)
        };
    }
}