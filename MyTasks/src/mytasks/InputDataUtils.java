package mytasks;

import java.util.*;

/**
 *
 * @author Maria
 */
public class InputDataUtils {
    
    public static int getInputIntNumberByRandom() {
        Random random = new Random();
        return (random.nextInt(100) + 1);
    }
    
    public static String getInputString() {
        Random random = new Random();
        String string[] = {"1Symbols", "12345", "1 2 3 3 2 ", "1!QW@", "1cAccc",
            "1 "};
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
    
    public static int[] getImputIntArrayNumberElementsByRandom(int number) {
        Random random = new Random();
        int[] array = new int[number];
        for (int i = 0; i < array.length; ++i) {
            array[i] = random.nextInt(20) + 1;
        }
        return array;
    }
    
    public static int[] getImputIntArrayByConsole() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int number = in.nextInt();
        int[] array = new int[number];
        System.out.println("Enter " + number + " integers");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        return array;
    }
    
    public static String getInputStringByConsole() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input string and press Enter: ");
        String string = in.next();
        return string;
    }
    
    public static char getInputCharByConsole() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input any symbol and press Enter: ");
        String string  = in.next();
        return string.charAt(0);
    }
}
