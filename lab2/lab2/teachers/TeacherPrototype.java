package teachers;

public abstract class TeacherPrototype implements Cloneable {
    private final String name;
    private final String type;

    public TeacherPrototype(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public TeacherPrototype clone() {
        try {
            return (TeacherPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public abstract void conductSchoolActivities();

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
