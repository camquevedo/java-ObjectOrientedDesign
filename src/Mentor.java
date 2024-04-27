import java.util.List;
import java.util.ArrayList;

public class Mentor extends Person implements Teachable {
    private float yearsOfExperience;
    private boolean isActive;
    private List<Course> coursesToTeach;

    public Mentor(String id, String name, float yearsOfExperience, boolean isActive) {
        super(id, name);
        this.yearsOfExperience = yearsOfExperience;
        this.isActive = isActive;
        this.coursesToTeach = new ArrayList<>();
    }

    // Implementación de la interfaz Teachable
    @Override
    public void assignCourse(Course course) {
        coursesToTeach.add(course);
    }
}