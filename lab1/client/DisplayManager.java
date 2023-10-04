package client;

import domain.models.Customer;
import domain.models.Clothing;

public class DisplayManager {
    public static void displayCustomerAndClothing(Customer customer, Clothing clothing) {
        System.out.println(customer.getName() + " is looking at the following clothing:");
        System.out.println(clothing.toString());
        System.out.println();
    }
}
