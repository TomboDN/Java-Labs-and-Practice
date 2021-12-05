import java.awt.*;

public class ImageDocument implements IDocument {
    private String fileName;
    private final Panel panel = new Panel();

    public Panel getPanel() {
        return panel;
    }

    public void saveFile() {};

}
