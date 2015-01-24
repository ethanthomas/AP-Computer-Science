package inheritanceproject;

/**
 * Created by user on 1/20/15.
 */
public class HighSchoolStudent extends Student {

    private double gPA;

    public HighSchoolStudent(String firstName, String lastName, int level, double gpa) {
        super(firstName, lastName, level);
        gPA = gpa;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n\tGPA: " + getGPA();
    }

    public double getGPA() {
        return gPA;
    }
}
