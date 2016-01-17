package mytasks;

import java.math.BigInteger;

/**
 *
 * @author Maria
 */
public class NumberUtils {
    
    public static boolean isXMultipleY(int x, int y) {
        if (y == 0) return false;
        return (x % y == 0);
    }
    
    public static boolean isXMultipleY(int x, double y) {
        return (x % y == 0);
    }
    
    public static boolean isXMultipleY(double x, int y) {
        if (y == 0) return false;
        return (x % y == 0);
    }
    
    public static boolean isXMultipleY(double x, double y) {
        return (x % y == 0);
    }
    
    public static boolean isEvenNumber(int x) {
        return (x % 2 == 0);
    }
    
    public static boolean isEvenNumber(double x) {
        return (x % 2 == 0);
    }
  
    public static int checkNumbersEvenOrOdd(int x, int y) {
        if (isEvenNumber(x) != isEvenNumber(y)) return 0;
        if (isEvenNumber(x)) return 2;
        return 1;
    }
    
    public static void getFibonacciNumbers(int max){
        BigInteger number = BigInteger.ONE;
        BigInteger temp = BigInteger.ONE;
        for (int i = 0; i < max; ++i) {
            number = ((i < 2) ? number : (number.add(temp)));
            temp = number.subtract(temp);
            System.out.println(number);
        }
    }
    
}
