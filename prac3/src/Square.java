public class Square extends Shape{
    protected double side;

    public Square(){
        this.side = 0;
    }

    public Square(double side){
        this.side = side;
    }

    public Square(double side, String color, boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (side*side);
    }

    @Override
    public double getPerimeter() {
        return (4*side);
    }

    @Override
    public String toString() {
        return "A "+this.color+" square with a side of "+this.side;
    }
}
