/**
 * Created by user on 10/21/14.
 */
public class StaticMethods {


    public static void main(String[] args) {

        boolean b = findWally("Wally is awesome");

        System.out.println(b);

        selfish(25);

    }


    public static boolean findWally(String s) {

        return s.contains("Wally");

    }


    public static void selfish(int i) {

        for (int j = 0; j < i; j++) {

            System.out.println("Me");

        }
    }

}
