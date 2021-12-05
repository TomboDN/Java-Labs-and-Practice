import java.util.Collections;
import java.util.Stack;

public class Inverter {
    public static Integer[] invert(Integer[] arr) {

        Stack<Integer> stack = new Stack<Integer>();
        for (Integer integer : arr) {
            stack.push(integer);
        }

        for (int i = 0; i < (arr.length/2); i++)
        {
            Collections.swap(stack, i, arr.length-1-i);
        }

        arr = stack.toArray(new Integer[0]);
        return arr;
    }

    public static void main(String[] args) {
        Integer[] numbers = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Массив до разворота");
        for (Integer number : numbers) {
            System.out.println(number);
        }
        System.out.println();

        System.out.println("Массив после разворота");
        numbers = invert(numbers);
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
