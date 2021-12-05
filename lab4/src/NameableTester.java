public class NameableTester {
    public static void main(String[] args)
    {
        Nameable thing = new Car("Model-X","Tesla","Silver", 140);
        System.out.println(thing.getName());
        thing = new Animal("Bamboo","Panda",8);
        System.out.println(thing.getName());
    }
}
