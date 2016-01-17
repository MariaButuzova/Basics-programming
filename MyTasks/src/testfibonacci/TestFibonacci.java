package testfibonacci;

import java.math.BigInteger;

/**
 *
 * @author Maria
 */
public class TestFibonacci {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count = 100;
        long start = System.currentTimeMillis();
        getFibonacciNumbersRecursion(count);
        long end = System.currentTimeMillis();
        long delta1 = end - start;
        System.out.println("millis == " + delta1);
        start = System.currentTimeMillis();
        getFibonacciNumbers(count);
        end = System.currentTimeMillis();
        long delta2 = end - start;
        System.out.println("my == " + delta2 + "; recurs == " + delta1);
    }
    
    public static void getFibonacciNumbers(int count){
        BigInteger number = BigInteger.ONE;
        BigInteger temp = BigInteger.ONE;
        for (int i = 0; i < count; ++i) {
            number = ((i < 2) ? number : (number.add(temp)));
            temp = number.subtract(temp);
            System.out.println(number);
        }
    }
      
    public static int getFibonacciNumbersRecursion(int number) {
        if (number == 0) return 0;
        if (number == 1 || number == 2) return 1;
        return (getFibonacciNumbersRecursion(number - 1)
                + getFibonacciNumbersRecursion(number - 2));
    }

}
