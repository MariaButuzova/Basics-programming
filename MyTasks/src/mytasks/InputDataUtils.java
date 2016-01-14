package mytasks;

import java.util.*;

/**
 *
 * @author Maria
 */
public class InputDataUtils {
    
    public static int getIntRandom() {
        Random random = new Random();
        return (random.nextInt(101) - 50);
    }
    
    public static String getString() {
        Random random = new Random();
        String string[] = {"  -  67777.   ", null, "--7878787", " 0987", "-  .", 
            ".", "         ", "9999.", "9.9", "9.9.9", "@-1"};
        return string[random.nextInt(string.length)];
    }
    
    public static char getCharSymbol() {
        Random random = new Random();
        String string = "0123456789 qwertyuiop[]asdfghjkl;'zxcvbnm,./!@#$%^&*()"
                + "_+|";
        return string.charAt(random.nextInt(string.length()));
    }
    
    public static int[] getIntArray() {
        int[] array = {1,3,3,4,4,4,5,3,4,78,78,78,5,1,6,5,5,5};
        return array;
    }
    
    public static int[] getIntArrayRandom(int number) {
        Random random = new Random();
        int[] array = new int[number];
        for (int i = 0; i < array.length; ++i) {
            array[i] = random.nextInt(15) - 3;
        }
        return array;
    }
    
    public static int[] getIntArrayRandom() {
        Random random = new Random();
        int[] array = new int[6];
        for (int i = 0; i < array.length; ++i) {
            array[i] = random.nextInt(3) + 3;
        }
        return array;
    }
    
    public static double[] getDoubleArrayRandom(int number) {
        Random random = new Random();
        double[] array = new double[number];
        for (int i = 0; i < array.length; ++i) {
            array[i] = random.nextDouble()*21 + -10;
        }
        return array;
    }
    
    public static int getDigitsNumber() {
        Random random = new Random();
        return (random.nextInt(8999) + 1000);
    }
        
}
