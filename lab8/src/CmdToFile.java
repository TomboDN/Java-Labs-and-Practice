import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CmdToFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите информацию для записи в файл");
        String text = sc.nextLine();

        try(FileWriter writer = new FileWriter("Example.txt", false)) {
            writer.write(text);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}


