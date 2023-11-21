package domain.patterns.bridge;

public abstract class Cloth implements Product {
    protected Manufacturer manufacturer;
    protected String model;
    protected int rating;
    protected String size;
    protected String material;
    protected int stock;
    protected double price;
    protected String BrandDescription;

    public Cloth(Manufacturer manufacturer, String model, String size, String material, int stock,
            double price, String BrandDescription) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.size = size;
        this.material = material;
        this.stock = stock;
        this.price = price;
        this.BrandDescription = BrandDescription;
        this.rating = manufacturer.getRating();
    }

    @Override
    public String getDescription() {
        return "Cloth - Model: " + model + ", Size: " + size +  ", Material: " + material + " ";
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getStock() {
        return stock;
    }

    public int getRating() {
        return rating;
    }

    public String getBrandDescription() {
        return BrandDescription;
    }

    public void decreaseStock(int amount) {
        this.stock -= amount;
    }
}


///Cloth este o clasă abstractă care extinde interfața abstracției (Product) și conține un membru de tip Manufacturer pentru a ține referința la implementor.
//Această clasă furnizează implementări comune pentru metodele definite în Product și utilizează implementarea specifică a Manufacturer pentru a obține evaluarea.