public class ArrayQueueTask2  extends  AbstractQueue{
    private Object[] queue;
    private final int maxSize;
    private int head;
    private int tail;

    public ArrayQueueTask2(int maxSize) {
        this.maxSize = maxSize;
        queue = new Object[maxSize];
        head = tail = 0;
    }

    public void enqueueRealisation(Object element) {
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
    public Object elementRealisation() {
        if (size > 0)
            return queue[head];
        else return null;
    }
    public Object dequeueRealisation() {
        if (size != 0) {
            Object buf = element();
            queue[head] = null;
            size--;
            head = (head + 1) % queue.length;
            return buf;
        }
        else return null;
    }
}
