public class LinkedQueueTest {
    public static void main(String[] args) {
        LinkedQueue linkedQueue = new LinkedQueue();
        for (int i=0; i < 5; i++) {
            linkedQueue.enqueue(i);
        }
        System.out.println("Пуста ли очередь? -> " + linkedQueue.isEmpty());
        System.out.println("Текущий размер очереди? -> " + linkedQueue.size());
        System.out.println("Элемент в начале очереди? -> " + linkedQueue.element());
        System.out.println("Элемент, который только что удалили из начала? -> " + linkedQueue.dequeue());
        System.out.println("Очистка очереди");
        linkedQueue.clear();
        System.out.println("Пуста ли очередь? -> " + linkedQueue.isEmpty());
    }
}
