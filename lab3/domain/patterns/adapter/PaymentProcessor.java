package domain.patterns.adapter;


public interface PaymentProcessor {
    void pay(String name, String details, double amount);
    String getType();
}


//avem interfața PaymentProcessor care definește contractul pentru procesorii de plată:
//avem o clasă concretă CashPayment care implementează această interfață pentru procesarea plăților în numerar
//Apoi, avem clasa CardPaymentGateway, care reprezintă un sistem existent pentru procesarea plăților cu cardul:
//Acum, pentru a face CardPaymentGateway compatibil cu interfața PaymentProcessor, am creat clasa PaymentAdapter

//În Main class, se utilizează atât CashPayment (care implementează direct PaymentProcessor), 
//cât și PaymentAdapter (care adaptează CardPaymentGateway la PaymentProcessor):