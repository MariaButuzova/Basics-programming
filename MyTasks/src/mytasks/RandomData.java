package mytasks;

import java.util.*;

/**
 *
 * @author Maria
 */
public class RandomData extends InputData{
    private static final int MAX_LENGTH = 1000;
    private static final int MIN_LENGTH = 1;
    
    private static int getArrayLength() {
        Random random = new Random();
        return (random.nextInt((MAX_LENGTH - MIN_LENGTH) + 1) + MIN_LENGTH);
    }
    
    @Override
    public String getString() {
        Random random = new Random();
        String string[] = {"  -  67777.   ", null, "--7878787", " 0987", "-  .", 
            ".", "         ", "9999.", "9.9", "9.9.9", "@-1"};
        return string[random.nextInt(string.length)];
    }
    
    @Override
    public char getCharSymbol() {
        Random random = new Random();
        String string = "0123456789 qwertyuiop[]asdfghjkl;'zxcvbnm,./!@#$%^&*()"
                + "_+|";
        return string.charAt(random.nextInt(string.length()));
    }
    
    @Override
    public int[] getIntArray() {
        Random random = new Random();
        int number = getArrayLength();
        int[] array = new int[number];
        for (int i = 0; i < array.length; ++i) {
            array[i] = random.nextInt();
        }
        return array;
    }
    
    public static int[] getIntArray(int min, int max) {
        Random random = new Random();
        int number = getArrayLength();
        int[] array = new int[number];
        for (int i = 0; i < array.length; ++i) {
            array[i] = random.nextInt((max - min) +1) + min;
        }
        return array;
    }
    
    @Override
    public double[] getDoubleArray() {
        Random random = new Random();
        int number = getArrayLength();
        double[] array = new double[number];
        for (int i = 0; i < array.length; ++i) {
            array[i] = random.nextDouble();
        }
        return array;
    }
    
    public static double[] getDoubleArray(int min, int max) {
        Random random = new Random();
        int number = getArrayLength();
        double[] array = new double[number];
        for (int i = 0; i < array.length; ++i) {
            array[i] = random.nextDouble()*((max - min) +1) + min;
        }
        return array;
    }
    
    public static int getDigitsNumber() {
        Random random = new Random();
        return (random.nextInt(8999) + 1000);
    }
        
}
