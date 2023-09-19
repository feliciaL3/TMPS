package domain.models;

public class Clothing {
    private String store;
    private String size;
    private String color;
    private double price;

    public Clothing (String store, String string, String color, double price) {
        this.store = store;
        this.size = string;
        this.color = color;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Clothing from " +
                "store " + store + '\'' +
                ", size " + size + '\'' +
                ", color " + color + '\'' +
                ",  and price " + price +  " dollars" + ' ';
    }

}
