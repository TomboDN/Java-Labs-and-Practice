import java.util.ArrayList;
import java.util.Comparator;

public class SortingStudentsByGPA {

    private static void swap(ArrayList<Comparable> source, int first, int second){
        Comparable temp = source.get(first);
        source.set(first, source.get(second));
        source.set(second, temp);
    }

    public static void quickSort(ArrayList<Comparable> source, Comparator comp){
        quickSort(source, comp, 0, source.size()-1);
    }

    public static void quickSort(ArrayList<Comparable> source, Comparator comp, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Comparable pivot = source.get((leftMarker + rightMarker) / 2);
        do {
            // Двигаем левый маркер слева направо пока элемент меньше, чем pivot
            while (comp.compare(source.get(leftMarker), pivot) > 0) {
                leftMarker++;
            }
            // Двигаем правый маркер, пока элемент больше, чем pivot
            while (comp.compare(source.get(rightMarker), pivot) < 0) {
                rightMarker--;
            }
            // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
            if (leftMarker <= rightMarker) {
                // Левый маркер будет меньше правого только если мы должны выполнить swap
                if (leftMarker < rightMarker) {
                    swap(source, leftMarker, rightMarker);
                }
                // Сдвигаем маркеры, чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        // Выполняем рекурсивно для частей
        if (leftMarker < rightBorder) {
            quickSort(source, comp, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(source, comp, leftBorder, rightMarker);
        }
    }


    static class GPAComparator implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            double result = o1.getGpa() - o2.getGpa();
            if (result != 0) {
                return (int) (result / Math.abs(result));
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        Comparator comp = new GPAComparator();
        ArrayList<Comparable> students = new ArrayList<Comparable>();
        students.add(new Student("Иванов Иван Иванович", 4.4));
        students.add(new Student("Александров Александр Александрович", 4.3));
        students.add(new Student("Самсонов Исаак Дмитриевич", 4.7));
        students.add(new Student("Белов Терентий Юлианович", 5));
        students.add(new Student("Крылов Адам Ефимович", 2.7));
        students.add(new Student("Бурова Тамара Аристарховна", 3.4));
        students.add(new Student("Евдокимова Виктория Георгиевна", 3.8));
        quickSort(students, comp);
        for (Comparable student : students) {
            System.out.println(student.toString());
        }
    }
}
