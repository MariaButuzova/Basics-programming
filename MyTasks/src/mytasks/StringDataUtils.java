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
        for (int i = 0; i < string.length(); ++i) {
            if (!Character.isDigit(string.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
