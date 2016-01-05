package mytasks;

/**
 *
 * @author Maria
 */
public class TriangleUtils {
    
    public static boolean checkAllTriangles(int a, int b, int c) {
        return ((a < b + c) && (b < c + a) && (c < a + b));
    }
    
    public static boolean checkRightTriangle(int a, int b, int c) {
        if (TriangleUtils.checkAllTriangles(a, b, c)) {
            a *= a;
            b *= b;
            c *= c;
            return ((a == b + c) || (b == a + c) || (c == a + b));
        }
        System.out.println("There is not triangle!");
        return false;
    }
    
    public static boolean checkIsoscelesTriangle(int a, int b, int c) {
        if (!TriangleUtils.checkAllTriangles(a, b, c)) {
            System.out.println("There is not triangle!");
            return false;
        }
        return ((a == b) || (b == c) || (a == c));
    }
    
    public static boolean checkEquilateralTriangle(int a, int b, int c) {
        if (!TriangleUtils.checkAllTriangles(a, b, c)) {
            System.out.println("There is not triangle!");
            return false;
        }
        return (a == b && b == c);
    }

}
