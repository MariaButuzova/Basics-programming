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
        for (int taskNumber = 1; taskNumber < 6; ++taskNumber) {
            performTask(taskNumber);
        }
    }

    public static void performTask(int taskNumber) {
        switch (taskNumber) {
            case 1:
                System.out.println("Task 1:");
                String myString1 = InputDataUtils.getInputString();
                System.out.println(StringDataUtils.addHelloToString(myString1));
                break;
            case 2:
                System.out.println("Task 2:");
                char ch = InputDataUtils.getInputCharSymbol();
                System.out.println(ch + " " + (Character.isDigit(ch)));
                break;
            case 3:
                System.out.println("Task 3:");
                int[] array5 = InputDataUtils.getInputIntArray();
                TriangleUtils.getCountRightTriangles(array5);
                break;
            case 4:
                System.out.println("Task 4:");
                int[] array2 = InputDataUtils.getInputIntArray();
                TriangleUtils.getCountIsoscelesTriangles(array2);
                break;
            case 5:
                System.out.println("Task 5:");
                int[] array1 = InputDataUtils.getInputIntArray();
                TriangleUtils.getCountEquilateralTriangles(array1);
                System.out.println(TriangleUtils.
                        getCountEquilateralTrianglesWithAnyData(array1));
                break;
            case 14:
                System.out.println("Task 14:");
                String myString14 = InputDataUtils.getInputString();
                System.out.println(myString14);
                System.out.println(StringDataUtils
                        .checkStringIsNumber(myString14));
                break;
            default:
                System.out.println("6 tasks have been implemented."
                        + " There is more to come");
        }
    }
        

    
    

/*    
    public static String addHelloToString(String string) {
        StringBuilder s = new StringBuilder("Hello");
        s.append(string);
        return s.toString();
    }
    
    public static boolean checkStringIsNumber(String string) {
        
        return true;
    }*/
}
