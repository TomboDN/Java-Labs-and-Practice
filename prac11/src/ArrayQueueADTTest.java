public class ArrayQueueADTTest {
    public static void main(String[] args) {
        ArrayQueueADT queueADT = new ArrayQueueADT(5);
        for (int i=0; i < 5; i++) {
            ArrayQueueADT.enqueue(queueADT, i);
        }
        System.out.println("Пуста ли очередь? -> " + ArrayQueueADT.isEmpty(queueADT));
        System.out.println("Текущий размер очереди? -> " + ArrayQueueADT.size(queueADT));
        System.out.println("Элемент в начале очереди? -> " + ArrayQueueADT.element(queueADT));
        System.out.println("Элемент, который только что удалили из начала? -> " + ArrayQueueADT.dequeue(queueADT));
        System.out.println("Очистка очереди");
        ArrayQueueADT.clear(queueADT);
        System.out.println("Пуста ли очередь? -> " + ArrayQueueADT.isEmpty(queueADT));
    }
}
