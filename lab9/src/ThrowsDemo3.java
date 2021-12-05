import java.util.Scanner;

public class ThrowsDemo3 {
    public static void getKey() {
        try {
            Scanner myScanner = new Scanner( System.in );
            String key = myScanner.next();
            printDetails( key );
            printDetails( "" );
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }
    public static void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println( message );
        } catch ( Exception e) {
            throw e;
        }
    }
    private static String getDetails(String key) throws Exception {
        if (key == "") {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }
    public static void main(String[] args) {
        ThrowsDemo3.getKey();
    }
}
