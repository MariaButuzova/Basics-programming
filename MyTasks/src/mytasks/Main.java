package mytasks;

import java.math.BigInteger;
import java.util.Arrays;

/**
 *
 * @author Maria
 */
public class Main {
    static RandomData randomData = new RandomData();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(NumberUtils.getFactorial(4));
        System.out.println(NumberUtils.getFactorial(5));
        System.out.println(NumberUtils.getFactorial(6));
        System.out.println(NumberUtils.getFactorial(7));
        BigInteger number = new BigInteger("5041");
        performFactorialTiming(number);
        
    }
    
    public static void performFactorialTiming(BigInteger number) {
        int counter = 500000000;
        long start;
        long end;
        long delta1;
        long delta2;
    /*
        for (int i = 1; i <= counter; ++i) {
            start = System.nanoTime();
            System.out.println(NumberUtils.getNearestFactorialByMultiply(number));
            end = System.nanoTime();
            delta1 = end - start;
            delta1 += delta1;
            start = System.nanoTime();
            System.out.println(NumberUtils.getNearestFactorialBySubtract(number));
            end = System.nanoTime();
            delta2 = end - start;
            delta2 += delta2;
            System.out.println("ByMultiply == " + delta1 + "; BySubtract == " + delta2);
        }
        System.out.println("ByMultiply - BySubtract == " + (delta1 - delta2));
    */
        start = System.nanoTime();
        for (int i = 1; i <= counter; ++i) {
            NumberUtils.getNearestFactorialByMultiply(number);
        }
        end = System.nanoTime();
        delta1 = end - start;
        start = System.nanoTime();
        for (int i = 1; i <= counter; ++i) {
            NumberUtils.getNearestFactorialByMultiply(number);
        }
        end = System.nanoTime();
        delta2 = end - start;
        System.out.println("ByMultiply == " + delta1 + "; BySubtract == " + delta2);
        long delta = (delta1 - delta2)/1000000;
        System.out.println("ByMultiply - BySubtract == " + (delta1 - delta2));
        System.out.println("millis == " + delta);
    }
    
    public static void performTask(int n) {
        int a;
        int b;
        int c;
        int[] array;
        int number;
        String string;
        char ch;
        System.out.println("Performing task #" + n);
        switch (n) {
            case 1:
                string = randomData.getString();
                System.out.println(string);
                System.out.println(StringUtils.addHelloToString(string));
                break;
            case 2:
                ch = randomData.getCharSymbol();
                System.out.println(ch + " isDigit?\n" + (Character.isDigit(ch)));
                break;
            case 3:
                System.out.println("a = " + (a = 5)
                        + "; b = " + (b = 3)
                        + "; c = " + (c = 4));
                System.out.println("isRightTriangle? "
                        + TriangleUtils.isRightTriangle(a, b, c));
                break;
            case 4:
                array = randomData.getIntArray();
                for (int i = 0; i < (array.length - array.length % 3); i += 3) {
                    System.out.println("a = " + array[i]
                            + "; b = " + array[i + 1]
                            + "; c = " + array[i + 2]);
                    System.out.println("isIsoscelesTriangle? "
                            + TriangleUtils.isIsoscelesTriangle(array[i],
                                    array[i + 1], array[i + 2]));
                }
                break;
                case 5:
                array = randomData.getIntArray();
                System.out.println(Arrays.toString(array));
                System.out.println(TriangleUtils.
                        getCountEquilateralTriangles(array));
                break;
            case 6:
                System.out.println("false == "
                        + NumberUtils.isXMultipleY(10, 0));
                System.out.println("true == "
                        + NumberUtils.isXMultipleY(0, 10));
                System.out.println("true == "
                        + NumberUtils.isXMultipleY(10, 10));
                System.out.println("false == "
                        + NumberUtils.isXMultipleY(10, 0.));
                System.out.println("false == "
                        + NumberUtils.isXMultipleY(10.1, 10.2));
                System.out.println("false == "
                        + NumberUtils.isXMultipleY(0., 0.));
                System.out.println("false == "
                        + NumberUtils.isXMultipleY(.0, .0));
                System.out.println("true == "
                        + NumberUtils.isXMultipleY(0.1, 0.1));
                System.out.println("false == "
                        + NumberUtils.isXMultipleY(1, 10));
                System.out.println("true == "
                        + NumberUtils.isXMultipleY(10, 5.));
                break;
                case 7:
                a = 1;
                b = 1;
                int condition = NumberUtils.checkNumbersEvenOrOdd(a, b);
                switch (condition) {
                    case 0:
                        System.out.println(a + " isn't matched " + b);
                        break;
                    case 1:
                        System.out.println(a + " and " + b + " are odd");
                        break;
                    case 2:
                        System.out.println(a + " and " + b + " are even");
                        break;
                }
                break;
            case 8:
                number = randomData.getFourDigits();
                System.out.println(number);
                int sum = DigitsUtils.getDigitsSum(number);
                System.out.println(sum + " isEven? "
                        + NumberUtils.isEvenNumber(sum));
                break;
            case 9:
                number = randomData.getFourDigits();
                System.out.println(number);
                break;
            case 10:
                number = randomData.getFourDigits();
                System.out.println(number);
                System.out.println(DigitsUtils.isEvenSumHalfDigits(number));
                break;
            case 11:
                number = randomData.getFourDigits();
                System.out.println(number);
                System.out.println(DigitsUtils.isNotLessDigit(number));
                break;
            case 12:
                QuadraticEquation myEquation = new QuadraticEquation();
                System.out.println("a == " + myEquation.a
                        + "; b == " + myEquation.b
                        + "; c == " + myEquation.c);
                System.out.println(Arrays.toString(myEquation.getRoots()));
                break;
            case 13:
                QuadraticEquation myEquationForEven = new QuadraticEquation();
                System.out.println("a == " + myEquationForEven.a
                        + "; b == " + myEquationForEven.b
                        + "; c == " + myEquationForEven.c);
                System.out.println(Arrays.toString(myEquationForEven.getRoots()));
                double[] arrayRoots = myEquationForEven.getRoots();
                for (int i = 0; i < arrayRoots.length; ++i) {
                    System.out.println(NumberUtils.isEvenNumber(arrayRoots[i]));
                }
                break;
            case 14:
                string = randomData.getString();
                System.out.println(string);
                System.out.println(StringUtils.checkStringIsNumber(string));
                break;
        }
    }


}
