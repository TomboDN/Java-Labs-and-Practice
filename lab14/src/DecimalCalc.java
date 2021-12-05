import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;


public class DecimalCalc {
    public static Double decimalCalc(List<String> arrayForOut){
        Double a = null, b = null;
        Deque<Double> deque = new ArrayDeque<>();
        for (String str : arrayForOut){
            if (str.equals("+"))
                deque.push(deque.pop() + deque.pop());
            else if (str.equals("-")){
                a = deque.pop();
                b = deque.pop();
                deque.push(b - a);
            }
            else if (str.equals("*"))
                deque.push(deque.pop() * deque.pop());
            else if (str.equals("/")){
                a = deque.pop();
                b = deque.pop();
                deque.push(b / a);
            }
            else if (str.equals("with-"))
                deque.push(-deque.pop());
            else
                deque.push(Double.valueOf(str));
        }
        return deque.pop();
    }
}
