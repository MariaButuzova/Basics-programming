package mytasks;

/**
 *
 * @author Maria
 */
public class StringDataUtils {
   
    public static String addHelloToString(String string) {
        StringBuilder s = new StringBuilder("Hello");
        s.append(string);
        return s.toString();
    }
   
    public static boolean checkStringIsNumber(String string) {
        int i = 0;
        while (i < string.length() && Character.isDigit(string.charAt(i))) {
            ++i;
            return true;
        }
        return false;
    }
}
