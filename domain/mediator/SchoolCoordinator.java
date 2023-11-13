// Updated SchoolCoordinator.java
package  domain.mediator;
import domain.observer.Student;
import java.util.ArrayList;
import java.util.List;


public class SchoolCoordinator implements SchoolMediator {
    private List<Classroom> classrooms = new ArrayList<>();

    public void addClassroom(Classroom classroom) {
        classrooms.add(classroom);
    }

    public void sendMessage(String message, Student sender, Classroom classroom) {
        classroom.PublicMessage(sender.getName() + " - " + message, sender);
    }

    public void addStudentToClassroom(Student student, Classroom classroom) {
        classroom.addStudent(student);
    }
    @Override
    public void removeStudentFromClassroom(Student student, Classroom classroom) {
        classroom.removeStudent (student);
    }
}


//The SchoolCoordinator class implements the SchoolMediator interface and acts as a concrete mediator. 
//It maintains a list of classrooms and provides methods to interact with them.

//the SchoolMediator interface defines the communication contract, 
//the SchoolCoordinator implements this interface to mediate the communication 
//between students and classrooms, and the Classroom class represents a group of students 
//that can communicate through the mediator. The Main class demonstrates the interaction between these components, 
//showcasing the Mediator Pattern in action.