import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;

public class TextDocument implements IDocument {
    private String fileName;
    private final Panel panel = new Panel();
    private final TextArea textArea = new TextArea();

    TextDocument() {
        panel.add(textArea);
    }

    TextDocument(String text) {
        textArea.setText(text);
        panel.add(textArea);
    }

    public Panel getPanel() {
        return panel;
    }

    public void saveFile() {
        fileName = "";
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setFileFilter(new FileNameExtensionFilter("Text files", "txt"));
        int result = fileChooser.showSaveDialog(null);
        if (result==JFileChooser.APPROVE_OPTION) {
            fileName = fileChooser.getSelectedFile().getAbsolutePath();
        }
        try {
            FileWriter writer = new FileWriter(fileName, false);
            String text = textArea.getText();
            writer.write(text);
            writer.flush();
        } catch (IOException e) {
            System.out.println("Ошибка при записи");
        }
    }
}
