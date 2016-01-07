package mytasks;

import java.util.*;

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
        performTask(14);
    }

    public static void performTask(int taskNumber) {
        int[] array;
        String myString;
        char ch;
        System.out.println("Performing task #" + taskNumber);
        switch (taskNumber) {
            case 1:
                myString = InputDataUtils.getInputString();
                System.out.println(StringDataUtils.addHelloToString(myString));
                break;
            case 2:
                ch = InputDataUtils.getInputCharSymbol();
                System.out.println(ch + " " + (Character.isDigit(ch)));
                break;
            case 3:
                array = InputDataUtils.
                        getImputIntArrayNumberElementsByRandom(66);
                TriangleUtils.getCountRightTriangles(array);
                break;
            case 4:
                array = InputDataUtils.
                        getImputIntArrayNumberElementsByRandom(9);
                TriangleUtils.getCountIsoscelesTriangles(array);
                break;
            case 5:
                array = InputDataUtils.getInputIntArray();
                TriangleUtils.getCountEquilateralTriangles(array);
                array = InputDataUtils.
                        getImputIntArrayNumberElementsByRandom(8);
                System.out.println(TriangleUtils.
                        getCountEquilateralTrianglesWithAnyData(array));
                break;
            case 14:
                myString = InputDataUtils.getInputString();
                System.out.println(myString);
                System.out.println(StringDataUtils
                        .checkStringIsNumber(myString));
                break;
            default:
                System.out.println("6 tasks have been implemented."
                        + " There is more to come");
        }
    }

}
