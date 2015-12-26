package hometask4;

import java.math.BigInteger;

/**
 *
 * @author Maria
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Test 4 part 2:");
        System.out.println(getPowerFunction(45, 5));
        System.out.println("Test 4 part 3.1:");
        getFibonacciNumbers(6);
        System.out.println("Test 4 part 3.2:");
        for (int i = 0; i < 6; ++i){
            System.out.println(getFibonacciNumbersRecursion(i + 1));
        }
    }
    
    public static int getPowerFunction(int n, int m) {
        return ( (m > 1) ? (n * (getPowerFunction(n, m - 1))) :
                (m == 1) ? n :
                (m == 0) ? 1 : 0);    
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
    
    public static BigInteger getFibonacciNumbersRecursion(int count) {
        BigInteger number;
        if (count == 0) return BigInteger.ZERO;
        if (count == 1 || count == 2) return BigInteger.ONE;
        number = getFibonacciNumbersRecursion(count - 1)
                .add(getFibonacciNumbersRecursion(count - 2));
        return number;
    }
}
