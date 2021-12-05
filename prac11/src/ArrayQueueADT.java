public class ArrayQueueADT {
    private Object[] elements;
    private final int maxSize;
    private int size;
    private int head;
    private int tail;

    public ArrayQueueADT(int maxSize) {
        this.maxSize = maxSize;
        this.elements = new Object[maxSize];
        this.size = this.head = this.tail = 0;
    }

    public static void enqueue(ArrayQueueADT queue, Object element) {
        if (element != null) {
            if (queue.size == queue.maxSize) {
                System.out.println("Очередь заполнена");
                return;
            }
            queue.elements[queue.tail] = element;
            queue.tail = (queue.tail + 1) % queue.elements.length;
            queue.size++;
        }
    }
    public static Object element(ArrayQueueADT queue) {
        if (queue.size > 0)
            return queue.elements[queue.head];
        else return null;
    }
    public static Object dequeue(ArrayQueueADT queue) {
        if (queue.size != 0) {
            Object buf = element(queue);
            queue.elements[queue.head] = null;
            queue.size--;
            queue.head = (queue.head + 1) % queue.elements.length;
            return buf;
        }
        else return null;
    }
    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }
    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }
    public static void clear(ArrayQueueADT queue) {
        queue.size = queue.head = queue.tail = 0;
        queue.elements = new Object[queue.maxSize];
    }
}
