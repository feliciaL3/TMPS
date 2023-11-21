package domain.patterns.bridge;

public class Primark extends Cloth {
    public Primark(Manufacturer manufacturer, String model, String size,  String material, int stock,
            double price) {
        super(manufacturer, model, size, material, stock, price, "Primark specializes in budget-friendly clothing.");
    }
}

//Primark și ZaraCloth sunt clase concrete care extind Cloth și oferă implementări specifice pentru fiecare brand.