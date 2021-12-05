import java.awt.*;

public class Oval extends Shape {
    private final int width;
    private final int height;

    public void drawG2D(Graphics gr){
        Graphics2D g2D = (Graphics2D) gr;
        g2D.setPaint(super.getColor());
        g2D.fillOval(super.getX(), super.getY(), width, height);
    }

    public Oval(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }
}
