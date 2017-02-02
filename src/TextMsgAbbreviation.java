import java.util.Scanner;

/**
 * Created by Will Smith on 2/2/17.
 * This Chapter 3 Warm up
 */

public class TextMsgAbbreviation {

    public static void main(String arg[]){
        Scanner scnr = new Scanner(System.in);
        String abbreviation;

        System.out.println("Input an abbreviation:");
        abbreviation = scnr.next();

        if (abbreviation.equals("LOL")) {
            System.out.println("laughing out loud");
        } else if (abbreviation.equals("IDK")){
            System.out.println("I don't know");
        } else {
            System.out.println("Unknown");
        }

    }
}
