package mytasks;

//import java.util.*;

import java.util.Arrays;


/**
 *
 * @author Maria
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* for (int taskNumber = 1; taskNumber < 6; ++taskNumber) {
            performTask(taskNumber);
        }*/
            
        performTask(9);
        
    }

    public static void performTask(int n) {
        int a;
        int b;
        int c;
        int[] array;
        String string;
        char ch;
        System.out.println("Performing task #" + n);
        switch (n) {
            case 1:
                string = InputDataUtils.getString();
                System.out.println(string);
                System.out.println(StringDataUtils.addHelloToString(string));
                break;
            case 2:
                ch = InputDataUtils.getCharSymbol();
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
                array = InputDataUtils.getIntArrayRandom(50);
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
                array = InputDataUtils.getIntArrayRandom();
                for (int i : array) {
                    System.out.println(i);
                }
                System.out.println(TriangleUtils.
                        getCountEquilateralTriangles(array));
                System.out.println("If no triangles data");
                array = InputDataUtils.getIntArrayRandom(50);
                for (int i : array) {
                    System.out.println(i);
                }
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
                a = InputDataUtils.getIntRandom();
                b = InputDataUtils.getIntRandom();
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
                array = InputDataUtils.getDigitsArray(); 
                System.out.println(Arrays.toString(array));
                System.out.println(DigitsUtils.getDigitsSum(array));
                array = InputDataUtils.getDigitsArray(1111);
                System.out.println(Arrays.toString(array));
                System.out.println(DigitsUtils.getDigitsSum(array));
                break;
            case 9:
                array = InputDataUtils.getDigitsArray(1010);
                System.out.println(Arrays.toString(array));
                System.out.println(DigitsUtils.isPalindrome(array));
                break;
            case 14:
                string = InputDataUtils.getString();
                System.out.println(string);
                System.out.println(StringDataUtils.checkStringIsNumber(string));
                break;
            default:
                System.out.println("6 tasks have been implemented."
                        + " There is more to come");
        }
    }

}
