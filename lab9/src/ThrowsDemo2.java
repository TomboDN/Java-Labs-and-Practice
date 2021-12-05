public class ThrowsDemo2 {
    public static void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println( message );
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException");
        }
    }
    public static String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException( "null key in getDetails" );
        }
        return "data for" + key;
    }

    public static void main(String[] args) {
        ThrowsDemo2.printMessage(null);
    }
}
