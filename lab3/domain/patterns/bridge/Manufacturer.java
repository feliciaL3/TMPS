package domain.patterns.bridge;

public interface Manufacturer {
    int getRating();
}

//CLoth class is the abstraction that maintains a reference to Manufacturer class, which is the implementor.
//The classes which extend the implementor are AsosManufacturer and SheinManufacturer,
// and are the concrete implementors.

// ZaraCloth and PrimarkCloth classes are concrete abstractions,
// which means that they extend the Cloth abstraction and can have different behaviors 
// or attributes specific to each brand,
// while still maintaining a reference to the Manufacturer.



//    POt să adaug noi tipuri de îmbrăcăminte (Cloth), pot crea clase concrete noi care extind Cloth fără a afecta implementarea Manufacturer.
//    La fel, adăugarea de noi producători (Manufacturer) poate fi realizată fără a modifica codul existent al clasei Cloth.
//Pentru ca permitem  abstractiei CLoth sa evolueze independent de implimentarea Manufacturer