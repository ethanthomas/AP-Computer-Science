import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by user on 12/8/14.
 */
public class ArrayLists {

    static ArrayList<String> arrayList = new ArrayList<String>();
    static Scanner scanner = new Scanner(System.in);
    static String line = "";

    public static void main(String[] args) {

        System.out.println("Enter stuff");

        while (!(line = scanner.nextLine()).equals("STOP")){
            System.out.println("Save and continue");
            arrayList.add(line);
        }

        scanner.close();
        System.out.println("Size is: " + arrayList.size());
        System.out.println(arrayList);

    }
}
