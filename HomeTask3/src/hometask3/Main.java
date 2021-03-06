/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometask3;

/**
 *
 * @author Maria
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i <= 6; i++) {
            test3Switch(i);
        }
    }
    
    public static void test3Switch(int testNumber) {
        switch (testNumber) {
            case 1:
                System.out.println("Test 1:");
                test1If();
                System.out.println(test1Tern());
                break;
            case 2:
                System.out.println("Test 2:");
                test2GetFibonacciNumbers((int)(Math.random()*185) - 92);
                break;
            case 3:
                System.out.println("Test 3:");
                System.out.println("done!");
                break;
            case 4:
                System.out.println("Test 4:");
                for (int i = 0; i < 5;) {
                    System.out.println(++i + test4GetString(": ", 100));
                }
                break;
            case 5:
                System.out.println("Test 5:");
                test5OutputNumbers();
                break;
            default:
                System.out.println("There are only 5 tests. To be continued...");
        }
    }
    
    public static int getFormulaResult() {
        return (int)(Math.random()*3) + 4;
    }
    
    public static void test1If() {
        int result = getFormulaResult();
        if (result < 5) {
            System.out.println(result + " < 5");
        } else if (result > 5) {
            System.out.println(result + " > 5");
        } else {
        System.out.println(result + " = 5");
        }
    }
    
    public static String test1Tern() {
        int result = getFormulaResult();
        System.out.println(result);
        return ( result > 5) ? "> 5" : "<= 5";
    }
    
    public static long test2GetFibonacciNumbers(int indexFibonacci){
        long numberFibonacci = 1;
        if (indexFibonacci < 0) {
            System.out.println(indexFibonacci + " < 0. It was changed to +");
            indexFibonacci = Math.abs(indexFibonacci);
        }
        if (indexFibonacci == 2 || indexFibonacci == 1) {
            for (int i = 1; i <= indexFibonacci; i++) {
              System.out.println(i + " element: " + 1);
            }
            return numberFibonacci = 1;
            
        } else if (indexFibonacci == 0) {
            System.out.println(0 + " element: " + 0);
            return numberFibonacci = 0;
        }
        long a = 1;
        System.out.println(1 + " element: " + a);
        long b = 1;
        System.out.println(2 + " element: " + b);
        for (int i = 3; i < indexFibonacci; ++i){
            numberFibonacci = a + b;
            b = a;
            a = numberFibonacci;
            System.out.println(i + " element: " + numberFibonacci);
        }
            //System.out.println(numberFibonacci);
            return numberFibonacci;         
    }
    
    public static String test4GetString(String str, int r) {
        String strH = "Hello, ";
        String strU = "U-Rise";
        char cFact = '!';
        boolean bool = true;
        int iPercent = r;
        float fValue = 0.99f;
        String strB = ", that there are ";
        String strC = " percent sucess with ";
        String strD = " happiness.";
        System.out.println("There is " + bool + strB + iPercent + strC + fValue 
        + strD);
        return str +=strH + strU + cFact;
    }
    
    public static void test5OutputNumbers() {
        int i = 0;
        while (i < 10) System.out.println(++i);        
    }
}
