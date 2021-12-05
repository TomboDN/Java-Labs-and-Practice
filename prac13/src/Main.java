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

    public static void main(String[] args) {
        Main main = new Main();
        main.setArray();
        System.out.println("До сортировки");
        main.outArray();
        main.quicksort(0, main.getiDNumber().size()-1);
        System.out.println("После сортировки");
        main.outArray();
    }
}
