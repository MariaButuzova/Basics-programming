package mytasks;

import java.util.*;

/**
 *
 * @author Maria
 */
public class Task5 extends TriangleTasks{

    @Override
    void performTask() {
        int[] array = InputDataUtils.getIntArrayRandom(1, 10);
        System.out.println(Arrays.toString(array));
        System.out.println(getCountEquilateralTriangles(array));
        System.out.println("If no triangles data");
        array = InputDataUtils.getIntArrayRandom(50);
        System.out.println(Arrays.toString(array));
        System.out.println(getCountEquilateralTriangles(array));    
    }

}
