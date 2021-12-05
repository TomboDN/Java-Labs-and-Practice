public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("J.K. Rowling", "Fantasy", "Harry Potter");
        Book b2 = new Book("Leo Tolstoy", "War and Peace");
        Book b3 = new Book("Java Core");
        Book b4 = new Book();
        b3.setAuthor("Kay Horstmann");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}
