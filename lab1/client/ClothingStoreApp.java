package client;
import domain.factory.ClothingFactory;
import domain.models.Clothing;
import domain.models.Customer;
import domain.models.PaymentMethod;
import domain.models.CardPayer;
import domain.models.CashPayer;

public class ClothingStoreApp {
    public static void main(String[] args) {
        ClothingStoreApp app = new ClothingStoreApp();
        app.run();
    }

    public void run() {
        // Initialize dependencies
        ClothingFactory clothingFactory = new ClothingFactory();
        ClothingOptionsGenerator clothingOptionsGenerator = new ClothingOptionsGenerator(clothingFactory);
        CustomerOptionsGenerator customerOptionsGenerator = new CustomerOptionsGenerator();

        Clothing[] clothingOptions = clothingOptionsGenerator.generateClothingOptions();
        Customer[] customers = customerOptionsGenerator.generateCustomers();

        System.out.println("Welcome to the Clothing Store!");
        System.out.println("-------------------------------\n");

        Customer firstCustomer = PaymentManager.getRandomCustomer(customers);
        Customer secondCustomer = PaymentManager.getRandomCustomerExcluding(customers, firstCustomer);
        DisplayManager.displayCustomerAndClothing(firstCustomer, PaymentManager.getRandomClothing(clothingOptions));
        PaymentMethod paymentMethod1 = new CardPayer(); 
        PaymentMethod paymentMethod2 = new CashPayer(); 
        PaymentManager.handlePayment(firstCustomer, PaymentManager.getRandomClothing(clothingOptions), paymentMethod1);
        DisplayManager.displayCustomerAndClothing(secondCustomer, PaymentManager.getRandomClothing(clothingOptions));
        PaymentManager.handlePayment(secondCustomer, PaymentManager.getRandomClothing(clothingOptions), paymentMethod2);
    }
}
