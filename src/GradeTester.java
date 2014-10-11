import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

/**
 * Created by user on 10/9/14.
 */
public class GradeTester {


    static int a, b, c;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first number");

        a = scanner.nextInt();

        System.out.println("Please enter your second number");

        b = scanner.nextInt();

        System.out.println("Please enter your third number");

        c = scanner.nextInt();

        System.out.println("Calculating average...");

        try {

            Thread.sleep(1000);

        } catch (InterruptedException e) {


        }

        if ((double)(a + b + c) / 3 >= 89.5) {

            System.out.println("Above average : your average is " + (double) (a + b + c)/ 3);

        } else {

            System.out.println("You suck");

        }

    }
}
