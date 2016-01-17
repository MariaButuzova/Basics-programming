package mytasks;

/**
 *
 * @author Maria
 */
public class Task4 extends TriangleTasks{
    
    @Override
    public void performTask() {
        System.out.println("a = " + a + "; b = " + b + "; c = " + c);
        System.out.println("isIsoscelesTriangle? "
                + TriangleUtils.isIsoscelesTriangle(a, b, c));
    }
}