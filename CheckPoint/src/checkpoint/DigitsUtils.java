package checkpoint;

/**
 *
 * @author Maria
 */
abstract class DigitsUtils {
    
    private static int[] getDigitsArray(int number) {
        number = Math.abs(number);
        String string = String.valueOf(number);
        int[] digitsArray = new int[string.length()];        
        for (int i = digitsArray.length - 1; i >= 0; --i) {
            digitsArray[i] = number % 10;
            number /= 10;
        }
        return digitsArray;
    }
    
    protected static int getDigitsSum(int number) {
        int[] array = getDigitsArray(number);
        int sum = 0;
        for (int i : array) sum += i;
        return sum;
    }
    
}
