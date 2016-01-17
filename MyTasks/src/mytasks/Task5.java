package mytasks;

import java.util.*;

/**
 *
 * @author Maria
 */
public class Task5 extends TriangleTasks{
    private final int[] dataArray = new int[6];

    public Task5() {
        for (int i = 0; i < dataArray.length; i += 3) {
            dataArray[i] = a;
            dataArray[i + 1] = b;
            dataArray[i + 2] = c;
        }
    }
    
    @Override
    public void performTask() {
        System.out.println(Arrays.toString(dataArray));
        System.out.println(TriangleUtils.getCountEquilateralTriangles(dataArray)); 
    }
}
