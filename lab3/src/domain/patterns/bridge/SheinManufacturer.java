package domain.patterns.bridge;

public class SheinManufacturer implements Manufacturer {
    @Override
    public int getRating() {
        return 5;
    }
}