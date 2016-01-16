package arraytasks;

import java.util.Arrays;
import mytasks.InputDataUtils;

/**
 *
 * @author Maria
 */
public class Main {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] intArray = InputDataUtils.getIntArrayRandom(-1, 1, 0);
        double[] doubleArray = InputDataUtils.getDoubleArrayRandom(-1, 1, 30);
        System.out.println(Arrays.toString(intArray));
        System.out.println(ArrayUtils.getMaxIndexes(intArray));
        System.out.println(Arrays.toString(doubleArray));
        System.out.println(ArrayUtils.getMaxIndexes(doubleArray));
    }

}
