public class MovableCircleTester {
    public static void main(String[] args) {
        MovableCircle c1 = new MovableCircle(10,40, 2, 3, 15);
        System.out.println(c1);
        c1.moveLeft();
        System.out.println(c1);
    }
}
