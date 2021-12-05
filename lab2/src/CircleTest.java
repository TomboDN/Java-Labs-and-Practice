public class CircleTest {
    public static void main(String[] args)
    {
        Circle cir = new Circle(5);
        System.out.println("Радиус окружности равен: " + cir.getRadius() + " Длина окружности равна: " + cir.getLength() + " Площадь окружности равна: " + cir.getSquare());
        cir.setRadius(9.34f);
        System.out.println("Радиус окружности равен: " + cir.getRadius() + " Длина окружности равна: " + cir.getLength() + " Площадь окружности равна: " + cir.getSquare());
    }
}
