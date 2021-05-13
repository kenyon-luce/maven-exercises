import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class stringUtils {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a string");
        String input = sc.nextLine();

        boolean isNumber = StringUtils.containsOnly(input, "1234567890");
        boolean isL33t = StringUtils.containsAny(input, "1234567890");

        System.out.println("You Entered: " + input);

        if(isNumber){
            System.out.println(input + " is a number");
        } else if(isL33t){
            System.out.println(input + " is not proper English");
        } else {
            System.out.println(input + " is not a number");
        }

        String swapInputCase = StringUtils.swapCase(input);
        System.out.println("Flipped Case: " + swapInputCase);

        String reverseInput = StringUtils.reverse(input);
        System.out.println("Reversed: " + reverseInput);
    }
}
