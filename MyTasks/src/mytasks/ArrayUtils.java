package mytasks;

import java.math.BigInteger;
import java.util.*;

/**
 *
 * @author Maria
 */
public class ArrayUtils {
    
    private static boolean isEmptyArray(int[] array) {
        return (((array == null) || (array.length == 0)) ? false : true);
    }
    
    private static boolean isEmptyArray(double[] array) {
        return (((array == null) || (array.length == 0)) ? false : true);
    }
        
    public static ArrayList<Integer> getMaxIndexes(int[] array) {
        ArrayList arrayList = new ArrayList();
        if (!isEmptyArray(array)) return arrayList;
        arrayList.add(0);
        int max = array[0];
        for (int i = 1; i < array.length; ++i) {
            if (max < array[i]) {
                max = array[i];
                arrayList.clear();
                arrayList.add(i);
            } else if (max == array[i]) {
                arrayList.add(i);
            }
        }
        return arrayList;
    }
    
    public static ArrayList<Integer> getMaxIndexes(double[] array)  {
        ArrayList arrayList = new ArrayList();
        if (!isEmptyArray(array)) return arrayList;
        arrayList.add(0);
        double max = array[0];
        for (int i = 1; i < array.length; ++i) {
            if (max < array[i]) {
                max = array[i];
                arrayList.clear();
                arrayList.add(i);
            } else if (max == array[i]) {
                arrayList.add(i);
            }
        }
        return arrayList;
    }
    
    public static ArrayList<Integer> getFibonacciNumbers(int[] array) {
        ArrayList arrayList = new ArrayList();
        if (!isEmptyArray(array)) return arrayList;
        Arrays.sort(array);
        int j = 1;
        int fib = 1;
        for (int i = 0; i < array.length; ++i) {
            for (; j <= array[i]; j += fib, fib = j - fib) {
                if ((array[i] == j) && (arrayList.lastIndexOf(array[i]) == -1)) {
                    arrayList.add(array[i]);
                }
            }
        }
        return arrayList;
    }
    
    public static ArrayList<Integer> getNotFibonacciNumbers(int[] array) {
        ArrayList arrayList = new ArrayList();
        if (!isEmptyArray(array)) return arrayList;
        Arrays.sort(array);
        int j = 1;
        int fib = 1;
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; ++i) {
            if (array[i] > fib) {
                for (; fib < array[i];) {
                    fib += j;
                    j = fib - j;
                }
            } 
            if (array[i] < fib) {
                arrayList.add(array[i]);
            }
        }
        return arrayList;
    }
}
