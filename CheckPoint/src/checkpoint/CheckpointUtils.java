package checkpoint;

/**
 *
 * @author Maria
 */
public class CheckpointUtils {
    
    protected static void moveToConsole(int firstNumber, int secondNumber) {
        switch (secondNumber) {
            case 1:
                System.out.println(firstNumber);
                break;
            case 2:
                System.out.println(DigitsUtils.getDigitsSum(firstNumber));
                break;
            case 3:
                break;
            default:
                System.out.println("Your number is not equal to 1 || 2 || 3");
                break;
        }
    }

}
