import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> content;

    /**
     * Конструктор с пустым списком
     */
    public WaitList() {
        this.content = new ConcurrentLinkedQueue<E>();
    }

    /**
     * Конструктор со списком из переданной коллекции
     * @param c Коллекция, из которой создаётся список
     */
    public WaitList(Collection<E> c) {
        this.content = new ConcurrentLinkedQueue<E>(c);
    }

    /**
     * Объединение и вывод информации о списке
     * @return информация о списке и его объектах
     */
    @Override
    public String toString() {
        if (this.content.size() == 0) {
            return WaitList.class.getName() + ": []";
        }
        var queue = this.content.toArray();
        StringBuilder str = new StringBuilder(WaitList.class.getName() + ": [");

        str.append(queue[0].toString());
        for (int i = 1; i < queue.length; i++) {
            str.append(", ").append(queue[i].toString());
        }
        str.append("]");

        return str.toString();
    }

    /**
     * Добавление элемента в конец списка
     * @param element добавляемый элемент
     */
    @Override
    public void add(E element) {
        this.content.add(element);
    }

    /**
     * Удаление элемента из начала списка
     * @return первый элемент списка
     */
    @Override
    public E remove() {
        return this.content.poll();
    }

    /**
     * Содержит ли список элемент
     * @param element искомый элемент
     * @return Найдено/Не найдено
     */
    @Override
    public boolean contains(E element) {
        return this.content.contains(element);
    }

    /**
     * Содержит ли список все элементы из полученной коллекции
     * @param c Коллекция, элементы которой искать
     * @return Найдены/Не найдены
     */
    @Override
    public boolean containsAll(Collection<E> c) {
        return this.content.containsAll(c);
    }

    /**
     * Пуст ли список?
     * @return Пуст/Нет
     */
    @Override
    public boolean isEmpty() {
        return this.content.isEmpty();
    }
}
