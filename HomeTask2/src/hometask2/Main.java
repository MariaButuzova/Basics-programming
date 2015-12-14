/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometask2;

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
        test1AllOperators();
        test3String("4 + 5 = ", 4, false);
        System.out.println(test4HomeTask1("And repeate please: ", 100));
    }
    
    public static void test1AllOperators() {
        int intValueOne = 1;
        int intValueTen = 10;
        int intValueSix = 6;
        char charValue = '\u004D';
        double doubleValueOne = 1.1;
        double doubleValueGalaxy = 42.42;
        boolean booleanValue = true;
        
        int incrValueTwo = ++intValueOne;
        int incrValueTen = intValueTen++;
        intValueOne--;
        
        System.out.println("intValueOne = " + intValueOne + "; incrValueTwo = " + 
                incrValueTwo + "; intValueTen = " + --intValueTen + 
                "; incrValueTen = " + incrValueTen);
        System.out.println("doubleValueOne = " + doubleValueOne++ + 
                "; M + 1 = " + ++charValue + 
                "; doubleValueOne (after increment) = " + doubleValueOne);
        
        doubleValueOne += doubleValueGalaxy / ++doubleValueOne;
        doubleValueGalaxy *= intValueSix-- % 4;
        
        System.out.println("42.42 mod 10 = " + doubleValueGalaxy % intValueTen);
        System.out.println("2.1 + 42.42/(1+2.1) = " + doubleValueOne);
        System.out.println("(int)42.42 * (6 mod 4) + String '5' = " + 
                (int)doubleValueGalaxy + intValueSix);
        System.out.println("42.42 * (6 mod 4) + 5 = " + (doubleValueGalaxy + 
                intValueSix));
        System.out.println(!booleanValue);
    }
    
    public static void test3String(String str, int test, boolean bool) {
        System.out.println(str + (test + 5) + " == " + !bool);
    }
    
    public static String test4HomeTask1(String str, int r) {
        String strH = "Hello, ";
        String strU = "U-Rise";
        char cFact = '!';
        boolean bool = true;
        int iPercent = r;
        float fValue = 0.99f;
        //String strA = "There is ";
        String strB = ", that there are ";
        String strC = " percent sucess with ";
        String strD = " happiness.";
        
        System.out.println(strH+strU+cFact);
        System.out.println("There is " + bool + strB + iPercent + strC + fValue 
        + strD);
        str += strH + strU + cFact;
        return str;
    }
}
