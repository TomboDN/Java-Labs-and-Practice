public class BoundedWaitList<E> extends WaitList<E> {
    private final int capacity;

    /**
     * Конструктор списка с лимитом элементов
     * @param capacity лимит элементов списка
     */
    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Получение лимита списка
     * @return лимит списка
     */
    public int getCapacity() {
        return this.capacity;
    }

    /**
     * Добавить элемент в конец списка, если лимит позволяет
     * @param element добавляемый элемент
     */
    public void add(E element) {
        if (this.content.size() == this.capacity) {
            System.out.println("Нельзя добавить элемент, лимит в " + this.capacity + " элементов достигнут");
            return;
        }
        super.add(element);
    }

    /**
     * Объединение и вывод информации о списке
     * @return информация о списке и его объектах
     */
    @Override
    public String toString() {
        if (this.content.size() == 0) {
            return BoundedWaitList.class.getName() + ": []";
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
}
