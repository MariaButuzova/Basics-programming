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
        
        Random random = new Random();
        int[] array = new int[14];
        for (int i = 0; i < array.length; ++i) {
            array[i] = -i + 8;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(ArrayUtils.getNotFibonacciNumbers(array));
    }
}
