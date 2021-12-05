public class TriangleSequence {
    public static String recursion(int n){
        int sum = 0;
        int j = 0;

        if (n == 1){
            return "1";
        } else {
            for (int i=1; sum < n; i++){
                sum += i;
                j = i;
            }
            return recursion(n-1) + " " + j;
        }
    }

    public static void main(String[] args) {
        System.out.println(recursion(10));
        System.out.println(recursion(1));
    }
}
