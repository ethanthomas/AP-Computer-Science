import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by user on 10/3/14.
 */
public class OneDArrays {




    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first element:");
        int a = scanner.nextInt();

        System.out.println("Enter second element:");
        int b = scanner.nextInt();

        System.out.println("Enter third element:");
        int c = scanner.nextInt();

        System.out.println("Enter fourth element:");
        int d = scanner.nextInt();

        System.out.println("Enter fifth element:");
        int e = scanner.nextInt();

        System.out.println("Enter sixth element:");
        int f = scanner.nextInt();


        int[] arr = {a, b, c, d, e, f};
        int[] arr2 = {f, b, c, d, e, a};

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i] + ", ");

        }

        System.out.println("         ");
        System.out.println("Calculating new array... ");
        try {

            Thread.sleep(500);

        } catch (InterruptedException ee) {

            System.out.println(ee.toString());

        }
        System.out.println("         ");

        for (int i = 0; i < arr2.length; i++) {

            System.out.println(arr2[i] + ", ");

        }

    }



}
