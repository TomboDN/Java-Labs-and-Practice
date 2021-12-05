import java.util.HashSet;
import java.util.Hashtable;

public class HashTab {
    Hashtable<Integer, Integer> table = new Hashtable<>();
    HashSet<Integer> set = new HashSet<>();

    public int hash(boolean choice){
        if (choice) return set.hashCode();
        else return table.hashCode();
    }
    public void add(int key, int value) {
        table.put(key, value);
    }
    public void add(int value){
        set.add(value);
    }
    public void init(){
        add(1, 123);
        add(2, 234);
        add(3, 345);
        add(4, 456);
        add(5, 567);
        add(6, 678);
        add(7, 789);
        add(8, 890);
        add(9, 910);
        add(10, 102);
        add(123);
        add(234);
        add(345);
        add(456);
        add(567);
        add(678);
        add(789);
        add(890);
        add(910);
        add(102);
    }
    public int lookup(int key, boolean choice){
        if (!choice){
            if (table.get(key) != null) return table.get(key);
        } else {
            if (set.contains(key)) return key;
        }
        System.out.println("Не нашлось");
        return -1;
    }
    public void delete(int key, boolean choice){
        if (!choice) table.remove(key);
        else set.remove(key);
    }

    @Override
    public String toString() {
        return "HashTab{" +
                "table=" + table +
                ",\nset=" + set +
                '}';
    }
}
