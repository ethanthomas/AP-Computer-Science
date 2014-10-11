import java.util.Scanner;

/**
 * Created by user on 10/7/14.
 */
public class TwoDArrays {


    static int mof, ageInterval;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[][] array = {{"Male", "Female"},
                            {"20-25", "26-30", "31-35", "other"}};


        System.out.println("Enter your gender: 1 for male, 2 for female");
        mof = scanner.nextInt();


        System.out.println("Enter your age: 1 for 20-25, 2 for 26-30, 3 for 31-35, 4 for other");

        ageInterval = scanner.nextInt();

        System.out.println("You are a " + array[0][mof - 1] + " who is " + array[1][ageInterval - 1] + " years old.");


    }
}
