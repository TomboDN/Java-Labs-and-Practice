public class Circle {
    private float radius;

    public Circle(float radius)
    {
        this.radius = radius;
    }

    public float getRadius()
    {
        return radius;
    }

    public void setRadius(float r)
    {
        radius = r;
    }

    public double getLength()
    {
        return (Math.PI * (2 * radius));
    }

    public double getSquare()
    {
        return (Math.PI * Math.pow(radius, 2));
    }
}