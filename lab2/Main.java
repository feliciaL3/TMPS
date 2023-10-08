import studentypes.*;
import teachers.*;
import teachers.FitnessTeacher;

public class Main {
    public static void main(String[] args) {
        ClassMaster classMaster1 = ClassMaster.getInstance("Ion Guzun");
        //System.out.println("Class Master 1 Name: " + classMaster1.getName());
        // Change the classMaster's name
        //classMaster1.setName("New Class Master Name");
        // Create anothers instance to verify that it retains the modified name
        //assertClassMaster classMaster2 = ClassMaster.getInstance("D Vasile Bercu");
        //System.out.println("ClassMaster 2 Name: " + classMaster2.getName());
        //if (classMaster1 == classMaster2) {
        //    System.out.println("Class Master 1 and Class Master 2 = the same instance (Singleton works).");
        //} else {
        //    System.out.println("Class Master 1 and Class Master 2 are different instances (Singleton doesnt work).");
        //}

         // Create Students using the StudentFactory
        StudentFactory academy = new StudentFactory();
        Student goalkeeper = academy.getStudent("Maria Ursu", Characteristic.MATH);
        Student honorStudent1 = academy.getStudent("Daria Gursan", Characteristic.HON);
        Student athletic1 = academy.getStudent("Marcel Botnarenco ", Characteristic.ATHL);
        Student artistic1 = academy.getStudent("Alex Mircerescu", Characteristic.ART);

        // Create a MathStudent
        MathStudent mathStudent = new MathStudent("John MathStudent", null, 10, 9, 100);

        // Create some Teachers using teacher prototype
        TeacherPrototype teacher1 = new FitnessTeacher("D Irina Polerescu", "fitness");
        TeacherPrototype teacher2 = new MathTeacher("D Mihai Franertu", "math");
        TeacherPrototype teacher3 = new ArtTeacher("D Alehandro Gircu", "art");

        // Clone a teacher using the Prototype pattern
        TeacherPrototype originalTeacher = new FitnessTeacher("D Irina Polerescu", "fitness");
        TeacherPrototype clonedTeacher = originalTeacher.clone();

        // Create a Class instance using the ClassBuilder pattern
        Class newClass = new Class.ClassBuilder("Clasa 8-a ", classMaster1)
                .addStudent(goalkeeper)
                .addStudent(honorStudent1)
                .addStudent(athletic1)
                .addStudent(artistic1)
                .addStudent(mathStudent)
                .addTeacher(teacher1)
                .addTeacher(teacher2)
                .addTeacher(teacher3)
                .build();

        System.out.println();
        System.out.println("Class name: " + newClass.getName());
        System.out.println("Class Master: " + newClass.getClassMaster().getName());
        System.out.println("Students:");
        for (Student student : newClass.getStudents()) {
            System.out.println("     " + student.getName());
        }
        System.out.println("Teachers:");
        for (TeacherPrototype teacher : newClass.getTeachers()) {
            System.out.println("     " + teacher.getName());
        }

        System.out.println("Math Student Info:");
        System.out.println("    Name: " + mathStudent.getName());
        System.out.println("    Skill Level: " + mathStudent.getSkillLevel());
        System.out.println("    Math Grades: " + mathStudent.getGrades());

        System.out.println("Art Student Info:");
        System.out.println("    Name: " + artistic1.getName());
        System.out.println("    Skill Level: " + artistic1.getSkillLevel());
        System.out.println("    Art Grades: " + artistic1.getGrades());

        // Verify that the cloned teacher works as expected
        System.out.println("Cloned Teacher Info:");
        System.out.println("    Name: " + clonedTeacher.getName());
        System.out.println("    Type: " + clonedTeacher.getType());

        // Clone another teacher using the Prototype pattern
        TeacherPrototype originalTeacher2 = new MathTeacher("D John Doe", "math");
        TeacherPrototype clonedTeacher2 = originalTeacher2.clone();

        // Verify that the cloned teacher works as expected
        System.out.println("Cloned Teacher 2 Info:");
        System.out.println("    Name: " + clonedTeacher2.getName());
        System.out.println("    Type: " + clonedTeacher2.getType());

    }
}
