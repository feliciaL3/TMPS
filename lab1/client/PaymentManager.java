package client;

import domain.models.Customer;
import domain.models.PaymentMethod;
import domain.models.Clothing;

public class PaymentManager {
    private static long seed = System.currentTimeMillis();

    public static int customRandom(int bound) {
        seed = (seed * 32719 + 3) % 32749;
        return (int) (seed % bound);
    }

    public static void handlePayment(Customer customer, Clothing clothing, PaymentMethod paymentMethod) {
        paymentMethod.handlePayment(customer, clothing);
    }

    public static Customer getRandomCustomer(Customer[] customers) {
        return customers[customRandom(customers.length)];
    }

    public static Customer getRandomCustomerExcluding(Customer[] customers, Customer excludedCustomer) {
        Customer randomCustomer;     // Repeat until a different random customer is selected
        do {
            randomCustomer = getRandomCustomer(customers);
        } while (randomCustomer == excludedCustomer);
        return randomCustomer;
    }

    public static Clothing getRandomClothing(Clothing[] clothingOptions) {
        return clothingOptions[customRandom(clothingOptions.length)];
    }
}


//dependency inversion
//payment method interface
//concrete implimentations card and cash payer