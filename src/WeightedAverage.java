import java.util.Scanner;

public class WeightedAverage {

    static Scanner scanner = new Scanner(System.in);
    static int test1, test2, quiz1, quiz2, quiz3;
    static double hwAverage, finalTest, finalQuiz, finalGrade;

    public static void main(String[] args){

        //Tests
        System.out.println("Please enter your test grades.");

        System.out.println("Test 1:");

        test1 = scanner.nextInt();

        System.out.println("Test 2:");

        test2 = scanner.nextInt();

        System.out.println("Calculating...");
        System.out.println("----------------------");


        //sleep the thread so there is more time in between calculations
        try {

            Thread.sleep(1300);

        } catch ( InterruptedException e) {

            System.out.println(e);
        }


        System.out.println("Success. Your test average is " + (double) (test1 + test2) / 2.0 + ".");

        //Quizzes
        System.out.println("Please enter your quiz grades.");

        System.out.println("Quiz 1:");

        quiz1 = scanner.nextInt();

        System.out.println("Quiz 2:");

        quiz2 = scanner.nextInt();

        System.out.println("Quiz 3:");

        quiz3 = scanner.nextInt();

        System.out.println("Calculating...");
        System.out.println("----------------------");


        //sleep the thread so there is more time in between calculations
        try {

            Thread.sleep(1300);

        } catch ( InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Success. Your quiz average is " + (double) (quiz1 + quiz2 + quiz3) / 3.0 + ".");

        System.out.println("----------------------");

        //Homework average
        System.out.println("Please enter your homework average.");

        System.out.println("Homework Average:");

        hwAverage = scanner.nextDouble();

        System.out.println("Calculating final grades...");

        try {

            Thread.sleep(2300);

        } catch (InterruptedException e) {

            System.out.println(e);
        }


        System.out.println("All done. Here are your grades:");

        System.out.println("----------------------");



        //----------------------------------- math -------------------------------------

        //--------test average-------------

        finalTest = (test1 + test2) / 2.0;

        System.out.println("Test Average: " + finalTest);

        finalTest *= 0.5;

        //------------quiz average-----------

        finalQuiz = (quiz1 + quiz2 + quiz3) / 3.0;

        System.out.println("Quiz Average: " + finalQuiz);

        finalQuiz *= 0.3;

        //----------------homework average--------------

        hwAverage *= 0.2;

        //-----------final average------------

        finalGrade = finalTest + finalQuiz + hwAverage;

        System.out.println("Final Grade: " + finalGrade);
        System.out.println("----------------------");


    }


}
