//ClassRoom.java
package domain.mediator;

import domain.observer.Student;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private String name;
    private List<Student> members = new ArrayList<>();

    public Classroom(String name) {
        this.name = name;
    }

    // Method to make a public message to all students in the classroom, except the sender.
    public void PublicMessage(String message, Student sender) {
        for (Student student : members) {
            // Check if the current student is not the sender.
            if (!student.equals(sender)) {
                // Update the student with the received message.
                student.update(message);
            }
        }
    }

    public void addStudent(Student student) {
        members.add(student);
    }

    public void removeStudent(Student student) {
        members.remove(student);
    }

    public String getName() {
        return name;
    }
}