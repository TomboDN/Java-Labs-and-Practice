import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CreateTextDocument implements ICreateDocument{
    public IDocument createNew() {
        return new TextDocument();
    }
    public IDocument createOpen() {
        String buf2 = "";
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new FileNameExtensionFilter("Text files", "txt"));
        chooser.showOpenDialog(new JFrame());
        var file = chooser.getSelectedFile();
        try {
            FileReader reader = new FileReader(file);
            char [] buf = new char [(int) file.length()];
            reader.read(buf);
            buf2 = new String(buf);
            return new TextDocument(buf2);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка, файл не найден");
        } catch (IOException e) {
            System.out.println("Ошибка при прочтении файла");
        } catch (NullPointerException e) {
            System.out.println("Окно выбора было просто закрыто");
        }
        return new TextDocument("");
    }
}
