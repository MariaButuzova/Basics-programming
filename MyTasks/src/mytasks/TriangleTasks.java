package mytasks;

import java.util.*;

/**
 *
 * @author Maria
 */
abstract class TriangleTasks extends Task{
    
    protected static boolean isTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) return false;
        return ((a < b + c) && (b < c + a) && (c < a + b));
    }
    
    protected static boolean isRightTriangle(int a, int b, int c) {
        if (!isTriangle(a, b, c)) {
            return false;
        }
        a *= a;
        b *= b;
        c *= c;
        return ((a == b + c) || (b == a + c) || (c == a + b));
    }
    
    protected static boolean isIsoscelesTriangle(int a, int b, int c) {
        if (!isTriangle(a, b, c)) {
            return false;
        }
        return ((a == b) || (b == c) || (a == c));
    }
    
    protected static boolean isEquilateralTriangle(int a, int b, int c) {
        if (!isTriangle(a, b, c)) {
            return false;
        }
        return (a == b && b == c);
    }
    
    private static boolean checkTrianglesDataValues(int[] array) {
        for (int i : array) {
            if (i <= 0) {
                System.out.println("Data contains values <= 0.");
                return false;
            }
        }
        return true;
    }
    
    private static boolean checkTrianglesDataCount(int[] array) {
        return (array.length % 3 == 0);
    }
    
    private static boolean checkTrianglesData(int[] array) {
        if (!checkTrianglesDataCount(array)) {
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
    
    protected static int getCountEquilateralTrianglesAnyData(int[] array) {
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

    protected static int getCountEquilateralTriangles(int[] array){
        if (!checkTrianglesData(array)) {
            System.out.println("Let's get count with any data:");
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
