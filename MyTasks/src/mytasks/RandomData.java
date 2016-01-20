package mytasks;

import java.util.*;

/**
 *
 * @author Maria
 */
public class RandomData implements InputData{
    private static final int MAX_LENGTH = 1000;
    private static final int MIN_LENGTH = 1;
    private static final int MAX_DOUBLE = 1000;
    private static final int MIN_DOUBLE = -1000;
    
    @Override
    public String getString() {
        return getRandomString();
    }
    
    @Override
    public char getCharSymbol() {
        return (getRandomCharSymbol());
    }
   
    @Override
    public int[] getIntArray() {
        return getRandomIntArray();
    }
    
    @Override
    public double[] getDoubleArray() {
        return (getRandomDoubleArray());
    }
    
    public int getFourDigits() {
        Random random = new Random();
        return (random.nextInt(8999) + 1000);
    }
    
    private int getRandomArrayLength() {
        Random random = new Random();
        return (random.nextInt((MAX_LENGTH - MIN_LENGTH) + 1) + MIN_LENGTH);
    }
    
    private String getRandomString() {
        Random random = new Random();
        String string[] = {"  -  67777.   ", null, "--7878787", " 0987", "-  .", 
            ".", "         ", "9999.", "9.9", "9.9.9", "@-1", "r5r5r5r"};
        return string[random.nextInt(string.length)];
    }
    
    private char getRandomCharSymbol() {
        Random random = new Random();
        String string = "0123456789 qwertyuiop[]asdfghjkl;'zxcvbnm,./!@#$%^&*()"
                + "_+|";
        return string.charAt(random.nextInt(string.length()));
    }
    
    private int[] getRandomIntArray() {
        Random random = new Random();
        int number = getRandomArrayLength();
        int[] array = new int[number];
        for (int i = 0; i < array.length; ++i) {
            array[i] = random.nextInt();
        }
        return array;
    }
    
    private double[] getRandomDoubleArray() {
        Random random = new Random();
        double[] array = new double[getRandomArrayLength()];
        for (int i = 0; i < array.length; ++i) {
            array[i] = random.nextDouble()*((MAX_DOUBLE - MIN_DOUBLE) + 1)
                    + MIN_DOUBLE;
        }
        return array;
    }
        
}
