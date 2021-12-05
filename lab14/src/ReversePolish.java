import java.util.*;

public class ReversePolish {
    private static String delimiters = "() */-+";
    private static String operators = "*/-+";
    public static boolean isRight = true;

    private static boolean isOperator(String key){
        if (key.equals("with-")) return true;
        for (int i = 0; i < operators.length();i++){
            if (key.charAt(0) == operators.charAt(i)) return true;
        }
        return false;
    }

    private static boolean isDelimiter(String key){
        if (key.length() != 1) return false;
        for (int i = 0; i< delimiters.length();i++){
            if (key.charAt(0) == delimiters.charAt(i)) return true;
        }
        return false;
    }

    private static int getPriority(String token){
        if (token.equals("(")) return 1;
        if (token.equals("+") || token.equals("-")) return 2;
        if (token.equals("*") || token.equals("/")) return 3;
        return 4;
    }

    public static List<String> parseExpression(String line){
        Deque<String> stackForRPN = new ArrayDeque<>();
        List<String> arrayForOut = new ArrayList<>();
        StringTokenizer stringTokenizer = new StringTokenizer(line, delimiters, true);

        String first = "";
        String second = "";
        while (stringTokenizer.hasMoreTokens()){
            first = stringTokenizer.nextToken();
            if (!stringTokenizer.hasMoreTokens() && isOperator(first)){
                System.out.println("Неверная запись, число после оператора");
                isRight = false;
                return arrayForOut;
            }
            if (first.equals(" ")) continue;
            if (isDelimiter(first)){
                if (first.equals("(")) stackForRPN.push(first);
                else if (first.equals(")")){
                    while (!stackForRPN.peek().equals("(")){
                        arrayForOut.add(stackForRPN.pop());
                        if (stackForRPN.isEmpty()){
                            System.out.println("Ошибка в скобках");
                            isRight = false;
                            return arrayForOut;
                        }
                    }
                    stackForRPN.pop();
                    if (!stackForRPN.isEmpty() && isOperator(stackForRPN.peek())){
                        arrayForOut.add(stackForRPN.pop());
                    }
                } else {
                    if (first.equals("-") && (second.equals("") || (isDelimiter(second) && !second.equals(")")))){
                        first = "with-";
                    } else {
                        while (!stackForRPN.isEmpty() && (getPriority(first) <= getPriority(stackForRPN.peek()))){
                            arrayForOut.add(stackForRPN.pop());
                        }
                    }
                    stackForRPN.push(first);
                }
            }
            else {
                arrayForOut.add(first);
            }
            second = first;
        }
        while (!stackForRPN.isEmpty()){
            if (isOperator(stackForRPN.peek())) arrayForOut.add(stackForRPN.pop());
            else {
                System.out.println("Ошибка в скобках");
                isRight = false;
                return arrayForOut;
            }
        }
        return arrayForOut;
    }
}
