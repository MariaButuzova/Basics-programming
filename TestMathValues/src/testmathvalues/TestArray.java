/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmathvalues;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author solenko
 */

public class TestArray {
    final int[] arrayElement;
    final int elementsCount;
    
    TestArray(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        this.elementsCount = in.nextInt();
        arrayElement = new int[elementsCount];

        System.out.println("Enter " + elementsCount + " integers");
        for (int i = 0; i < arrayElement.length; i++) {
            arrayElement[i] = in.nextInt();
        }
        System.out.println("Your integer array for tests:");
        for(int i = 0; i < arrayElement.length; i++){
            this.arrayElement[i] = Math.abs(arrayElement[i]);
        System.out.println("["+ i +"] = "+ arrayElement[i]);
        }
    }
    
    //greatest common divisor
    public int gcd(){
        int[] getArray = Arrays.copyOf(arrayElement,arrayElement.length);
        int temp;
        int j = 0;
        int countIteration = 0;
        boolean flag;
        do {
            ++countIteration;
            Arrays.sort(getArray);
            //temp = the smallest element of an array 
            temp = getArray [j];
            //flag initializes last iteration
            flag = true;
            for (int i = j; i < getArray.length; i++) {
                //if some array element == 0
                if (getArray[i] == 0) {
                    return 0;
                }
                //if first(0) element == 1
                if (j == 0 && getArray[j] == 1) {
                    return 1;
                }

                if (getArray[i]%temp != 0){
                    getArray[i] %= temp;
                    flag = false;
                } else if (getArray[i]/temp > 1) {
                    getArray[i] = 1;
                    ++j;
                }
            }
        } while (flag == false);

        System.out.println("Greatest common divisor was found within " + 
                countIteration + " iteration(s)");
        System.out.println("gcd = " + 
                temp);
        return temp;
    }
}
