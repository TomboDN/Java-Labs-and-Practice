public class AToB {
    public static String recursion(int a, int b){
        if (a == b){
            return "" + a;
        }
        if (a < b){
            return recursion(a, b-1) + " " + b;
        }
        else return a + " " + recursion(a-1, b);
    }

    public static void main(String[] args) {
        System.out.println(recursion(1, 5));
        System.out.println(recursion(5, 1));
        System.out.println(recursion(5,5));

    }
}
