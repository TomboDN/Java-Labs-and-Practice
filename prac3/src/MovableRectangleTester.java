public class MovableRectangleTester {
    public static void main(String[] args) {
        MovableRectangle r1 = new MovableRectangle(30, 30, 50, 0, 10, 5);
        System.out.println(r1);
        r1.moveLeft();
        System.out.println(r1);
    }
}
