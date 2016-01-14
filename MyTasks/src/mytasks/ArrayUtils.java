package mytasks;

import java.util.*;

/**
 *
 * @author Maria
 */
public class ArrayUtils {
    
    public static ArrayList<Integer> getMaxIndexes(int[] array) {
        ArrayList maxIndexes = new ArrayList();
        if (array == null || array.length == 0) {
            return maxIndexes;
        }
        maxIndexes.add(0);
        int max = array[0];
        for (int i = 1; i < array.length; ++i) {
            if (max < array[i]) {
                max = array[i];
                maxIndexes.clear();
                maxIndexes.add(i);
            } else if (max == array[i]) {
                maxIndexes.add(i);
            }
        }
        return maxIndexes;
    }
    
    public static ArrayList<Integer> getMaxIndexes(double[] array)  {
        ArrayList maxIndexes = new ArrayList();
        if (array == null || array.length == 0) {
            return maxIndexes;
        }
        maxIndexes.add(0);
        double max = array[0];
        for (int i = 1; i < array.length; ++i) {
            if (max < array[i]) {
                max = array[i];
                maxIndexes.clear();
                maxIndexes.add(i);
            } else if (max == array[i]) {
                maxIndexes.add(i);
            }
        }
        return maxIndexes;
    }

}
