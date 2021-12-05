public class ComplexTest {
    public static void main(String[] args) {
        Complex comp = new Complex(4, 3);
        System.out.println(comp);
        System.out.println();

        ConcreteFactory factory = new ConcreteFactory();

        System.out.println(factory.createComplex());
        System.out.println();

        System.out.println(factory.createComplex(2, 6));
    }
}
