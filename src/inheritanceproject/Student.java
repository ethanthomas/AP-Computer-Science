package inheritanceproject;

/**
 * Created by user on 1/16/15.
 */
public class Student extends Person {

    private int studentId, mLevel;

    public Student(String firstName, String lastName, int level) {
        super(firstName, lastName);
        mLevel = level;
        if (level > 12 || level <= 0)
            System.out.println("Level must be between 1 and 12, try again");
    }

    public int getLevel() {
        return mLevel;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n\tGrade Level: " + getLevel() + "\n\tID #: " + getStudentId();
    }
}
