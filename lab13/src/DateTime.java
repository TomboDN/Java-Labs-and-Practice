import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class DateTime {
    public static class Student{
        private final int day;
        private final int month;
        private final int year;

        Student (int day, int month, int year){
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public void shortDate(){
            System.out.println(day + "/" + month + "/" + year % 100 / 10 + year % 10);
        }

        public void midDate(){
            System.out.println(day + "/" + month + "/" + year);
        }

        public void longDate(){
            String monthString = "";
            switch (month){
                case 1 -> monthString = "января";
                case 2 -> monthString = "февраля";
                case 3 -> monthString = "марта";
                case 4 -> monthString = "апреля";
                case 5 -> monthString = "мая";
                case 6 -> monthString = "июня";
                case 7 -> monthString = "июля";
                case 8 -> monthString = "августа";
                case 9 -> monthString = "сентября";
                case 10 -> monthString = "октября";
                case 11 -> monthString = "ноября";
                case 12 -> monthString = "декабря";
                default -> monthString = "";
            }
            System.out.println(day + " " + monthString + " " + year + " года");
        }
    }
    public void firstTask() {
        Date date = new Date();
        System.out.println("" +
                "Анисимов Даниил " +
                "Получил задание : " +
                "Fri Oct 1 00:00:00 MSK 2021 " +
                "Сдал задание : " +
                ""+ date);
    }
    public void secondTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день");
        String day = scanner.nextLine();

        System.out.println("Введите месяц");
        String month = scanner.nextLine();

        System.out.println("Введите год");
        String year = scanner.nextLine();

        System.out.println("Введите час");
        String hour = scanner.nextLine();

        System.out.println("Введите минуту");
        String minute = scanner.nextLine();

        LocalTime nowTime = LocalTime.now().truncatedTo(ChronoUnit.MINUTES);
        LocalDate nowDate = LocalDate.now();

        LocalTime localTime = LocalTime.parse(hour + ":" +minute);
        LocalDate localDate = LocalDate.parse(year + "-" + month + "-" + day);

        if (nowDate.isAfter(localDate)){
            System.out.println("Позже");
        }else if (nowDate.isBefore(localDate)){
            System.out.println("Раньше");
        }else {
            if (nowTime.isAfter(localTime)) {
                System.out.println("Позже");
            }else if (nowTime.isBefore(localTime)) {
                System.out.println("Раньше");
            }else {
                System.out.println("Одинаковое время");
            }
        }
        System.out.println("Сейчас: " + nowTime.atDate(nowDate));
        System.out.println("Ваш вариант: " + localTime.atDate(localDate));
    }
    public void thirdTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день");
        int day = scanner.nextInt();

        System.out.println("Введите месяц");
        int month = scanner.nextInt();

        System.out.println("Введите год");
        int year = scanner.nextInt();

        Student student = new Student(day, month, year);
        student.shortDate();
        student.midDate();
        student.longDate();
    }
    public void fourthTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату (ГГГГ-ММ-ДД)");
        String date = scanner.nextLine();

        System.out.println("Введите время (ЧЧ:ММ)");
        String time = scanner.nextLine();

        LocalDate localDate = LocalDate.parse(date);
        LocalTime localTime = LocalTime.parse(time);

        System.out.println(localTime.atDate(localDate));
    }
    public void fifthTask(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        long startTime = System.currentTimeMillis();
        long elapsedTime = 0L;
        for (int i = 0; i<100000;i++){
            arrayList.add(i);
        }
        arrayList.remove(7);
        arrayList.contains(1337);
        elapsedTime = (new Date()).getTime() - startTime;

        System.out.println("ArrayList -> " + elapsedTime);

        startTime = System.currentTimeMillis();
        elapsedTime = 0L;
        for (int i = 0; i<100000;i++){
            linkedList.add(i);
        }
        linkedList.remove(7);
        linkedList.contains(1337);
        elapsedTime = (new Date().getTime() - startTime);

        System.out.println("LinkedList -> " + elapsedTime);
    }
}
