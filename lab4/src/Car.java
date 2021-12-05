public class Car implements Nameable {
    private final String name;
    private final String brand;
    private final String color;
    private final int horsePowers;

    public String getName()
    {
        return name;
    }

    String getBrand()
    {
        return brand;
    }
    String getColor()
    {
        return color;
    }
    int getHorsePowers()
    {
        return horsePowers;
    }

    Car(String name, String brand, String color, int horsePowers)
    {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.horsePowers = horsePowers;
    }
}
