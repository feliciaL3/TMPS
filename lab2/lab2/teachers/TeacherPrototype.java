package teachers;

public abstract class TeacherPrototype implements Cloneable {
    private final String name;
    private final String type;

    // Constructor to initialize name and type
    public TeacherPrototype(String name, String type) {
        this.name = name;
        this.type = type;
    }
    // Clone method to create a  copy of the object
    public TeacherPrototype clone() {
        try {
            return (TeacherPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
    // Abstract method for conducting school activities (to be implemented by subclasses)
    public abstract void conductSchoolActivities();

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
