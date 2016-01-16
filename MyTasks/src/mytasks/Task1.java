package mytasks;

/**
 *
 * @author Maria
 */
public class Task1 extends StringTasks{

    @Override
    void performTask() {
        String string = InputDataUtils.getString();
        System.out.println(string);
        System.out.println(addHelloToString(string));
    }
}
