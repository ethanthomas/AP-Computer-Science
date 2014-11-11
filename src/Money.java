import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by user on 11/3/14.
 */
public class Money {


    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println(money(4));
        System.out.println(money(2.4));
        System.out.println(money("2.5"));
//        System.out.println(gcf(111, 74));
//
//        System.out.println(scan());

    }


   public static int gcf(int n1, int n2) {


       int rem = n1 % n2;

       System.out.println(rem);
       if (rem == 0)
           return n2;
       else
           return gcf(n2, rem);

   }


    public static String money(int n){

        return ("$" + n + ".00");

    }

    public static String money(double d){

        return ("$" + d + 0);

    }

    public static String money(String s){

        double d = Double.parseDouble(s) * 100;
        d = (int)(d + .5);

        return ("$" + d / 100 + "0");


    }

    public static int scan() {

        int n = 0;

        try {

            n = scanner.nextInt();

        } catch (Exception e) {

            scanner.nextLine();

            System.out.println("Try again");

            n = scan();

        }

        return n;
    }
}
