import java.util.Objects;

public final class Dish implements Item {
    private final double cost;
    private final String name;
    private final String description;

    public Dish(String drinkName, String description) throws IllegalArgumentException{
        if (Objects.equals(drinkName, ""))
            throw new IllegalArgumentException("Название не может быть пустым");
        if (Objects.equals(description, ""))
            throw new IllegalArgumentException("Описание не может быть пустым");

        this.cost = 0;
        this.name = drinkName;
        this.description = description;
    }

    public Dish(double cost, String drinkName, String description) throws IllegalArgumentException {
        if (cost < 0)
            throw new IllegalArgumentException("Цена не может быть отрицательной");
        if (Objects.equals(drinkName, ""))
            throw new IllegalArgumentException("Название не может быть пустым");
        if (Objects.equals(description, ""))
            throw new IllegalArgumentException("Описание не может быть пустым");
        this.cost = cost;
        this.name = drinkName;
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
