/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allofthepeople;

/**
 *
 * @author solenko
 */
import java.util.Date;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        setHuman();
    }
    
    /**
     *
     */
    public static void setHuman() {
        Human masha = new Human(1983,12,15,"Masha");
        //masha.formatBirthDate();
        masha.humanAge();
    }
}
