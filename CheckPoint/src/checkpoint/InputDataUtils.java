package checkpoint;

import java.util.*;

/**
 *
 * @author Maria
 */
abstract class InputDataUtils {
    
    protected static int getSecondNumber() {
        Random random = new Random();
        return (random.nextInt(3) + 1);
    }
    
    protected static int getFirstNumber() {
        Random random = new Random();
        return (random.nextInt(333) + 1000);
    }
        
}
