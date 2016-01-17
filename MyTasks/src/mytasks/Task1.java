package mytasks;

/**
 *
 * @author Maria
 */
public class Task1 extends StringTasks{

    @Override
    public void performTask() {
        System.out.println(string);
        System.out.println(addHelloToString(string));
    }
    
    protected String addHelloToString(String string) {
        StringBuilder s = new StringBuilder("Hello");
        s.append(string);
        return s.toString();
    }
}
