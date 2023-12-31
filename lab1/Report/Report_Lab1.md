# Topic: *SOLID Principles*

## Author: Felicia Lupascu, FAF-212

----

## Objectives:

* Study and understand the SOLID Principles.
* Choose a domain, define its main classes/models/entities and choose the appropriate instantiation mechanisms.
* Create a sample project that respects SOLID Principles.

## Main tasks:
* Choose an OO programming language and a suitable IDE or Editor (No frameworks/libs/engines allowed).

* Select a domain area for the sample project.

* Define the main involved classes and think about what instantiation mechanisms are needed.

* Respect SOLID Principles in your project.



## Theory:
&ensp;  The SOLID principles are a set of five design principles that help developers create more maintainable and understandable software by promoting clean and flexible object-oriented design. These principles were introduced by Robert C. Martin and have become fundamental concepts in software development. The SOLID acronym stands for:
* Single Responsibility Principle (SRP): This principle states that a class should have only one reason to change, meaning it should have a single responsibility. In other words, a class should have one and only one job or responsibility. This helps in keeping classes focused and easier to understand, maintain, and modify.
* Open-Closed Principle (OCP): The Open-Closed Principle emphasizes that software entities (classes, modules, functions, etc.) should be open for extension but closed for modification. This means that you can add new functionality to a module without altering its existing code. It encourages the use of inheritance, interfaces, and abstract classes to extend behavior.
* Liskov Substitution Principle (LSP): The Liskov Substitution Principle states that objects of a derived class should be able to replace objects of the base class without affecting the correctness of the program. In simpler terms, if a class is a subclass of another class, it should be usable as a drop-in replacement for its base class without causing unexpected behavior.
* Interface Segregation Principle (ISP): This principle suggests that clients should not be forced to depend on interfaces they do not use. It encourages the creation of specific, smaller interfaces tailored to the needs of the clients rather than creating large, monolithic interfaces. This helps in preventing client classes from being coupled to methods they don't need.
* Dependency Inversion Principle (DIP): The Dependency Inversion Principle promotes decoupling between high-level modules (classes) and low-level modules (classes). It suggests that both should depend on abstractions (interfaces or abstract classes), not on concrete implementations. This inversion of dependencies allows for flexibility and easier maintenance by enabling the substitution of implementations without affecting the high-level code. 

## Implementation

&ensp; My project focuses on a clothing store simulation where customers interact with clothing options and make payments using different methods. The project demonstrates the application of several SOLID principles to ensure code quality, maintainability, and flexibility.

&ensp; Let's analyze how the SOLID principles are applied in my project:

* Single Responsibility Principle (SRP):
        ClothingOptionsGenerator class: This class has a single responsibility, which is to generate clothing options.
        CustomerOptionsGenerator class: This class also has a single responsibility, which is to generate customer options.
        ClothingFactory class: It has a single responsibility to create clothing objects.
        Customer and OnlineCustomer classes: These classes are responsible for representing customers and processing payments.
        The other classes also respects SRP.

**EXAMPLE** 
`````` java
package domain.factory;

import domain.models.Clothing;

public class ClothingFactory {
    public Clothing createClothing(String store, String string, String color, double price) {
        return new Clothing(store, string, color, price );
    }
}

``````

* Open-Closed Principle (OCP):
        My project demonstrates the Open-Closed Principle to some extent. I  extended the behavior of the CardPayer interface by introducing the PayVisa interface, which adds Visa-specific payment methods. This allows  to create new implementations of CardPayer without modifying existing code.

**EXAMPLE**

``````java
package domain.models;

public interface PayVisa extends CardPayer {
    // Constants for Visa card related information
    String VISA_CARD_TYPE = "Visa";
    String VISA_ISSUER = "Visa Inc.";

    // Method to get the card type
    String getCardType();

    // Method to get the card issuer
    String getCardIssuer();

    void authorizeVisaTransaction();
    void processVisaRefund();
}

///////open closed principle by extending class CardPayer

``````

* Liskov Substitution Principle (LSP):
        The OnlineCustomer class, which extends the Customer class, maintains the Liskov Substitution Principle. It is a subtype of Customer, and instances of OnlineCustomer can be used interchangeably with Customer instances without affecting the correctness of the program.

**EXAMPLE**

``````java
package domain.models;

public class OnlineCustomer extends Customer {

    public OnlineCustomer(String name, String email) {
        super(name, email);
    }

    @Override
    public void payCard(Clothing clothing) {
        super.payCard(clothing);
        System.out.println(this.getName() + " paid with his Visa Card.");
    }

}

//Liskov Substitution Principle
``````

* Interface Segregation Principle (ISP):
        I have separate interfaces, CardPayer and CashPayer, which are focused on specific payment methods. This adheres to the Interface Segregation Principle as clients can depend on the specific interfaces they need.

**EXAMPLE**

``````java
package domain.models;

public interface CardPayer {
    void payCard(Clothing clothing);
}

//interface segregation
``````

* Dependency Inversion Principle (DIP):
        High-level modules depend on abstractions:  high-level modules (e.g., Customer and MainApp) depend on the abstractions (CashPayer and CardPayer) for payment processing. This aligns with the DIP.S

&ensp; 

## Output:

```` java 
Welcome to the Clothing Store!
-------------------------------

Emma Smith is looking at the following clothing:
Clothing from store Zara, size M, color green, and price 120.0 dollars

Michael Johnson is looking at the following clothing:
Clothing from store Gucci, size S, color blue, and price 134.0 dollars

Emma Smith decided to pay with a card.
Michael Johnson decided to pay with cash.

````

## Conclusions / Screenshots / Results
&ensp;  My project exemplifies good software design practices by applying SOLID principles. These principles promote maintainability, flexibility, and scalability in software development. By continuing to follow these principles and seeking opportunities for improvement, the project can evolve into a robust and adaptable software system.


