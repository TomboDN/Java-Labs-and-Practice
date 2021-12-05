import java.util.Arrays;
import java.util.Comparator;

public class InternetOrder implements Order{
    protected Customer customer;
    protected int size = 0;
    protected NodeList head = null;
    protected NodeList tail = null;

    private static class NodeList {
        NodeList previous;
        NodeList next;
        Item value;

        NodeList(NodeList previous, NodeList next, Item value){
            this.previous = previous;
            this.next = next;
            this.value = value;
        }
        NodeList(){
            previous = null;
            next = null;
            value = null;
        }
    }

    public InternetOrder() {
    }
    public InternetOrder(Item[] items){
        for (Item it : items){
            this.add(it);
        }
    }

    @Override
    public boolean add(Item item) {
        if (head == null) {
            head = tail = new NodeList(null, null, item);
        } else {
            tail.next = new NodeList (tail, null, item);
            tail = tail.next;
        }
        size += 1;
        return true;
    }

    @Override
    public String[] itemsNames() {
        return Arrays.stream(getItems()).map(Item::getName).distinct().toArray(String[]::new);
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemQuantity(String itemName) {
        NodeList current = head;
        int quantity = 0;
        while (current != null) {
            if (current.value.getName().equals(itemName)) {
                quantity += 1;
            }
            current = current.next;
        }
        return quantity;
    }

    @Override
    public Item[] getItems() {
        Item[] items = new Item[size];
        NodeList current = head;
        for (int i = 0; i < size; i++) {
            items[i] = current.value;
            current = current.next;
        }
        return items;
    }

    @Override
    public boolean remove(String itemName) {
        NodeList current = head;
        while (current != null) {
            if (current.value.getName().equals(itemName)) {
                if (current.previous == null) {
                    head = current.next;
                } else {
                    current.previous = current.next;
                }
                size -= 1;
                return true;
            }
            current = current.next;
        }
        return false;
    }
    @Override
    public int removeAll(String itemName) {
        NodeList current = head;
        int count = 0;
        while (current != null) {
            if (current.value.getName().equals(itemName)) {
                if (current.previous == null) {
                    head = current.next;
                } else {
                    current.previous = current.next;
                }
                count += 1;
            }
            current = current.next;
        }
        size -= count;
        return count;
    }

    @Override
    public Item[] sortedItemsByCostDesc() {
        return Arrays.stream(getItems())
                .sorted(Comparator.comparingDouble(Item::getCost))
                .toArray(Item[]::new);
    }

    @Override
    public double getCostTotal() {
        NodeList current = head;
        int total = 0;
        while (current != null) {
            total += current.value.getCost();
            current = current.next;
        }
        return total;
    }

    @Override
    public String toString() {
        return "InternetOrder{" +
                Arrays.toString(getItems()) +
                '}';
    }

    @Override
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
