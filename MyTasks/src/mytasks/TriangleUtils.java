package mytasks;

import java.util.*;

/**
 *
 * @author Maria
 */
public class TriangleUtils {
    
    public static boolean isTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) return false;
        return ((a < b + c) && (b < c + a) && (c < a + b));
    }
    
    public static boolean isRightTriangle(int a, int b, int c) {
        if (!isTriangle(a, b, c)) {
            return false;
        }
        a *= a;
        b *= b;
        c *= c;
        return ((a == b + c) || (b == a + c) || (c == a + b));
    }
    
    public static boolean isIsoscelesTriangle(int a, int b, int c) {
        if (!isTriangle(a, b, c)) {
            return false;
        }
        return ((a == b) || (b == c) || (a == c));
    }
    
    public static boolean isEquilateralTriangle(int a, int b, int c) {
        if (!isTriangle(a, b, c)) {
            return false;
        }
        return (a == b && b == c);
    }
    
    public static boolean checkTrianglesDataValues(int[] array) {
        for (int i : array) {
            if (i <= 0) {
                System.out.println("Data contains values <= 0.");
                return false;
            }
        }
        return true;
    }
    
    public static boolean checkTrianglesDataCount(int[] array) {
        return (array.length % 3 == 0);
    }
    
    public static boolean checkTrianglesData(int[] array) {
        if (!checkTrianglesDataCount(array)) {
            System.out.println("The count of values isn't multiple 3.");
            System.out.println("Data couldn't be used for triangles.");
            return false;
        }
        if (!checkTrianglesDataValues(array)) {
            return false;
        }
        System.out.println("Data should have the next format:\n"
                + "\"a[0],b[0],c[0],a[1],b[1],c[1]....n where a[n], b[n], c[n] are sides "
                + "of [n] triangle");
        return true;
    }
    
    public static int getCountEquilateralTrianglesAnyData(int[] array) {
        Arrays.sort(array);
        int count = 1;
        int actualCount = 0;
        for (int i = 0, j = 1; j < array.length; ++j) {
            if ((array[j] != array[i]) || (j == (array.length - 1))) {
                if ((count / 3 > 0) && (array[i] > 0)) {
                    System.out.println("Traingles with a == b == c == " 
                            + array[i] + " : " + count / 3);
                }
                i = j;
                actualCount += count / 3;
                count = 0;
            }
            ++count;
        }
        System.out.println("Estimated count of triangles: " + (array.length/3));
        System.out.println("Actual count of triangles: " + actualCount);
        return actualCount;
    }

    public static int getCountEquilateralTriangles(int[] array){
        if (!checkTrianglesData(array)) {
            return (getCountEquilateralTrianglesAnyData(array));    
        }
        int count = 0;
        for (int i = 0; i < array.length; i += 3) {
            if (isEquilateralTriangle(array[i], array[i + 1],
                    array[i + 2])) {
                ++count;
            }
        }
        return count;
    }

}
