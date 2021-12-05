public class DishTest {
    public static void main(String[] args)
    {
        Cup teaCup = new Cup("Белая", "Фарфоровая", 350, "Чай");
        Plate pl = new Plate("Металлического", "Алюминий", "Глубокая");
        teaCup.displayInfo();
        pl.displayInfo();
    }
}
