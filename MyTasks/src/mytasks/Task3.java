package mytasks;

/**
 *
 * @author Maria
 */
public class Task3 extends TriangleTasks{

    @Override
    public void performTask() {
        System.out.println("a = " + a + "; b = " + b + "; c = " + c);
        System.out.println("isRightTriangle? "
                + TriangleUtils.isRightTriangle(a, b, c));
    }

}
