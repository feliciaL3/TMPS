package client;

import domain.factory.ClothingFactory;
import domain.models.Clothing;
import domain.models.Customer;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        ClothingFactory clothingFactory = new ClothingFactory();
        Random random = new Random();

        // Generate clothing options
        ClothingOptionsGenerator clothingOptionsGenerator = new ClothingOptionsGenerator(clothingFactory);
        Clothing[] clothingOptions = clothingOptionsGenerator.generateClothingOptions();

        // Generate customer options
        CustomerOptionsGenerator customerOptionsGenerator = new CustomerOptionsGenerator();
        Customer[] customers = customerOptionsGenerator.generateCustomers();

        // Select two different random clothing items for customer 1 and customer 2
        int randomClothingIndex1 = random.nextInt(clothingOptions.length);
        int randomClothingIndex2;
        do {
            randomClothingIndex2 = random.nextInt(clothingOptions.length);
        } while (randomClothingIndex2 == randomClothingIndex1);

        Clothing boughtClothing1 = clothingOptions[randomClothingIndex1];
        Clothing boughtClothing2 = clothingOptions[randomClothingIndex2];

        // Select a random customer  name for customer 1
        int randomFirstCustomerIndex = random.nextInt(customers.length);
        Customer firstCustomer = customers[randomFirstCustomerIndex];

        // Select a different random customer name  for customer 2
        int randomSecondCustomerIndex;
        do {
            randomSecondCustomerIndex = random.nextInt(customers.length);
        } while (randomSecondCustomerIndex == randomFirstCustomerIndex);
        Customer secondCustomer = customers[randomSecondCustomerIndex];

        System.out.println("Welcome to the Clothing Store!");
        System.out.println("-------------------------------\n");

        System.out.println(firstCustomer.getName() + " is looking at the following clothing:");
        System.out.println(boughtClothing1.toString());
        System.out.println();

        System.out.println(secondCustomer.getName() + " is looking at the following clothing:");
        System.out.println(boughtClothing2.toString());
        System.out.println();

        // Decide whether to pay cash or card for both customers
        if (random.nextBoolean()) {
            System.out.println(firstCustomer.getName() + " decided to pay with a card. ");
            firstCustomer.payCard(boughtClothing1);
            System.out.println(secondCustomer.getName() + " decided to pay with cash. ");
            secondCustomer.payCard(boughtClothing2);
        } else {
            System.out.println(firstCustomer.getName() + " decided to pay with a card.");
            firstCustomer.payCash(boughtClothing1);
            System.out.println(secondCustomer.getName() + " decided to pay with cash.");
            secondCustomer.payCash(boughtClothing2);
        }
    }
}
