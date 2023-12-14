//SchoolMediator.java
package domain.mediator;

import domain.observer.Student;

public interface SchoolMediator {
    void sendMessage(String message, Student student, Classroom room);
    void addStudentToClassroom(Student student, Classroom room);
    void removeStudentFromClassroom(Student student, Classroom room);
    void addClassroom(Classroom room);
}

//The SchoolMediator interface declares methods for sending messages, adding students to a classroom, removing students from a classroom, and adding a classroom.
//The Main class acts as the client that uses the mediator 