// Student.java
package domain.observer;

import domain.mediator.SchoolMediator;
import domain.mediator.Classroom;
import domain.command.Command;
import domain.command.CommunicateCommand;

// The Student class acts as a concrete observer.
// It implements the SchoolObserver interface and defines how it responds to updates and notifications.
public class Student implements SchoolObserver {
    private String name;
    private SchoolMediator mediator;

    // Constructor to initialize the student with a name and a mediator.
    public Student(String name, SchoolMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    // Method for the student to send a message to a classroom using a command.
    public void send(String message, Classroom room) {
        Command command = new CommunicateCommand(mediator, this, message, room);
        command.execute();
    }

    // Implementation of the update method from the SchoolObserver interface.
    // Defines how the student responds to updates, printing a message.
    @Override
    public void update(String message) {
        System.out.println(name + ": " + message);
    }

    // Implementation of the notify method from the SchoolObserver interface.
    // Defines how the student responds to notifications, printing a message.
    @Override
    public void notify(String announcement) {
        System.out.println(name + " received a school announcement: " + announcement);
    }

    public String getName() {
        return name;
    }
}


//The Student class acts as a concrete observer. It implements the SchoolObserver interface and defines how it responds to updates and notifications.