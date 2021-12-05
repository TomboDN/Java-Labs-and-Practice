public class ArrayQueueModuleTest {
    public static void main(String[] args) {
        ArrayQueueModule arrayQueueModule = new ArrayQueueModule(5);
        for (int i=0; i < 5; i++) {
            ArrayQueueModule.enqueue(i);
        }
        System.out.println("Пуста ли очередь? -> " + ArrayQueueModule.isEmpty());
        System.out.println("Текущий размер очереди? -> " + ArrayQueueModule.size());
        System.out.println("Элемент в начале очереди? -> " + ArrayQueueModule.element());
        System.out.println("Элемент, который только что удалили из начала? -> " + ArrayQueueModule.dequeue());
        System.out.println("Очистка очереди");
        ArrayQueueModule.clear();
        System.out.println("Пуста ли очередь? -> " + ArrayQueueModule.isEmpty());
    }
}
