public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(){
        this.width = 0;
        this.length = 0;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return (width*length);
    }

    @Override
    public double getPerimeter() {
        return (2*(width+length));
    }

    @Override
    public String toString() {
        return "A "+this.color+" Rectangle with length of "+this.length+" and width of "+this.width;
    }
}
