package mytasks;

/**
 *
 * @author Maria
 */
public class Task2 extends Task{
    private final RandomData input = new RandomData();
    private final char ch = input.getCharSymbol();

    @Override
    public void performTask() {
        System.out.println("'" + ch + "'" + " isDigit?\n"
                + (Character.isDigit(ch)));
    }

}
