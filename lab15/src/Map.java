import java.util.*;

public class Map {
    ArrayList<String> surnames = new ArrayList<>();
    ArrayList<String> names = new ArrayList<>();

    public void createMap(){
        surnames.add("Иванов");
        names.add("Иван");

        surnames.add("Самсонов");
        names.add("Исаак");

        surnames.add("Белов");
        names.add("Терентий");

        surnames.add("Крылов");
        names.add("Терентий");

        surnames.add("Бурова");
        names.add("Тамара");

        surnames.add("Бурова");
        names.add("Виктория");

        surnames.add("Иванов");
        names.add("Олег");
    }
    public int getSameFirstNameCount(){
        int count = 0;
        ArrayList<String> names1 = new ArrayList<>();
        Set<String> set = new HashSet<>(names);
        int buf1 = names.size();
        names1.addAll(set);
        int buf2 = names1.size();
        for (String s : names1) {
            if (Collections.frequency(names, s) > 1)
                count++;
        }
        return count;
    }
    public int getSameLastNameCount(){
        int count = 0;
        ArrayList<String> surnames1 = new ArrayList<>();
        Set<String> set = new HashSet<>(surnames);
        int buf1 = surnames.size();
        surnames1.addAll(set);
        int buf2 = surnames1.size();
        for (String s : surnames1) {
            if (Collections.frequency(surnames, s) > 1)
                count++;
        }
        return count;
    }
}
