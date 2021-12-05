import java.util.ArrayList;

public class InsertionSort {
    public static void insertionSorterReverse(int[] arr){
        int n = arr.length;
        for (int i = 1;i < n; ++i){
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < key){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
        }
    }
    public static void insertionSort(ArrayList<Student> source){
        int n = source.size();
        for (int i = 1;i < n; ++i){
            Student key = source.get(i);
            int j = i - 1;
            while (j >= 0 && source.get(j).getGpa() > key.getGpa()){
                source.set(j+1, source.get(j));
                j = j - 1;
            }
            source.set(j+1, key);
        }
    }

    public static void arrayPrint(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Иванов Иван Иванович", 4.4));
        students.add(new Student("Александров Александр Александрович", 4.3));
        students.add(new Student("Самсонов Исаак Дмитриевич", 4.7));
        students.add(new Student("Белов Терентий Юлианович", 5));
        students.add(new Student("Крылов Адам Ефимович", 2.7));
        students.add(new Student("Бурова Тамара Аристарховна", 3.4));
        students.add(new Student("Евдокимова Виктория Георгиевна", 3.8));

        int[] iDNumber = new int[students.size()];
        for (int i = 0; i < students.size();i++) {
            iDNumber[i] = students.get(i).getId();
        }
        arrayPrint(iDNumber);
        insertionSorterReverse(iDNumber);
        System.out.println();
        arrayPrint(iDNumber);
        insertionSort(students);
        for (Student student : students){
            System.out.println(student.toString());
        }
    }
}
