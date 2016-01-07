package mytasks;

import java.util.*;

/**
 *
 * @author Maria
 */
public class InputDataUtils {
    
    public static int getInputInteger() {
        Random random = new Random();
        return (random.nextInt(100) + 1);
    }
    
    public static String getInputString() {
        Random random = new Random();
        String string[] = {"Symbols", "12345", "1 2 3 3 2 ", "!QW@", "cAccc",
            " "};
        return string[random.nextInt(string.length)];
    }
    
    public static char getInputCharSymbol() {
        Random random = new Random();
        String string = "0123456789 qwertyuiop[]asdfghjkl;'zxcvbnm,./!@#$%^&*()"
                + "_+|";
        return string.charAt(random.nextInt(string.length()));
    }
    
    public static int[] getInputIntArray() {
        int[] array = {1,3,3,4,4,4,5,3,4,78,78,78,5,1,6,5,5,5};
        return array;
    }
    
/*    public static String inputStringByConsole() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input string and press Enter: ");
        String string = in.next();
        return string;
    }
    
    public static char inputCharByConsole() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input any symbol and press Enter: ");
        String string  = in.next();
        return string.charAt(0);
    }*/
}
