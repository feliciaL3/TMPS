package domain.models;

public class Clothing {
    private String brand;
    private String size;
    private String type;
    private double price;
    private int stockCount;

    public Clothing(String brand, String size, String type, double price, int stockCount) {
        this.brand = brand;
        this.size = size;
        this.type = type;
        this.price = price;
        this.stockCount = stockCount;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "brand='" + brand + '\'' +
                ", size='" + size + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", stockCount=" + stockCount +
                '}';
    }
}
