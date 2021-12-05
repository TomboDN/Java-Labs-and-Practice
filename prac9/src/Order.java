import java.util.ArrayList;

public class Order {
    public static void checkout(ArrayList<Person> persons, String enteredFio, long enteredInn) {
        try {
            for (Person p : persons) {
                if (p.getFio().equals(enteredFio) && p.getInn() == enteredInn) {
                    System.out.println("Заказ для " +p.getFio() + " с ИНН: " + p.getInn() + " создан");
                    break;
                } else if (p.getFio().equals(enteredFio) && p.getInn() != enteredInn)
                    throw new WrongInnException("Введён недействительный ИНН");
            }
        } catch (WrongInnException e) {
            System.out.println("Поймана ошибка: " + e);
        }

    }
}

