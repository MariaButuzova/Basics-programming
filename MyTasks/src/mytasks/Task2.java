package mytasks;

/**
 *
 * @author Maria
 */
public class Task2 extends Task{

    @Override
    void performTask() {
        char ch = InputDataUtils.getCharSymbol();
        System.out.println(ch + " isDigit?\n" + (Character.isDigit(ch)));
    }

}
