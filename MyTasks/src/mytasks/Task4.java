package mytasks;

/**
 *
 * @author Maria
 */
public class Task4 extends TriangleTasks{

    @Override
    void performTask() {
        int[] array = InputDataUtils.getIntArrayRandom(1, 10);
        for (int i = 0; i < (array.length - array.length % 3); i += 3) {
            System.out.println("a = " + array[i]
                    + "; b = " + array[i + 1]
                    + "; c = " + array[i + 2]);
            System.out.println("isIsoscelesTriangle? "
                    + isIsoscelesTriangle(array[i], array[i + 1], array[i + 2]));
        }
    }

}
