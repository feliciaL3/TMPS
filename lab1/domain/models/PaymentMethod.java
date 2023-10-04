package domain.models;


public interface PaymentMethod {
    void handlePayment(Customer customer, Clothing clothing);
}

//open closed principles
//cardpayer.jaba
//cashpayer.java


//interface segregation