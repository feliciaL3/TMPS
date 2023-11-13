// CommunicateCommand.java
package domain.command;

import domain.mediator.SchoolMediator;
import domain.observer.Student;
import domain.mediator.Classroom;

// The CommunicateCommand class acts as a concrete command.
// It implements the Command interface and encapsulates the action of sending a message through the mediator.
public class CommunicateCommand implements Command {
    private SchoolMediator mediator;
    private Student student;
    private String message;
    private Classroom room;

    // Constructor to initialize the command with a mediator, student, message, and classroom.
    public CommunicateCommand(SchoolMediator mediator, Student student, String message, Classroom room) {
        this.mediator = mediator;
        this.student = student;
        this.message = message;
        this.room = room;
    }

    // Implementation of the execute method from the Command interface.
    // Invokes the mediator to send the message to the specified classroom through the student.
    @Override
    public void execute() {
        mediator.sendMessage(message, student, room);
    }
}
