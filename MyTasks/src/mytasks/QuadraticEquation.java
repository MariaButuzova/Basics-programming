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
    final static int COUNT_RANDOM_NUMBERS = 41; //there are 41 elements in range
    final static int FIRST_RANDOM_NUMBER = -20; //starts range
    private double[] arrayRoots;
    
    QuadraticEquation() {
        Random random = new Random();
        a = getNonZeroRandom();
        b = random.nextInt(COUNT_RANDOM_NUMBERS) + FIRST_RANDOM_NUMBER; // [-20; 20]
        c = random.nextInt(COUNT_RANDOM_NUMBERS) + FIRST_RANDOM_NUMBER;
    }
    
    QuadraticEquation(int a, int b, int c) {
        this.a = a; //a != 0
        this.b = b;
        this.c = c;
    }
    
    private static int getNonZeroRandom() {
        Random random = new Random();
        int nonZero = 0;
        while (nonZero == 0) {
            nonZero = random.nextInt(COUNT_RANDOM_NUMBERS) + FIRST_RANDOM_NUMBER;
        }
        return nonZero;
    }
    
    private double calculateDiscriminant() {
        return (b*b - 4*a*c);
    }
  
    public double[] getRoots() {
        double discriminant = calculateDiscriminant();
        arrayRoots = new double[0];
        if (discriminant > 0) {
            double d = Math.sqrt(discriminant);
            arrayRoots = new double[2];
            arrayRoots[0] = (-b - d)/(2*a);
            arrayRoots[1] = (-b + d)/(2*a);
        } else if (discriminant == 0) {
            arrayRoots = new double[1];
            arrayRoots[0] = -b/(2*a);
        }
        return arrayRoots;
    }
  
}
