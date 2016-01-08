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
        String string[] = {"  -  67777.   ", null, "--7878787", " 0987", "-  .", 
            ".", "         ", "9999.", "9.9", "9.9.9"};
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
 
}
