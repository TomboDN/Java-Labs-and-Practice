import java.util.Hashtable;

public class HashTable {
    Hashtable<Double, Double> hashTable = new Hashtable<>();

    public void test(){
        hashTable.put(2132.231D, 321321.23232D);
        hashTable.put(546.0574385473D, 432.23123124D);
        hashTable.put(43234.432423D, 131112.22222D);
        System.out.println(hashTable);
        System.out.println();
        System.out.println("Содержит ли таблица ключ 546.0574385473? -> " + hashTable.containsKey(546.0574385473D));
        System.out.println("Содержит ли таблица значение 321321.23232? -> " + hashTable.contains(321321.23232D));
        System.out.println("Содержит ли таблица ключ 555.2? -> " + hashTable.containsKey(555.2D));
        System.out.println("Содержит ли таблица значение 555.2? -> " + hashTable.contains(555.2D));
        System.out.println("Получить пару по ключу 546.0574385473 -> "+ hashTable.get(546.0574385473D));
        System.out.println("Получить пару по ключу 555.2 -> "+ hashTable.get(555.2D));
    }
}
