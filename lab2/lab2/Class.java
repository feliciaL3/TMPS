import teachers.TeacherPrototype;
import studentypes.Student;

import java.util.ArrayList;
import java.util.List;

public class Class {
    private List<TeacherPrototype> Teachers;
    private ClassMaster classMaster;
    private List<Student> students;
    private String name;
    // Constructor accepts a ClassBuilder, ensuring that only a builder can create a Class
    public Class(ClassBuilder builder) {
        this.classMaster = builder.classMaster;
        this.students = builder.students;
        this.Teachers = builder.teachers;
        this.name = builder.name;

    }
    // Static inner class for building Class objects
    public static class ClassBuilder {
        private List<TeacherPrototype> teachers;
        private ClassMaster classMaster;
        private List<Student> students;
        private String name;

        // Constructor for ClassBuilder, requires a name and classMaster
        public ClassBuilder(String name, ClassMaster classMaster) {
            this.name = name;
            this.classMaster = classMaster;
            this.students = new ArrayList<>();
            this.teachers = new ArrayList<>();
        }
        // Method to add a Student to the list and return the builder for chaining
        public ClassBuilder addStudent(Student student) {
            students.add(student);
            return this;
        }
        // Method to add a Teacher to the list and return the builder for chaining
        public ClassBuilder addTeacher(TeacherPrototype teacher) {
            teachers.add(teacher);
            return this;
        }
        // Method to build a Class object based on the current state of the builder
        public Class build() {
            return new Class(this);
        }
    }

    public String getName() {
        return name;
    }

    public ClassMaster getClassMaster() {
        return classMaster;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<TeacherPrototype> getTeachers() {
        return Teachers;
    }

    public void conductSchoolActivities() {
        System.out.println("School activities for class " + name + ":");
        for (TeacherPrototype teacher : Teachers) {
            teacher.conductSchoolActivities();
        }
    }
}


    // Class class with a private constructor that takes a ClassBuilder as a parameter, ensuring that only the builder can create instances of the Class class.

    //i defined a static inner class called ClassBuilder within the Class class, which is responsible for building Class objects.

    //The ClassBuilder class has methods for setting various attributes of the Class object, such as name, classMaster, students, and teachers.

    //Method chaining is supported, allowing  to set multiple attributes in a fluent manner.

    //The ClassBuilder class has a build method that creates a Class instance based on the current state of the builder.