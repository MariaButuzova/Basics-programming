package arraytasks;

import mytasks.ArrayUtils;
import java.util.*;
import mytasks.RandomData;

/**
 *
 * @author Maria
 */
public class ArrayTasks{
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RandomData randomData = new RandomData();
        int[] intArray = randomData.getIntArray();
        System.out.println(Arrays.toString(intArray));
        System.out.println(ArrayUtils.getFibonacciNumbers(intArray));
    }
}
