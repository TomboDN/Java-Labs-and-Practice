public class Exception12 {
    public static void exceptionDemo(){
        try {
            System.out.println(2/0);
        } catch (ArithmeticException e){
            System.out.println("Attempted division by zero");
        }
    }
    public static void main(String[] args) {
        Exception12.exceptionDemo();
    }
}
