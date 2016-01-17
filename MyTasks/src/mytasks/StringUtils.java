package mytasks;

/**
 *
 * @author Maria
 */
abstract class StringUtils {
   
    public static String addHelloToString(String string) {
        StringBuilder s = new StringBuilder("Hello");
        s.append(string);
        return s.toString();
    }
    
    abstract boolean isInteger();
    
    abstract boolean isDouble();
   
    public static boolean checkStringIsNumber(String string) {
        if (string == null) {
            return false;
        }
        string = string.trim();
        if (string.length() == 0) {
            return false;
        }
        if ((string.charAt(0) != '-') && (!Character.isDigit(string.charAt(0)))) {
            return false;
        }
        int i = 1;
        while (string.charAt(i) == ' ') {
            ++i;
        }
        if (i == string.length() - 1 && string.charAt(i) == '.') {
            return false;
        }
        boolean point = true;
        for (; i < string.length(); ++i) {
            if (!point && string.charAt(i) == '.') {
                return false;
            }
            if (!Character.isDigit(string.charAt(i)) && (string.charAt(i) != '.')) {
                return false;
            }
            if (string.charAt(i) == '.') {
                point = false;
            }
        }
        return true;
    }
       
}
