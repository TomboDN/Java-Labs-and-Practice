import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        hashSet.add(43);
        hashSet.add(2534);
        hashSet.add(123);
        hashSet.add(352);
        hashSet.add(42343);
        System.out.println("HashSet -> " + hashSet);
        treeSet.addAll(hashSet);
        System.out.println("TreeSet -> " + treeSet);
        System.out.println();

        System.out.println("Задание 1");
        Map map = new Map();
        map.createMap();
        System.out.println("Одинаковых фамилий -> " + map.getSameLastNameCount());
        System.out.println("Одинаковых фамилий -> " + map.getSameFirstNameCount());

        System.out.println("Задание 3");
        HashTable table = new HashTable();
        table.test();
    }
}
