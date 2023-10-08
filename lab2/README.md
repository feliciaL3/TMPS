# Creational Design Patterns


## Author: Felicia Lupascu, FAF-212

----

## Objectives:
1. Study and understand the Creational Design Patterns.
2. Choose a domain, define its main classes/models/entities and choose the appropriate instantiation mechanisms.
3. Use some creational design patterns for object instantiation in a sample project.

## Laboratory notes


* 4 creational design patterns were implemented: Singleton, Factory, Prototype and Builder.

## Implementation:

### 1. Singleton design pattern:
<p>I have implemented the Singleton pattern in the ClassMaster class, ensuring that only one instance of ClassMaster can exist. This is achieved through a private constructor and a static method getInstance that returns the single instance. </p>

``````java
public class ClassMaster {
    // ...

    private static class ClassMasterHolder {
        public static final ClassMaster instance = new ClassMaster("Default name");
    }

    public static ClassMaster getInstance(String name){
        ClassMasterHolder.instance.setName(name);
        return ClassMasterHolder.instance;
    }

    // ...
}
``````


### 2. Prototype Design Pattern:
<p> I have implemented the Prototype pattern in the TeacherPrototype class and its subclasses (FitnessTeacher, MathTeacher, and ArtTeacher). The clone method in TeacherPrototype allows to create new teacher objects by cloning an existing one. I demonstrated this by cloning teachers in your Main class. </p>

``````java
public abstract class TeacherPrototype implements Cloneable {
    // ...

    public TeacherPrototype clone() {
        try {
            return (TeacherPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    // ...
}
``````

### 3. Factory Design Pattern:
<p>I have implemented the Factory pattern in the StudentFactory class. It provides a method getStudent that creates and returns instances of different types of students (e.g., MathStudent, HonorStudent, etc.) based on the specified characteristics. </p>

``````java
public class StudentFactory {
    public Student getStudent(String name, Characteristic charact) {
        switch (charact) {
            case MATH:
                return new MathStudent(name, charact, 10, 3, 100);
            case HON:
                return new HonorStudent(name, charact, 10, 10, 100);
            case ATHL:
                return new AthleticStudent(name, charact, 7, 1, 90);
            case ART:
                return new ArtisticStudent(name, charact, 7, 1, 100);
            default:
                return null;
        }
    }
}
``````

``````java
package studentypes;

public interface Student {
    public String getName();
    public void setGrades(int newGrades);
    public void setSkills(int newSkills);
    public void setSkillLevel(int newSkillLevel);
    public int getGrades();
    public int getSkills();
    public int getSkillLevel();

}``````


### 4. Builder Design Pattern:

<p>I have implemented the Builder pattern in the Class class using the nested ClassBuilder class. It allows  to construct complex Class objects with various attributes (e.g., students and teachers) step by step and then build the final object. </p>

``````java
public class Class {
    // ...

    public static class ClassBuilder {
        // ...

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

    // ...
}
``````

## Conclusion:

By implementing these Creational Design Patterns in my project, we have demonstrated how they can be used to manage object creation, improve code organization, and increase flexibility when instantiating objects in various scenarios.