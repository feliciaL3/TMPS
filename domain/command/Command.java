//command.java
package domain.command;

public interface Command {
    void execute();
}


//CommunicateCommand implements the Command interface, providing a concrete implementation for the execute() method.
//The constructor of CommunicateCommand takes parameters necessary for the communication action (mediator, student, message, and room).