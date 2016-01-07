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
        if (string == null || string.length() == 0) {
            return false;
        }
        string = string.trim();
        if ((string.charAt(0) != '-') && (!Character
                .isDigit(string.charAt(0)))) {
            return false;
        }
        int i = 1;
        while (string.charAt(i) == ' ') {
            ++i;
        }
        System.out.println("++i = " + i);
        boolean point = true;
        for (; i < string.length(); ++i) {
            System.out.println(string.charAt(i));
            if (!point && string.charAt(i) == '.') {
                return false;
            }
            if (!Character.isDigit(string.charAt(i)) && (string.charAt(i) != '.')) {
                System.out.println("false -- " + string.charAt(i));
                return false;
            }
            if (string.charAt(i) == '.') {
                point = false;
            }
        }
        return true;
    }
       
}
