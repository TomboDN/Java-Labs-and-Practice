public class ArrayQueueTest {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(5);
        for (int i=0; i < 5; i++) {
            arrayQueue.enqueue(i);
        }
        System.out.println("Пуста ли очередь? -> " + arrayQueue.isEmpty());
        System.out.println("Текущий размер очереди? -> " + arrayQueue.size());
        System.out.println("Элемент в начале очереди? -> " + arrayQueue.element());
        System.out.println("Элемент, который только что удалили из начала? -> " + arrayQueue.dequeue());
        System.out.println("Очистка очереди");
        arrayQueue.clear();
        System.out.println("Пуста ли очередь? -> " + arrayQueue.isEmpty());
    }
}
