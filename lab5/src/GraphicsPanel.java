import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GraphicsPanel extends JPanel {
    GraphicsPanel(){
        this.setPreferredSize(new Dimension(600, 600));
    }

    public void paint(Graphics gr) {
        Graphics2D g2D = (Graphics2D) gr;
        Random rand = new Random();
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        Color colorRand = new Color(r, g, b);
        g2D.setPaint(colorRand);
        int xRand = rand.nextInt(100) + 10;
        int yRand = rand.nextInt(100) + 10;
        int widthRand = rand.nextInt(290) + 10;
        int heightRand = rand.nextInt(290)+ 10;
        int choiceRand = rand.nextInt(3);
        switch (choiceRand) {
            case 0:
            {
                Rectangle rect = new Rectangle(colorRand, xRand, yRand, widthRand, heightRand);
                rect.drawG2D(gr);
            }
            case 1:
            {
                int arcWidthRand = rand.nextInt(50) + 10;
                int arcHeightRand = rand.nextInt(50) + 10;
                RoundRectangle roundRect = new RoundRectangle(colorRand, xRand, yRand, widthRand, heightRand, arcWidthRand, arcHeightRand);
                roundRect.drawG2D(gr);
            }
            case 2:
            {
                Oval oval = new Oval(colorRand, xRand, yRand, widthRand, heightRand);
                oval.drawG2D(gr);
            }
        }
    }
}
