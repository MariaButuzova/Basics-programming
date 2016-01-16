package checkpoint;

/**
 *
 * @author Maria
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int i = 1;
        firstNumber = InputDataUtils.getFirstNumber();
        do {
            System.out.println("Iteration #" + i);
            ++i;
            secondNumber = InputDataUtils.getSecondNumber();
            System.out.println("secondNumber = " + secondNumber);
            System.out.println("firstNumber = " + firstNumber);
            firstNumber -= secondNumber;
            System.out.println("firstNumber - secondNumber = " + firstNumber);
            if (firstNumber < 1000) {
                System.out.println("Game over");
            } else {
                CheckpointUtils.moveToConsole(firstNumber, secondNumber);
            }    
        } while ((firstNumber >= 1000));
    }
    
}
