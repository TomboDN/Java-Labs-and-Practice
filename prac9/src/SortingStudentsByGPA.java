import java.util.ArrayList;
import java.util.Comparator;

public class SortingStudentsByGPA {

    private static void swap(ArrayList<Student> source, int first, int second){
        Student temp = source.get(first);
        source.set(first, source.get(second));
        source.set(second, temp);
    }

    public static void quickSort(ArrayList<Student> source, Comparator comp){
        quickSort(source, comp, 0, source.size()-1);
    }

    public static void quickSort(ArrayList<Student> source, Comparator comp, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Student pivot = source.get((leftMarker + rightMarker) / 2);
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
}
