import java.util.List;
import java.util.ArrayList;

public class Student extends Person {
    private float averageGrade;
    private List<Course> enrolledCourses;

    public Student(String id, String name) {
        super(id, name);
        this.averageGrade = 0f;
        this.enrolledCourses = new ArrayList<>();
    }

    public boolean enroll(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "{"
                + "\n\t'id': " + getId() + ","
                + "\n\t'name': " + getName() + ","
                + "\n\t'averageGrade': " + averageGrade + ","
                + "\n\t'total enrolled courses': " + enrolledCourses.size()
                + "\n}";
    }
}