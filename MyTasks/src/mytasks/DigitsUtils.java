/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mytasks;

/**
 *
 * @author Maria
 */
public class DigitsUtils {
   
    public static int getDigitsSum(int[] array) {
        int sum = 0;
        for (int i : array) sum += i;
        return sum;
    }
    
    public static boolean isPalindrome(int[] array) {
        for (int i = 0, j = array.length - 1; i < j; ++i, --j) {
            if (array[i] != array[j]) return false;
        }
        return true;
    }
    
    public static boolean isEvenSumHalfDigits(int[] array) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0, j = array.length - 1; i < j; ++i, --j) {
            sum1 += array[i];
            sum2 += array[j];
        }
        return (sum1 == sum2);
    }
    
    public static boolean isNotLessDigit(int[] array) {
        for (int i = 1; i < array.length; ++i) {
            if (array[i - 1] < array[i]) return false;
        }
        return true;
    }

}
