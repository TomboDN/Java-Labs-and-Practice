import java.util.Scanner;

public class Exception2Task4 {
    public static void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println( 2 / i );
        } catch (NumberFormatException e1) {
            System.out.println("Attempted insertion of a string or float");
        } catch (ArithmeticException e2) {
            System.out.println("Attempted division by zero");
        } finally {
            System.out.println("Block finally");
        }
    }
    public static void main(String[] args) {
        Exception2Task4.exceptionDemo();
    }
}
