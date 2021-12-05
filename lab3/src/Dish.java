public abstract class Dish {
    final private String color;
    final private String material;

    public String getColor() {return color;}
    public String getMaterial() {return material;}

    public Dish(String color, String material)
    {
        this.color = color;
        this.material = material;
    }

    public abstract void displayInfo();
}

class Plate extends Dish
{
    final private String type;

    public Plate(String color, String material, String type)
    {
        super(color, material);
        this.type = type;
    }

    public void displayInfo()
    {
        System.out.println("Тарелка: " + "Цвет: " + getColor() + " Материал: " + getMaterial() + " Тип : " + type);
    }
}

class Cup extends Dish
{
    final private int volume;
    final private String fluid;

    public Cup(String color, String material, int volume, String fluid)
    {
        super(color, material);
        this.volume = volume;
        this.fluid = fluid;
    }

    public void displayInfo()
    {
        System.out.println("Кружка: " + "Цвет: " + getColor() + " Материал: " + getMaterial() + " Объем в мл.: " + volume + " Жидкость: " + fluid);
    }
}