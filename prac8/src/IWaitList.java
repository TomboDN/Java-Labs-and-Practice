import java.util.Collection;

public interface IWaitList<E> {
    /**
     * Добавление элемента в конец списка
     * @param element добавляемый элемент
     */
    void add (E element);

    /**
     * Удаление элемента из начала списка
     * @return первый элемент списка
     */
    E remove();

    /**
     * Содержит ли список элемент
     * @param element искомый элемент
     * @return Найдено/Не найдено
     */
    boolean contains (E element);

    /**
     * Содержит ли список все элементы из полученной коллекции
     * @param c Коллекция, элементы которой искать
     * @return Найдены/Не найдены
     */
    boolean containsAll (Collection<E> c);

    /**
     * Пуст ли список?
     * @return Пуст/Нет
     */
    boolean isEmpty();
}
