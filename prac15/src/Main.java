public class Main {
    public static void main(String[] args) {
        HashTab hashtab = new HashTab();
        hashtab.init();
        System.out.println(hashtab);
        System.out.println("Hash(table) : " + hashtab.hash(false));
        System.out.println(hashtab.lookup(7, false));
        hashtab.delete(7, false);
        System.out.println(hashtab.lookup(7, false));

        System.out.println("Hash(set) : " + hashtab.hash(true));
        System.out.println(hashtab.lookup(234, true));
        hashtab.delete(234, true);
        System.out.println(hashtab.lookup(234, true));
    }
}
