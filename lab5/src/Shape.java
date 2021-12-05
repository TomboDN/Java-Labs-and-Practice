import java.awt.*;

public abstract class Shape {
    private final Color color;
    private final int x;
    private final int y;

    public Color getColor() { return color;}
    public int getX() { return x;}
    public int getY() { return y;}

    public Shape(Color color, int x, int y){
        this.color = color;
        this.x = x;
        this.y = y;
    }
}
