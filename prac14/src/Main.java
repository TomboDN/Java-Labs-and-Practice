import java.util.ArrayList;
import java.util.Comparator;

public class Main implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getScore()- o2.getScore();
    }

    ArrayList<Student> iDNumber = new ArrayList<>();
    ArrayList<Student> iDNumber2 = new ArrayList<>();

    public void setArray(){
        Student student1 = new Student("Даниил","Анисимов","программист", 2, 24, 100);
        Student student2 = new Student("Иван","Ivanov","программист", 1, 31, 120);
        Student student3 = new Student("Александр","Александров","программист", 3, 15, 75);
        Student student4 = new Student("Терентий","Белов","программист", 4, 17, 90);
        Student student5 = new Student("Тамара","Бурова","программист", 2, 16, 50);
        Student student6 = new Student("Исаак","Самсонов","программист", 3, 10, 80);
        Student student7 = new Student("Виктория","Евдокимова","программист", 1, 10, 30);
        iDNumber.add(student1);
        iDNumber.add(student2);
        iDNumber.add(student3);
        iDNumber.add(student4);
        iDNumber.add(student5);
        iDNumber.add(student6);
        iDNumber.add(student7);
        Student student8 = new Student("Адам","Крылов","программист", 1, 2, 35);
        Student student9 = new Student("Пётр","Петров","программист", 3, 8, 110);
        iDNumber2.add(student8);
        iDNumber2.add(student9);
        iDNumber.addAll(iDNumber2);
    }
    public void quicksort(int low, int high){
        if (iDNumber.size() == 0) return;
        if (low >= high) return;
        int middle = low + (high - low) / 2;
        Student middleStudent = iDNumber.get(middle);

        int i = low, j = high;
        while (i <= j){
            while (compare(iDNumber.get(i), middleStudent) > 0){
                i++;
            }
            while (compare(iDNumber.get(j), middleStudent) < 0){
                j--;
            }
            if (i <= j){
                Student temp = iDNumber.get(i);
                iDNumber.set(i, iDNumber.get(j));
                iDNumber.set(j, temp);
                i++;
                j--;
            }
        }
        if (low < j) quicksort(low,j);
        if (high > i) quicksort(i, high);
    }
    public void outArray(){
        for (Student student : iDNumber) {
            System.out.println(student);
        }
    }

    public ArrayList<Student> getiDNumber() {
        return iDNumber;
    }

    public void linearSearchIterative(int score){
        for (Student student : iDNumber) {
            if (student.getScore() == score) {
                System.out.println("Найдено -> " + student);
                return;
            }
        }
        System.out.println("Не нашлось в списке -> " + score);
    }
    public void binarySearchIterative(int score){
        quicksort(0, iDNumber.size()-1);

        int first = 0;
        int last = iDNumber.size()-1;
        while (first <= last) {
            int middle = (first + last) / 2;
            if (iDNumber.get(middle).getScore() == score) {
                System.out.println("Найдено -> " + iDNumber.get(middle));
                return;
            }
            else if (iDNumber.get(middle).getScore() < score) {
                first = middle + 1;
            }
            else if (iDNumber.get(middle).getScore() > score) {
                last = middle - 1;
            }
        }
        System.out.println("Не нашлось в списке -> " + score);
    }
    public Student linearSearchRecursive(int i, int score){
        if (i == iDNumber.size()) return null;
        if (iDNumber.get(i).getScore() == score) {
            return iDNumber.get(i);
        }
        else return linearSearchRecursive(i+1, score);
    }

    public Student binarySearchRecursive(int first, int last, int score){
        if (last >= first) {
            int middle = (last + first) / 2;

            if (iDNumber.get(middle).getScore() == score){
                return iDNumber.get(middle);
            }
            if (iDNumber.get(middle).getScore() > score){
                return binarySearchRecursive(first, middle-1, score);
            }
            return binarySearchRecursive(middle+1, last, score);
        }
        return null;
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.setArray();
        main.outArray();
        System.out.println();
        main.linearSearchIterative(90);
        System.out.println();
        main.linearSearchIterative(91);
        System.out.println();

        main.binarySearchIterative(110);
        System.out.println();
        main.binarySearchIterative(111);
        System.out.println();

        Student student = main.linearSearchRecursive(0, 75);
        if (student != null)
            System.out.println("Найдено -> " + student);
        else System.out.println("Не найдено -> 75");
        System.out.println();

        student = main.linearSearchRecursive(0, 76);
        if (student != null)
            System.out.println("Найдено -> " + student);
        else System.out.println("Не найдено -> 76");
        System.out.println();

        student = main.binarySearchRecursive(0, main.iDNumber.size()-1, 80);
        if (student != null)
            System.out.println("Найдено -> " + student);
        else System.out.println("Не найдено -> 80");
        System.out.println();
        System.out.println("Равен ли найденый ранее студент студенту под индексом 4? -> " + student.equals(main.iDNumber.get(4)));

        System.out.println();
        student = main.binarySearchRecursive(0, main.iDNumber.size()-1, 81);
        if (student != null)
            System.out.println("Найдено -> " + student);
        else System.out.println("Не найдено -> 81");
    }
}
