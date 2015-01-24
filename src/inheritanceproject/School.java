package inheritanceproject;

import java.util.ArrayList;

/**
 * Created by user on 1/20/15.
 */
public class School {

    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;

    public School(ArrayList<Student> students, ArrayList<Teacher> teachers) {
        this.students = students;
        this.teachers = teachers;
    }

    public String getGradeLevel(int level) {

        String studentsAtLevel = "";
        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).getLevel() == level) {
                studentsAtLevel += students.get(i).getInfo() + "\n";
            }
        }
        return studentsAtLevel;
    }

    public void printSchoolInfo() {

        System.out.println("School Info:");

        if (teachers != null) {
            System.out.println("Teachers:");
            for (int i = 0; i < teachers.size(); i++) {
                System.out.println(teachers.get(i).getInfo());
            }
        } else {
            System.out.println("No Teachers Working Here");
        }

        if (students != null) {
            System.out.println("\nStudents:");
            for (int i = 0; i < students.size(); i++) {
                System.out.println(students.get(i).getInfo());
            }
        } else {
            System.out.println("No Students Enrolled");
        }
    }
}
