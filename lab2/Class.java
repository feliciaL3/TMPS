import teachers.TeacherPrototype;
import studentypes.Student;

import java.util.ArrayList;
import java.util.List;

public class Class {
    private List<TeacherPrototype> Teachers;
    private ClassMaster classMaster;
    private List<Student> students;
    private String name;

    public Class(ClassBuilder builder) {
        this.classMaster = builder.classMaster;
        this.students = builder.students;
        this.Teachers = builder.teachers;
        this.name = builder.name;

    }

    public static class ClassBuilder {
        private List<TeacherPrototype> teachers;
        private ClassMaster classMaster;
        private List<Student> students;
        private String name;

        public ClassBuilder(String name, ClassMaster classMaster) {
            this.name = name;
            this.classMaster = classMaster;
            this.students = new ArrayList<>();
            this.teachers = new ArrayList<>();
        }

        public ClassBuilder addStudent(Student student) {
            students.add(student);
            return this;
        }

        public ClassBuilder addTeacher(TeacherPrototype teacher) {
            teachers.add(teacher);
            return this;
        }

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
