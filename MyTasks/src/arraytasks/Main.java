/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        int[] intArray = InputDataUtils.getIntArrayRandom(-1, 1, 5);
        double[] doubleArray = InputDataUtils.getDoubleArrayRandom(-10, 10, 30);
        System.out.println(Arrays.toString(intArray));
        System.out.println(ArrayUtils.getMaxIndexes(intArray));
        System.out.println(Arrays.toString(doubleArray));
        System.out.println(ArrayUtils.getMaxIndexes(doubleArray));
    }

}
