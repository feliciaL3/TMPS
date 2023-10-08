package studentypes;

public class ArtisticStudent implements Student {
    private String name;
    private int grades;
    private int skills;
    private int skillLevel;
    private Characteristic charact;

    // Constructor for ArtisticStudent
    public ArtisticStudent(String name, Characteristic charact, int grades, int skills, int skillLevel) {
        this.name = name;
        this.charact= charact;
        this.grades = grades;
        this.skills = skills;
        this.skillLevel = skillLevel;
    }

    @Override
    public void setGrades(int newGrades) {
        grades = newGrades;
    }

    @Override
    public int getGrades() {
        return grades;
    }

    @Override
    public void setSkills(int newSkills) {
        skills = newSkills;
    }

    @Override
    public int getSkills() {
        return skills;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }

    @Override
    public int getSkillLevel() {
        return skillLevel;
    }
}
