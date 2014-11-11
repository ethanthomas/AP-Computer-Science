/**
 * Created by user on 10/17/14.
 */
public class Iterations {


        double[] data = {7, 6, 5, 9};

        double sum = 0, max = 0, min = data[1], product = 1, average = 0;

    public static void main(String[] args) {

        new Iterations();

    }

   public Iterations() {


       System.out.print("The array is: ");
       for (int i = 0; i < data.length; i++) {

           System.out.print(data[i] + " ");
           sum += data[i];
           product *= data[i];

           max = data[i] > max ? data[i] : max;
           min = data[i] < min ? data[i] : min;

       }

       average = sum / data.length;

       System.out.println("The sum of the numbers is: " + sum);
       System.out.println("The product of the numbers is: " + product);
       System.out.println("The minimum number is: " + min);
       System.out.println("The maximum number is: " + max);


       standardDeviation();



    }

    void standardDeviation() {

        double avg = 0;
        double[] doubles = new double[data.length];

        for (int i = 0; i < data.length; i++) {


            avg += Math.pow(average - data[i], 2) / data.length;


        }

        avg = Math.sqrt(avg);

        System.out.println("The standard deviation is: " + avg);




    }


}
