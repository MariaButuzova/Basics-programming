package mytasks;

import java.util.*;

/**
 *
 * @author Maria
 */
public class QuadraticEquation {
    final int a;
    final int b;
    final int c;
    final double discriminant;
    private double[] arrayRoots;
    
    QuadraticEquation() {
        Random random = new Random();
        a = getNonZeroRandom();
        b = random.nextInt(41) - 20;
        c = random.nextInt(41) - 20;
        discriminant = calculateDiscriminant();
    }
    
    QuadraticEquation(int a, int b, int c) {
        this.a = a; //a != 0
        this.b = b;
        this.c = c;
        discriminant = calculateDiscriminant();
    }
    
    private static int getNonZeroRandom() {
        Random random = new Random();
        int nonZero = random.nextInt(41) - 20;
        while (nonZero == 0) {
            nonZero = random.nextInt(41) - 20;
        }
        return nonZero;
    }
    
    private double calculateDiscriminant() {
        return (b*b - 4*a*c);
    }
  
    public double[] getRoots() {
        if (discriminant > 0) {
            double d = Math.sqrt(discriminant);
            arrayRoots = new double[2];
            arrayRoots[0] = (-b - d)/(2*a);
            arrayRoots[1] = (-b + d)/(2*a);
            return arrayRoots;
        }
        if (discriminant == 0) {
            arrayRoots = new double[1];
            arrayRoots[0] = -b/(2*a);
            return arrayRoots;
        }
        arrayRoots = new double[0];
        return arrayRoots;
    }
  
}
