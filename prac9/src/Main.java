import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Покупка онлайн
        System.out.println("Покупка онлайн");
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Александров Александр Александрович", 354354354352L ));
        persons.add(new Person("Иванов Иван Иванович", 123456789876L ));
        persons.add(new Person("Петров Петр Петрович", 643438948933L ));
        persons.add(new Person("Белов Терентий Юлианович", 340348939291L ));
        Order.checkout(persons, "Иванов Иван Иванович", 643438948933L);
        Order.checkout(persons, "Иванов Иван Иванович", 123456789876L);
        System.out.println();

        // Сортировка и поиск студентов
        System.out.println("Сортировка и поиск студентов");
        Comparator comp = new SortingStudentsByGPA.GPAComparator();
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Иванов Иван Иванович", 4.4));
        students.add(new Student("Александров Александр Александрович", 4.3));
        students.add(new Student("Самсонов Исаак Дмитриевич", 4.7));
        students.add(new Student("Белов Терентий Юлианович", 5));
        students.add(new Student("Крылов Адам Ефимович", 2.7));
        students.add(new Student("Бурова Тамара Аристарховна", 3.4));
        students.add(new Student("Евдокимова Виктория Георгиевна", 3.8));
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        int choice = -1;
        String fioToSearch = "";
        while (choice != 0)
        {
            System.out.println("Что необходимо?\n1 - поиск по ФИО\n2 - сортировка по оценкам\n0 - завершение работы");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    fioToSearch = scanner2.nextLine();
                    try {
                        if (fioToSearch.equals(""))
                            throw new EmptyStringException("Введена пустая строка");
                        for (int i = 0; i < students.size(); i++) {
                            if (students.get(i).getName().equals(fioToSearch)) {
                                System.out.println("Нашёлся студент: " + students.get(i));
                                break;
                            }
                            try {
                                if (i == students.size() - 1) {
                                    throw new StudentNotFoundException("Студент не найден");
                                }
                            } catch (StudentNotFoundException e2) {
                                System.out.println("Поймана ошибка: " + e2 + "\n");
                            }
                        }
                    } catch (EmptyStringException e1) {
                        System.out.println("Поймана ошибка: " + e1 + "\n");
                    }
                    break;
                case 2:
                    SortingStudentsByGPA.quickSort(students, comp);
                    for (Student student : students) {
                        System.out.println(student.toString());
                    }
                    break;
                case 0:
                    break;
            }
        }
    }
}
