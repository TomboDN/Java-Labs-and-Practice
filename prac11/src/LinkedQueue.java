public class LinkedQueue extends AbstractQueue {
    private static class Node {
        Object value;
        Node previous;
        Node next;

        Node(Object element, Node previous, Node next) {
            value = element;
            this.previous = previous;
            this.next = next;
        }
    }
    private Node tail;
    private Node head;

    @Override
    public void enqueueRealisation(Object element) {
        tail = new Node(element, null, tail);
        if (head == null)
            head = tail;
        else
            tail.next.previous = tail;
    }

    @Override
    public Object elementRealisation() {
        return head.value;
    }

    @Override
    public Object dequeueRealisation() {
        if (head.previous != null) {
            head.previous.next = null;
        }
        Object buf = head.value;
        head = head.previous;
        return buf;
    }
}
