package inheritanceproject;

/**
 * Created by user on 1/20/15.
 */
public class Teacher extends Person {

    private String subject;

    public Teacher(String firstName, String lastName, String subject) {
        super(firstName, lastName);
        this.subject = subject;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n\tSubject: " + getSubject();
    }

    public String getSubject() {
        return subject;
    }
}
