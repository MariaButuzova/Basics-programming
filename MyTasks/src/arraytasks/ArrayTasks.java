package arraytasks;

import java.util.*;
import mytasks.Task;
import mytasks.RandomData;

/**
 *
 * @author Maria
 */
public class ArrayTasks extends Task{
    private int[] intArray = RandomData.getIntArray(-1, 1);
    private double[] doubleArray = RandomData.getDoubleArray(-1, 1);
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayTasks arrayTasks = new ArrayTasks();
        arrayTasks.performTask();
    }

    @Override
    public void performTask() {
        System.out.println(Arrays.toString(intArray));
        System.out.println(ArrayUtils.getMaxIndexes(intArray));
        System.out.println(Arrays.toString(doubleArray));
        System.out.println(ArrayUtils.getMaxIndexes(doubleArray));
        intArray = null;
        System.out.println(ArrayUtils.getMaxIndexes(intArray));
    }

}
