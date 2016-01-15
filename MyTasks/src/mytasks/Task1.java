package mytasks;

/**
 *
 * @author Maria
 */
public class Task1 extends Task{

    @Override
    void performTask() {
        String string = InputDataUtils.getString();
        System.out.println(string);
        System.out.println(StringDataUtils.addHelloToString(string));
    }

}
