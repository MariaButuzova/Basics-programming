package mytasks;

import java.util.*;

/**
 *
 * @author Maria
 */
public class TriangleUtils {
    
    public static boolean checkTriangle(int a, int b, int c) {
        return ((a < b + c) && (b < c + a) && (c < a + b));
    }
    
    public static boolean checkRightTriangle(int a, int b, int c) {
        if (TriangleUtils.checkTriangle(a, b, c)) {
            a *= a;
            b *= b;
            c *= c;
            return ((a == b + c) || (b == a + c) || (c == a + b));
        }
        System.out.println("There is not triangle!");
        return false;
    }
    
    public static boolean checkIsoscelesTriangle(int a, int b, int c) {
        if (!TriangleUtils.checkTriangle(a, b, c)) {
            System.out.println("There is not triangle!");
            return false;
        }
        return ((a == b) || (b == c) || (a == c));
    }
    
    public static boolean checkEquilateralTriangle(int a, int b, int c) {
        if (!TriangleUtils.checkTriangle(a, b, c)) {
            System.out.println("There is not triangle!");
            return false;
        }
        System.out.println(a == b && b == c);
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
        if (!TriangleUtils.checkTrianglesDataCount(array)) {
            System.out.println("The count of values isn't multiple 3.");
            System.out.println("Data couldn't be used for triangles.");
            return false;
        }
        if (!TriangleUtils.checkTrianglesDataValues(array)) {
            return false;
        }
        System.out.println("Data should have the next format:\n"
                + "\"a[0],b[0],c[0],a[1],b[1],c[1]....n where a[n], b[n], c[n] are sides "
                + "of [n] triangle");
        System.out.println("Data have been verified.\n"
                + "Well, lets start checking triangles.");       
        return true;
    }
    
    public static int getCountEquilateralTrianglesWithAnyData(int[] array) {
        Arrays.sort(array);
        int count = 1;
        int allCount = 0;
        for (int i = 0, j = 1; j < array.length; ++j) {
            if ((array[j] != array[i]) || (j == (array.length - 1))) {
                if ((count / 3 > 0) && (array[i] > 0)) {
                    System.out.println("Traingles with a == b == c == " 
                            + array[i] + " : " + count / 3);
                }
                i = j;
                allCount += count / 3;
                count = 0;
            }
            ++count;
        }
        System.out.println("Estimated count of triangles: " + (array.length/3));
        System.out.println("Actual count of triangles: " + allCount);
        return allCount;
    }
         
    public static int getCountTriangles(int[] array){
        if (!TriangleUtils.checkTrianglesData(array)) {
            System.out.println("The count of triangles = 0");
            return 0;
        }
        System.out.println("Checking triangles:");
        int count = 0;
        for (int i = 0; i < array.length; i += 3) {
            System.out.println("a = "+ array[i]
                    + "; b = " + array[i + 1] + "; c = " + array[i + 2]);
            count = (TriangleUtils.checkTriangle(array[i],
                    array[i + 1], array[i + 2]) ? ++count : count);
        }
        System.out.println("Count of triangles: " + count);
        return count;
    }
    
    public static int getCountRightTriangles(int[] array){
        if (!TriangleUtils.checkTrianglesData(array)) {
            System.out.println("The count of right triangles = 0");
            return 0;
        }
        System.out.println("Checking right triangles:");
        int count = 0;
        for (int i = 0; i < array.length; i += 3) {
            System.out.println("a = "+ array[i]
                    + "; b = " + array[i + 1] + "; c = " + array[i + 2]);
            count = (TriangleUtils.checkRightTriangle(array[i],
                    array[i + 1], array[i + 2]) ? ++count : count);
        }
        System.out.println("Count of right triangles: " + count);
        return count;
    }
    
    public static int getCountIsoscelesTriangles(int[] array){
        if (!TriangleUtils.checkTrianglesData(array)) {
            System.out.println("The count of isosceles triangles = 0");
            return 0;
        }
        System.out.println("Checking isosceles triangles:");
        int count = 0;
        for (int i = 0; i < array.length; i += 3) {
            System.out.println("a = "+ array[i]
                    + "; b = " + array[i + 1] + "; c = " + array[i + 2]);
            count = (TriangleUtils.checkIsoscelesTriangle(array[i],
                    array[i + 1], array[i + 2]) ? ++count : count);
        }
        System.out.println("Count of isosceles triangles: " + count);
        return count;
    }
    
    public static int getCountEquilateralTriangles(int[] array){
        if (!TriangleUtils.checkTrianglesData(array)) {
            System.out.println("The count of equilateral triangles = 0");
            return 0;
        }
        System.out.println("Checking equilateral triangles:");
        int count = 0;
        for (int i = 0; i < array.length; i += 3) {
            System.out.println("a = "+ array[i]
                    + "; b = " + array[i + 1] + "; c = " + array[i + 2]);
            count = (TriangleUtils.checkEquilateralTriangle(array[i],
                    array[i + 1], array[i + 2]) ? ++count : count);
        }
        System.out.println("Count of equilateral triangles: " + count);
        return count;
    }

}
