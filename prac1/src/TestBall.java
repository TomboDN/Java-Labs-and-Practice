public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("red", 15);
        Ball b2 = new Ball("black");
        Ball b3 = new Ball();
        b2.setRadius(5);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
