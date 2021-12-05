import java.util.InputMismatchException;
import java.util.Scanner;

public class Client {
    public Chair chair;

    public void sit() {
        Scanner scanner = new Scanner(System.in);
        ChairFactory factory = new ChairFactory();
        System.out.println("На какой стул сесть?\n" +
                "1 - Викторианский стул\n" +
                "2 - Магический стул\n" +
                "3 - Функциональный стул");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                try {
                    System.out.println("Введите возраст стула:");
                    chair = factory.createVictorianChair(scanner.nextInt());
                    System.out.println(chair);
                    System.out.println("Клиент сел на стул");
                } catch (InputMismatchException e) {
                    System.out.println("Было введено не целое число");
                }
                break;
            case 2:
                chair = factory.createMagicChair();
                ((MagicChair) chair).doMagic();
                System.out.println("Клиент сел на стул");
                break;
            case 3:
                chair = factory.createFunctionalChair();
                System.out.println(((FunctionalChair) chair).sum(5, 10));
                System.out.println("Клиент сел на стул");
                break;
            default:
                System.out.println("Вы не выбрали стул");
        }
    }
    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
