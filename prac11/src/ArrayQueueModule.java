public class ArrayQueueModule {
    private static Object[] queue;
    private static int maxSize;
    private static int size;
    private static int head;
    private static int tail;

    public ArrayQueueModule(int max) {
        maxSize = max;
        queue = new Object[max];
        size = head = tail = 0;
    }

    public static void enqueue(Object element) {
        if (element != null) {
            if (size == maxSize) {
                System.out.println("Очередь заполнена");
                return;
            }
            queue[tail] = element;
            tail = (tail + 1) % queue.length;
            size++;
        }
    }
    public static Object element() {
        if (size > 0)
            return queue[head];
        else return null;
    }
    public static Object dequeue() {
        if (size != 0) {
            Object buf = element();
            queue[head] = null;
            size--;
            head = (head + 1) % queue.length;
            return buf;
        }
        else return null;
    }
    public static int size() {
        return size;
    }
    public static boolean isEmpty() {
        return size == 0;
    }
    public static void clear() {
        size = head = tail = 0;
        queue = new Object[maxSize];
    }
}
