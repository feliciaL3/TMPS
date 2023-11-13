//Main.java
import domain.mediator.SchoolCoordinator;
import domain.mediator.SchoolMediator;
import domain.mediator.Classroom;
import domain.observer.NotificationCenter;
import domain.observer.Student;

public class Main {
    public static void main(String[] args) {
        // Create a SchoolCoordinator instance to act as the mediator.
        SchoolMediator coordinator = new SchoolCoordinator();
        // Create a NotificationCenter instance to manage announcements and observers.
        NotificationCenter notificationCenter = new NotificationCenter();

        Classroom Clasa2Room = new Classroom("Clasa2");
        coordinator.addClassroom(Clasa2Room);

        Student Maria = new Student("Maria", coordinator);
        Student Vasile = new Student("Vasile", coordinator);

        coordinator.addStudentToClassroom(Maria, Clasa2Room);
        coordinator.addStudentToClassroom(Vasile, Clasa2Room);

        System.out.println(" ");
        System.out.println(Clasa2Room.getName());
        Maria.send("Greetings, Vasile! How are you today?", Clasa2Room);
        Vasile.send("Hello Maria! I'm doing well, thank you. How about you?", Clasa2Room);
        

        Maria.update("Maria, you have a new important notification!");

        notificationCenter.addObserver(Maria);
        notificationCenter.addObserver(Vasile);
        notificationCenter.makeAnnouncement("Attention students: There will be a scheduled maintenance tonight.");

        notificationCenter.removeObserver(Maria);
        notificationCenter.makeAnnouncement("Scheduled maintenance has been successfully completed. Thanks for  cooperation.");
    }
}