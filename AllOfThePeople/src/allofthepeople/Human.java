/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allofthepeople;

/**
 *
 * @author Mari
 */
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.ParseException;

//import java.util.Locale;

public class Human {

    /**
     *
     */
    final Date birthDate;
    final String fullName;

    //int month 0..11
    Human(/*String birthDateString*/int year, int month, int dayOfMonth,
            String fullName) {
//        birthDate = parseDateString(birthDateString);
        Calendar calDate = Calendar.getInstance();
        calDate.set(year, --month, dayOfMonth);
        birthDate = calDate.getTime();
        System.out.println(calDate.getTime());
        this.fullName = fullName;
    }
    
    /**
     *
     */

    
/*    final Date parseDateString(String input) {
        DateFormat dateFormat = new SimpleDateFormat("dd.mm.yyyy");
        try {
            birthDate = dateFormat.parse(input);
            System.out.println("date: " + dateFormat.format(birthDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return birthDate;
    }
*/
    Integer humanAge() {
        Calendar tempDayOfBirth = Calendar.getInstance();
        
        // get current date
        // костыли
        // DateFormat dateFormat = new SimpleDateFormat("dd.mm.yyyy");
        Calendar today = Calendar.getInstance();
 
        tempDayOfBirth.setTime(birthDate);
        System.out.println(birthDate);
        // include day of birth
        //tempDayOfBirth.add(Calendar.DAY_OF_MONTH, -1);
//        System.out.println(tempDayOfBirth.get(Calendar.DAY_OF_MONTH));
//        System.out.println(tempDayOfBirth.getTime());

//        System.out.println(tempDayOfBirth.get(Calendar.MONTH));
        System.out.println(today.getTime());
//        System.out.println(today.get(Calendar.DAY_OF_WEEK));
        int age = today.get(Calendar.YEAR) - tempDayOfBirth.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) < 
                tempDayOfBirth.get(Calendar.DAY_OF_YEAR)) {
            --age;   
        }
        System.out.println(fullName + "'s age: " + age);
        return age;
    }
}
