package client;

import domain.factory.ClothingFactory;
import domain.models.Clothing;
import domain.models.Customer;
import domain.models.PurchaseMethod;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        ClothingFactory clothingFactory = new ClothingFactory();
        Clothing boughtClothing = null;
        Clothing nikeClothing = clothingFactory.createClothing("Nike", "M", "sportswear", 90.00, 20);
        Clothing adidasClothing = clothingFactory.createClothing("Adidas", "L", "casual", 75.00, 15);
        Clothing pumaClothing = clothingFactory.createClothing("Puma", "S", "athletic", 60.00, 25);
        Clothing gapClothing = clothingFactory.createClothing("Gap", "XL", "casual", 50.00, 30);

        Random random = new Random();
        int randomValue = random.nextInt(4);
        switch (randomValue) {
            case 0:
                boughtClothing = nikeClothing;
                break;
            case 1:
                boughtClothing = adidasClothing;
                break;
            case 2:
                boughtClothing = pumaClothing;
                break;
            case 3:
                boughtClothing = gapClothing;
                break;
            default:
                System.out.println("No case matched");
        }

        Customer customer = null;
        Customer customer1 = new Customer("Stephanie O'Connor", "stephoconnor@gmail.com");
        Customer customer2 = new Customer("Alex Johnson", "alexjohnson1234@gmail.com");
        Customer customer3 = new Customer("Jessica Ramirez", "jessicaR89@gmail.com");
        Customer customer4 = new Customer("Benjamin Lee", "benlee56@gmail.com");

        int randomCustomer = random.nextInt(4);
        switch (randomCustomer) {
            case 0:
                customer = customer1;
                break;
            case 1:
                customer = customer2;
                break;
            case 2:
                customer = customer3;
                break;
            case 3:
                customer = customer4;
                break;
            default:
                System.out.println("No case matched");
        }

        System.out.println(customer.getName() + " chose " + boughtClothing.toString());

        if (random.nextBoolean()) {
            customer.buy(boughtClothing, PurchaseMethod.ONLINE);
        } else {
            customer.buy(boughtClothing, PurchaseMethod.IN_STORE);
        }
    }
}
