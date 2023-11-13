# Behavioral Design Patterns

## Author: Lupascu Felicia

---

## Objectives:

- Study and understand the Behavioral Design Patterns.

- Choose a domain, define its main classes/models/entities and choose the appropriate instantiation mechanisms.

- Use 3 behavioral design patterns for object instantiation in a sample project.

## Implementation

I used 3 Behavioral Design Patterns ```Command```, ```Observer``` and ```Mediator```.

### Command Pattern

* Creation of the Command Interface (Command):

    I created an interface named Command that declares the execute method. This method represents the action to be performed.

* Creation of the Concrete Command (CommunicateCommand):

    I created a concrete class named CommunicateCommand that implements the Command interface.
    In this class, I encapsulated a specific communication action by including a reference to the SchoolMediator, the Student sender, the message to be sent, and the target Classroom.
    The execute method in this class calls the sendMessage method on the SchoolMediator, passing the necessary information.


### Mediator Pattern


* Mediator Interface (SchoolMediator):

    I created an interface named SchoolMediator that declares methods for sending messages, adding students to classrooms, removing students from classrooms, and adding classrooms.
    These methods serve as the communication protocol between different components in the system.

```java
package domain.mediator;

import domain.observer.Student;

public interface SchoolMediator {
    void sendMessage(String message, Student student, Classroom room);
    void addStudentToClassroom(Student student, Classroom room);
    void removeStudentFromClassroom(Student student, Classroom room);
    void addClassroom(Classroom room);
}
```

* Concrete Mediator (SchoolCoordinator):

    I implemented a concrete class named ```SchoolCoordinator``` that implements the SchoolMediator interface.
    This class acts as the central hub that coordinates communication between students (SchoolObserver) and classrooms (Classroom).
    It maintains a list of classrooms and provides methods to send messages, add and remove students from classrooms, and add classrooms to the system.

In summary, the ```Mediator``` pattern is implemented by having a central mediator ``(SchoolCoordinator)`` that facilitates communication between different components (students and classrooms) without them having direct references to each other. The mediator defines a set of methods that components use to interact, promoting a more decoupled and modular design.

### Observer Pattern

* Subject Interface (SchoolObserver):
        I created an interface named SchoolObserver that declares methods for updating and receiving notifications.
        This interface is implemented by classes that act as observers in the system.

* Concrete Subject (Student):
        I implemented a concrete class named Student that represents a student in the school system and implements the SchoolObserver interface.
        The Student class acts as a subject that other components can observe. It provides methods for sending messages and updating/receiving notifications.

* Observer Interface (SchoolObserver):
        I created an interface named SchoolObserver that declares methods for updating and receiving notifications.
        This interface is implemented by classes that need to observe or be notified about events within the system.

* Concrete Observer (NotificationCenter):
        I implemented a class named NotificationCenter that acts as a concrete observer.
        The NotificationCenter maintains a list of observers (students) and provides methods for adding, removing, and making announcements to all observers.

* Client Code (Main class):
        I created instances of the SchoolCoordinator, NotificationCenter, Classroom, and Student to simulate a school system.
        The Main class orchestrates the interactions between students, classrooms, and the observer (NotificationCenter).

* Notification Mechanism (makeAnnouncement):
        The NotificationCenter class provides a method named makeAnnouncement that notifies all registered observers about a particular announcement.

## Conclusion

In this laboratory work, I successfully implemented three key behavioral design patterns: Mediator, Command, and Observer. These patterns contribute to a more modular, flexible, and maintainable school system simulation.The Mediator pattern centralized communication, the Command pattern encapsulated actions, and the Observer pattern enabled effective event notification. Overall, this implementation demonstrates the practical application of behavioral design patterns in building robust and maintainable software systems.
