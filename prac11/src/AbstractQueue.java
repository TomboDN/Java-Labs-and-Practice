public abstract class AbstractQueue implements  Queue{
    protected int size = 0;

    protected abstract void enqueueRealisation(Object element);

    protected abstract Object elementRealisation();

    protected abstract Object dequeueRealisation();

    @Override
    public void enqueue(Object element) {
        if (element != null) {
            enqueueRealisation(element);
            size++;
        }
    }

    @Override
    public Object element() {
        if (size > 0) {
            return elementRealisation();
        } else return null;
    }

    @Override
    public Object dequeue() {
        if (size > 0) {
            --size;
            return dequeueRealisation();
        } else return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        while (!isEmpty()) {
            dequeue();
        }
    }
}
