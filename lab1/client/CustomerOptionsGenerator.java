package client;

import domain.models.Customer;

public class CustomerOptionsGenerator {
    public Customer[] generateCustomers() {
        return new Customer[] {
            new Customer("Emma Smith", "emma.smith@example.com"),
            new Customer("Michael Johnson", "michael.johnson@example.com"),
            new Customer("Olivia Davis", "olivia.davis@example.com"),
            new Customer("William Brown", "william.brown@example.com"),
            new Customer("Vasile Breen", "vasil.brown@example.com"),
            new Customer("Oana Wloom", "oana.bllom@example.com")
        };
    }
}