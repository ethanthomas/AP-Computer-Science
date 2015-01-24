package inheritance;

import java.util.Scanner;

/**
 * Created by user on 1/9/15.
 */
public class WildCard {

    private static Scanner scanner = new Scanner(System.in);
    private static int starAt = -1;


    public static void main(String[] args) {
        System.out.println("Enter first string");
        String one = scanner.nextLine();
        System.out.println("Enter second string");
        String two = scanner.nextLine();
        String three;

        for (int i = 0; i < one.length(); i++) {
            if (one.charAt(i) == '*') {
                starAt = i;
            }
        }

        if (starAt >= 0) {
            three = one.substring(0, starAt);
            three += two;
            three += one.substring(starAt + 1);
            System.out.println("Third string: " + three);
        } else {
            System.out.println("No '*' in first string");
        }
    }

}
