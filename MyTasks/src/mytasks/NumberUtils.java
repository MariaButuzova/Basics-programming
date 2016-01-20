package mytasks;

import java.math.BigInteger;
import java.util.ArrayList;

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
    
    public static void calculateFibonacciNumbers(int maxIndex){
        BigInteger number = BigInteger.ONE;
        BigInteger temp = BigInteger.ONE;
        for (int i = 0; i < maxIndex; ++i) {
            number = ((i < 2) ? number : (number.add(temp)));
            temp = number.subtract(temp);
            System.out.println(number);
        }
    }
      
    public static int getFibonacciNumbersRecursion(int maxIndex) {
        if (maxIndex == 0) return 0;
        if (maxIndex == 1 || maxIndex == 2) return 1;
        return (getFibonacciNumbersRecursion(maxIndex - 1)
                + getFibonacciNumbersRecursion(maxIndex - 2));
    }
    
    public static BigInteger getFactorial(int number) {
        BigInteger factorial = BigInteger.ONE;
        if (number < 0) return BigInteger.ZERO;
        if (number == 0 || number == 1) return BigInteger.ONE;
        for (int i = 2; i <= number; ++i) {
            factorial = factorial.multiply(BigInteger.valueOf((long) i));
        }
        return factorial;
    }
    
    public static BigInteger getNearestFactorialByMultiply(BigInteger number) {
        BigInteger factorial = BigInteger.ONE;
        BigInteger prevFact = BigInteger.ONE;
        if (number.compareTo(BigInteger.ZERO) == -1) return BigInteger.ZERO;
        if (number.compareTo(BigInteger.ZERO) == 0
                || number.compareTo(BigInteger.ONE) == 0) return BigInteger.ONE;
        int i = 2;
        for (; factorial.compareTo(number) == -1; ++i) {
            prevFact = factorial;
            factorial = factorial.multiply(BigInteger.valueOf((long) i));
            if (factorial.compareTo(number) == 0) return factorial;
        }
        
        /**
         * if (number > ((n - 1)!/2)*(n + 1) return n! else return (n - 1)!
         *
         */
        return ((number.compareTo(BigInteger.valueOf(i).multiply(prevFact.divide(BigInteger.valueOf(2)))) == 1)
                ? factorial : prevFact);        
    }
    
    public static BigInteger getNearestFactorialBySubtract(BigInteger number) {
        BigInteger factorial = BigInteger.ONE;
        BigInteger prevFact = BigInteger.ONE;
        if (number.compareTo(BigInteger.ZERO) == -1) return BigInteger.ZERO;
        if (number.compareTo(BigInteger.ZERO) == 0
                || number.compareTo(BigInteger.ONE) == 0) return BigInteger.ONE;
        int i = 2;
        for (; factorial.compareTo(number) == -1; ++i) {
            prevFact = factorial;
            factorial = factorial.multiply(BigInteger.valueOf((long) i));
            if (factorial.compareTo(number) == 0) return factorial;
        }
        
        /**
         * if ((n! - number) < (number - (n - 1)!) return n! else return (n - 1)!
         *
         */
        return ((factorial.subtract(number).compareTo(number.subtract(prevFact))) == -1
                ? factorial : prevFact);        
    }
}
