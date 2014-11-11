/**
 * Created by user on 11/3/14.
 */
public class WriteDate {


    public static void main(String[] args) {


        System.out.println(writeDate(2007, 3, 28, 6, 32, 45));

    }

    public static String writeDate(int year, int month, int day, int hours, int minutes, int seconds) {


        String a, b;

        if (day > 0) {

            a = month + "/" + day + "/" + year;

        } else {

            a = month + "/" + year;

        }

        if (hours >= 0){

            if (seconds >= 0){

                b = " " + hours + ":" + minutes + "." + seconds;

            } else {

                b = " " + hours + " " + minutes;

            }

            return a + b;

        } else {

            return a;
        }

    }

}
