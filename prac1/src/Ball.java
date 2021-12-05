public class Ball {
    private String color;
    private int radius;

    public Ball(String color, int radius){
        this.color = color;
        this.radius = radius;
    }
    public Ball(String color){
        this.color = color;
        radius = 10;
    }
    public Ball(){
        color = "white";
        radius = 10;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "A "+this.color+" ball with a radius of "+this.radius;
    }
}
