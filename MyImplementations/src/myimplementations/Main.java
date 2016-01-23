package myimplementations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import mashka.utils.*;

/**
 *
 * @author Mashka
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyCollectionList col = new MyCollectionList();
        GregorianCalendar cal = new GregorianCalendar();
        
        GregorianCalendar cal2 = new GregorianCalendar();
        System.out.println(Arrays.toString(col.toArray()));
        col.add(1);
        col.add(cal);
        col.add(cal2);
        System.out.println(col);
        System.out.println(Arrays.toString(col.toArray()));
        ArrayList<Integer> data = new ArrayList();
        data.add(Integer.SIZE);
        data.add(Integer.MAX_VALUE);
        System.out.println(data);
        Object[] o = data.toArray();
        col.addAll(o);
    }

}
