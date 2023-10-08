package teachers;

public class ArtTeacher extends TeacherPrototype{
    private String name;
    private String type;
    public ArtTeacher(String name, String type){
        super(name, type); // Call the constructor of the superclass explicitly
        this.name = name;
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }
    @Override
    public void conductSchoolActivities() {
        System.out.println("1. Student agility and coordination exercises");
        System.out.println("2. Team-building activities");
    }
}
