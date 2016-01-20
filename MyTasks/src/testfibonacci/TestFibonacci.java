package testfibonacci;

import mytasks.*;

/**
 *
 * @author Maria
 */
public class TestFibonacci {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count = 60;
        long start = System.currentTimeMillis();
        NumberUtils.getFibonacciNumbersRecursion(count);
        long end = System.currentTimeMillis();
        long delta1 = end - start;
        System.out.println("millis == " + delta1);
        start = System.currentTimeMillis();
        NumberUtils.calculateFibonacciNumbers(count);
        end = System.currentTimeMillis();
        long delta2 = end - start;
        System.out.println("my == " + delta2 + "; recurs == " + delta1);
    }
}
