import java.util.Scanner;

public class ThrowsDemo5 {
    public static void getKey() {
        boolean completed = false;
        while (!completed) {
            try {
                Scanner myScanner = new Scanner(System.in);
                System.out.print("Enter Key ");
                String key = myScanner.nextLine();
                printDetails(key);
                completed = true;
            } catch (Exception e) {
                System.out.println("Exception caught");
            }
        }
    }
    public static void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message ); }
    private static String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }

    public static void main(String[] args) throws Exception {
        ThrowsDemo5.getKey();
    }
}
