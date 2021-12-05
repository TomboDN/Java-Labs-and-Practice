import java.util.Scanner;

public class Exception22 {
    public static void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println( 2 / i );
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }
    public static void main(String[] args) {
        Exception22.exceptionDemo();
    }
}
