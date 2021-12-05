import java.awt.*;

public class RoundRectangle extends Shape{
    private final int width;
    private final int height;
    private final int arcWidth;
    private final int arcHeight;


    public void drawG2D(Graphics gr){
        Graphics2D g2D = (Graphics2D) gr;
        g2D.setPaint(super.getColor());
        g2D.fillRoundRect(super.getX(), super.getY(), width, height, arcWidth, arcHeight);
    }

    public RoundRectangle(Color color, int x, int y, int width, int height, int arcWidth, int arcHeight) {
        super(color, x, y);
        this.width = width;
        this.height = height;
        this.arcWidth = arcWidth;
        this.arcHeight = arcHeight;
    }

}
