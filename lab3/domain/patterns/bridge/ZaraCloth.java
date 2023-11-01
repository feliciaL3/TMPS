package domain.patterns.bridge;

public class ZaraCloth extends Cloth {
    public ZaraCloth(Manufacturer manufacturer, String model, String size, String material, int stock,
            double price) {
        super(manufacturer, model, size, material, stock, price, "Zara offers trendy and stylish clothing.");
    }
}
