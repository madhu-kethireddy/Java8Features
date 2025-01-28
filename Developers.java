import java.util.Arrays;

public class Developers {
    private String name;
    private Level level;
    private float yearsOfExperience;
    private String[] skills;
    public Developers(String name, Level level, float yearsOfExperience, String... skills) {
        this.name = name;
        this.level = level;
        this.yearsOfExperience = yearsOfExperience;
        this.skills = Arrays.copyOf(skills, skills.length);
    }
    
    public String getName() {
        return name;
    }
    public Level getLevel() {
        return level;
    }
    public float getYearsOfExperience() {
        return yearsOfExperience;
    }
    public String[] getSkills() {
        return skills;
    }
    enum Level{
        JUNIOR, MIDDLE, SENIOR, LEAD, MANAGER;
    }

}
