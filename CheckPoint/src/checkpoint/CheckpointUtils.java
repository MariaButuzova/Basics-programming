package checkpoint;

/**
 *
 * @author Maria
 */
public class CheckpointUtils {
    
    protected static void moveToConsole(int firstNumber, int secondNumber) {
        switch (secondNumber) {
            case 1:
                System.out.println("firstNumber = " + firstNumber);
                break;
            case 2:
                System.out.println("sum = "
                        + DigitsUtils.getDigitsSum(firstNumber));
                break;
            case 3:
                int[] array = DigitsUtils.getDigitsArray(firstNumber);
                System.out.println("isEquilateralTriangle? " + TriangleUtils.
                        isEquilateralTriangle(array[1], array[2], array[3]));
                break;
            default:
                System.out.println("Your number is not equal to 1 || 2 || 3");
                break;
        }
    }

}
