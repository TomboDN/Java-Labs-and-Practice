public class UnfairWaitList<E> extends WaitList<E> {
    /**
     * Пустой конструктор списка
     */
    public UnfairWaitList() {}

    /**
     * Удалить элемент если он не первый в списке
     * @param element удаляемый элемент
     */
    public void remove(E element) {
        if (this.content.peek() == element) {
            System.out.println("Удаление невозможно так как удаляемый элемент первый в очереди");
            return;
        }
        this.content.remove(element);
    }

    /**
     * Переместить элемент в конец списка
     * @param element перемещаемый элемент
     */
    public void moveToBack(E element) {
        if (super.contains(element)) {
            this.content.remove(element);
            super.add(element);
        }
    }
}
