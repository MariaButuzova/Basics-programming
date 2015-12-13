/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author solenko
 */
public class HomeTasks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // start1();
        // TODO code application logic here
        // start2(true);
        start2(false);
        // System.out.println(buff(false));
    }
    
    public static void start1() {
        String strH = "Hello, ";
        String strU = "U-Rise";
        char cFact = '!';
        boolean bool = true;
        int iPercent = 100;
        //double dValue = 0.99;
        float fValue = 0.99f;
        //String strA = "There is ";
        String strB = ", that there are ";
        String strC = " percent sucess with ";
        String strD = " happiness.";
        
        System.out.println(strH+strU+cFact);
        System.out.println("There is " + bool + strB + iPercent + strC + fValue 
        + strD);
    }
    public static void start2(boolean flag) {
        // int n = 1;
        boolean myFlag = true;
        myFlag = !myFlag;
        System.out.println(!flag);
        
    }
    
    public static boolean buff(boolean test1) {
        // System.out.println("ttt");
        boolean n = true;
        n = !n;
        // System.out.println(n);
        return(test1 = n);
    }
    
    
}
