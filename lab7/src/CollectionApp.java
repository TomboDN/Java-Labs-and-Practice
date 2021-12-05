import java.util.ArrayList;
import java.util.Comparator;

public class CollectionApp {
    public static void main(String[] args) {
        ArrayList<String> statesPrev = new ArrayList<String>();
        statesPrev.add("Италия");
        statesPrev.add("Япония");
        ArrayList<String> states = new ArrayList<String>();
        states.add("Германия");
        states.addAll(statesPrev);
        states.add("Франция");
        states.add("Великобритания");
        states.add("Испания");
        System.out.println("Sub лист " + states.subList(1,4));
        states.add(1, "Италия");
        System.out.println(states.get(1));
        states.set(1, "Дания");
        System.out.printf("В списке %d элементов \n", states.size());
        for(String state : states){
            System.out.println(state);
        }
        states.sort(Comparator.reverseOrder());
        System.out.println("Отсортированный в другом порядке: " + states);
        if(states.contains("Германия")){
            System.out.println("Список содержит государство Германия");
        }

        states.remove("Германия");
        states.remove(0);
        Object[] countries = states.toArray();
        for(Object country : countries){
            System.out.println(country);
        }
    }
}