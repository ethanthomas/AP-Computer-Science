import java.util.Scanner;

/**
 * Created by user on 10/27/14.
 */
public class Chatter {


    static String[] negatives = {"no"};
    static String[] family = {"mother", "father", "brother"};
    static String[] pets = {"cat", "dog", "parrot", "lizard"};
    static String[] responses = {"Interesting. Tell me more", "Hmmm.", "Do you really think so?", "You don't say?", "I see.", "Many people say that"};
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println(getResponse("   no   "));
        System.out.println(reGetResponse("   hello   "));

    }

    public static String getResponse(String s) {

        s.toLowerCase().trim();

        if (s.contains("no"))
            return "Why so negative?";
        else if (s.contains("mother") || s.contains("father") || s.contains("brother"))
            return "Tell me more about your family";
        else if (s.contains("cat") || s.contains("dog")
                || s.contains("parrot") || s.contains("lizard"))
            return "Tell me more about your pets";
        else return randomResponse();

    }


    public static boolean containsAnyOf(String s, String[] sArr){

        s.toLowerCase().trim();

        for (int i = 0; i < sArr.length ; i++) {

            if (s.contains(sArr[i]))
                return true;
            else return false;
        }

        return false;
    }

    public static String reGetResponse(String s) {

        s.toLowerCase().trim();

        if (containsAnyOf(s, negatives))
            return "Why so negative?";
        else if (containsAnyOf(s, family))
            return "Tell me more about your family";
        else if (containsAnyOf(s, pets))
            return "Tell me more about your pets";
        else return randomResponse();

    }


    public static String randomResponse(){

        int index = (int) (6 * Math.random());
        return responses[index];

    }

}
