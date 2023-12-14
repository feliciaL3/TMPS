package studentypes;
// this Student interface defines a set of methods that any class implementing it must provide. 
public interface Student {
    public String getName();
    public void setGrades(int newGrades);
    public void setSkills(int newSkills);
    public void setSkillLevel(int newSkillLevel);
    public int getGrades();
    public int getSkills();
    public int getSkillLevel();

}
