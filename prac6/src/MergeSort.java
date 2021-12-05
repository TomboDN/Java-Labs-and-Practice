import java.util.ArrayList;
import java.util.Comparator;

public class MergeSort {
    public static void mergeTwo(ArrayList<Comparable> one, ArrayList<Comparable> two, Comparator<Comparable> comp){
        one.addAll(two);
        mergeSort(one, comp);
    }
    public static void mergeSort(ArrayList<Comparable> source, Comparator<Comparable> comp){
        if (source.size() < 2)
            return;
        int mid = source.size() / 2;
        ArrayList<Comparable> l = new ArrayList<Comparable>();
        for (int i = 0; i < mid; ++i)
            l.add(source.get(i));
        ArrayList<Comparable> r = new ArrayList<Comparable>();
        for (int i = mid; i < source.size();++i)
            r.add((source.get(i)));
        mergeSort(l, comp);
        mergeSort(r, comp);

        merge(source, l, r, mid, source.size()-mid, comp);
    }
    public static void merge(ArrayList<Comparable> source, ArrayList<Comparable> l, ArrayList<Comparable> r, int left, int right, Comparator<Comparable> comp){
        int i = 0, j = 0, k = 0;
        while (i < left && j < right){
            if (comp.compare(l.get(i), r.get(j)) <= 0){
                source.set(k++, l.get(i++));
            }
            else {
                source.set(k++, r.get(j++));
            }
        }
        while (i < left){
            source.set(k++, l.get(i++));
        }
        while (j < right){
            source.set(k++, r.get(j++));
        }
    }
    static class IDComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            int result = o1.getId() - o2.getId();
            if (result != 0) {
                return (result / Math.abs(result));
            }
            return 0;

        }
    }

    public static void main(String[] args) {
        Comparator comp = new IDComparator();
        ArrayList<Comparable> students = new ArrayList<Comparable>();
        ArrayList<Comparable> students2 = new ArrayList<Comparable>();
        students.add(new Student("Иванов Иван Иванович", 4.4));
        students2.add(new Student("Александров Александр Александрович", 4.3));
        students2.add(new Student("Самсонов Исаак Дмитриевич", 4.7));
        students.add(new Student("Белов Терентий Юлианович", 5));
        students.add(new Student("Крылов Адам Ефимович", 2.7));
        students.add(new Student("Бурова Тамара Аристарховна", 3.4));
        students2.add(new Student("Евдокимова Виктория Георгиевна", 3.8));
        students2.add(new Student("Петров Пётр Петрович", 4));
        mergeTwo(students, students2, comp);
        for (Comparable student : students) {
            System.out.println(student.toString());
        }
    }
}
