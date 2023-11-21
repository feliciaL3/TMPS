package domain.patterns.bridge;

public interface Product {
    String getDescription();
    double getPrice();
    int getStock();
}

///Product = interfața abstracției și definește operațiile generice pe care abstracția le va utiliza. 