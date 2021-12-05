import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegCheck {
    public static void tokenizer(String string) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите regex или обычный разделитель");
            String delimiter = scanner.nextLine();
            String[] words = string.split(delimiter);
            for (String word : words) {
                System.out.println(word);
            }
        } catch (Exception e) {
            System.out.println("Неправильный regex");
        }
    }
    public static void currenciesCheck(String string) {
        String regex = "[0-9]+.[0-9]+[ ]USD|[0-9]+.[0-9]+[ ]RUB|[0-9]+.[0-9]+[ ]EU";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            System.out.println(string.substring(matcher.start(), matcher.end()));
        }
    }

    public static void main(String[] args) {
        String test1 = "съешь еще этих мягких французских булок да выпей чаю";
        String test2 = "25.98 USD 44 ERR, 0.004 EU 0.23 RUB 4324 EU";

        tokenizer(test1);
        System.out.println();

        currenciesCheck(test2);
    }
}
