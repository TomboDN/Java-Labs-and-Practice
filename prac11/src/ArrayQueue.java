public class ArrayQueue {
    private Object[] queue;
    private final int maxSize;
    private int size;
    private int head;
    private int tail;

    // Пред: maxSize > 0
    // Инв: maxSize <= 0

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        queue = new Object[maxSize];
        size = head = tail = 0;
    }
    // Пред: элемент не null
    // Пред: элемент неизменяемый
    // Пост: предпоследний объект в очереди = элемент
    // Пост: текущий размер очереди на 1 больше

    public void enqueue(Object element) {
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
    // Пред: текущий размер очереди больше 0
    // Пост: вывод объекта начала очереди
    public Object element() {
        if (size > 0)
            return queue[head];
        else return null;
    }
    // Пред: текущий размер очереди больше 0
    // Пост: вывод объекта начала очереди
    // Пост: текущий размер очереди на 1 меньше
    public Object dequeue() {
        if (size != 0) {
            Object buf = element();
            queue[head] = null;
            size--;
            head = (head + 1) % queue.length;
            return buf;
        }
        else return null;
    }
    // Пост: вывод текущего размера очереди
    public int size() {
        return size;
    }
    // Пост: вывод, пуста ли очередь
    public boolean isEmpty() {
        return size == 0;
    }
    // Инв: текущий размер очереди = 0
    // Пост: очистка очереди
    public void clear() {
        size = head = tail = 0;
        queue = new Object[maxSize];
    }
}
