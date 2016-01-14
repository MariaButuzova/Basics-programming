package mytasks;


/**
 *
 * @author Maria
 */
public class ArrayUtils {
    
    public static int[] getMaxIndexes(int[] array) {
        int[] maxIndexes;
        if (array == null || array.length == 0) {
            maxIndexes = new int[0];
            return maxIndexes;
        }
        int max = array[0];
        int maxCount = 1;
        int index = 0;
        for (int i = 1; i < array.length; ++i) {
            if (max < array[i]) {
                max = array[i];
                index = i;
                maxCount = 1;
                System.out.println(index);
            } else if (max == array[i]) {
                ++maxCount;
            }
        }
        maxIndexes = new int[maxCount];
        maxIndexes[0] = index;
        for (int i = 1, j = index + 1; i < maxCount && j < array.length; ++j) {
            if (max == array[j]) {
                maxIndexes[i] = j;
                ++i;
            }
        }
        return maxIndexes;
    }
    
    public static int[] getMaxIndexes(double[] array)  {
        int[] maxIndexes;
        if (array == null || array.length == 0) {
            maxIndexes = new int[0];
            return maxIndexes;
        }
        double max = array[0];
        int maxCount = 1;
        int index = 0;
        for (int i = 1; i < array.length; ++i) {
            if (max < array[i]) {
                max = array[i];
                index = i;
                maxCount = 1;
            } else if (max == array[i]) {
                ++maxCount;
            }
        }
        maxIndexes = new int[maxCount];
        maxIndexes[0] = index;
        for (int i = 1, j = index + 1; i < maxCount && j < array.length; ++j) {
            if (max == array[j]) {
                maxIndexes[i] = j;
                ++i;
            }
        }
        return maxIndexes;
    }

}
