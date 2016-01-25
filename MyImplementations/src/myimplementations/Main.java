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
        GregorianCalendar cal = null;
        GregorianCalendar cal2 = new GregorianCalendar();
        System.out.println(Arrays.toString(col.toArray()));
        col.add(1);
        //System.out.println(col.size());
        //System.out.println(Arrays.toString(col.toArray()));
        col.add('d');
        col.add(4);
        System.out.println(Arrays.toString(col.toArray()));
        ArrayList<Integer> data = new ArrayList();
        data.add(Integer.SIZE);
        data.add(Integer.MAX_VALUE);
        col.addAll(2, data);
        System.out.println(Arrays.toString(col.toArray()));
        System.out.println(col.size());
        col.addAll(4, data);
        System.out.println(Arrays.toString(col.toArray()));
        System.out.println(col.get(4));
        Object d = col.remove(0);
        System.out.println(col.indexOf(null));
        System.out.println(Arrays.toString(col.toArray()));
        //System.out.println(data);
        //Object[] o = data.toArray();
        //Arrays.copyOf(o, o.length);
        //System.out.println(Arrays.toString(o));
        //col.addAll(1, o);
        //System.out.println(Arrays.toString(col.toArray()));
    }

}
