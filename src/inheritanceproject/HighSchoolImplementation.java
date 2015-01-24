package inheritanceproject;

import java.util.ArrayList;

/**
 * Created by user on 1/23/15.
 */
public class HighSchoolImplementation {

    public static void main(String[] args) {

        ArrayList<Teacher> teachers = new ArrayList<Teacher>();
        teachers.add(new Teacher("Person", "Smith", "English"));
        teachers.add(new Teacher("Personeeee", "Mile", "Computer Science"));

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new HighSchoolStudent("Jacob", "Dumby", 0, 0));
        students.add(new HighSchoolStudent("Andrew", "Money", 1, 1.4));

        School school = new School(students, teachers);
        school.printSchoolInfo();

    }
}
