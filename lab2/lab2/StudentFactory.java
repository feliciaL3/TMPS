
import studentypes.*;

// Factory method to create Student objects based on characteristics
public class StudentFactory {
    public Student getStudent(String name, Characteristic charact) {
        switch (charact) {
            case MATH:
                return new MathStudent(name, charact, 10, 3, 100);
            case HON:
                return new HonorStudent(name, charact, 10, 10, 100);
            case ATHL:
                return new AthleticStudent(name, charact, 7, 1, 90);
            case ART:
                return new ArtisticStudent(name, charact, 7, 1, 100);
            default:
                return null;
        }
    }
}

// The Factory Design Pattern is a creational design pattern that provides an interface 
// for creating objects in a super class but allows subclasses 
// to alter the type of objects that will be created. 

//The key idea of the Factory Pattern is to encapsulate the object creation logic in a separate class or method, 
//allowing the client code to request objects without needing to know the details of how they are created. 