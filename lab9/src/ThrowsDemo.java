public class ThrowsDemo {
    public static void getDetails(String key) {
        try {
            if(key == null) {
                throw new NullPointerException( "null key in getDetails" );
            }
            // do something with the key
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException");
        }
    }
    public static void main(String[] args) {
        ThrowsDemo.getDetails(null);
    }
}