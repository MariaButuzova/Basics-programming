package checkpoint;

import java.util.*;

/**
 *
 * @author Maria
 */
abstract class TriangleUtils {
    
    private static boolean isTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) return false;
        return ((a < b + c) && (b < c + a) && (c < a + b));
    }
    
    protected static boolean isEquilateralTriangle(int a, int b, int c) {
        if (!isTriangle(a, b, c)) {
            return false;
        }
        return (a == b && b == c);
    }
}
