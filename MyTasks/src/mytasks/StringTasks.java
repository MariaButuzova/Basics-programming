package mytasks;

/**
 *
 * @author Maria
 */
abstract class StringTasks extends Task{
    RandomData input = new RandomData();
    protected static String string;

    StringTasks() {
        string = input.getString();
    }   
}
