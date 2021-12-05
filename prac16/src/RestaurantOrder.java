import java.util.ArrayList;
import java.util.Arrays;

public class RestaurantOrder implements Order {
    protected int size;
    protected Item[] items;

    public RestaurantOrder(){
        size = 0;
    }

    public RestaurantOrder(Item[] items){
        this.items = items;
        size = items.length;
    }

    @Override
    public boolean add(Item item) {
        size+=1;
        Item[] buf = new Item[size];
        if (size > 1)
            System.arraycopy(items, 0, buf, 0, items.length);
        buf[size-1] = item;
        items = buf;
        return true;
    }

    @Override
    public String[] itemsNames() {
        ArrayList<String> names = new ArrayList<>();

        for (Item item : items) {
            if (!names.contains(item.getName()))
                names.add(item.getName());
        }
        String[] result = new String[names.size()];

        for (int i = 0; i < names.size(); i++){
            result[i] = names.get(i);
        }
        return result;
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemQuantity(String itemName) {
        int count = 0;
        for (int i = 0; i < size; i++){
            if (items[i].getName() == itemName)
                count++;
        }
        return count;
    }

    @Override
    public Item[] getItems() {
        return items;
    }

    @Override
    public boolean remove(String itemName) {
        boolean wasRemoved = false;
        for (int i = size; i > 0;i--){
            if (items[i].getName() == itemName){
                items[i] = null;
                size--;
                wasRemoved = true;
                break;
            }
        }
        if (wasRemoved){
            Item[] buf = new Item[size];
            int count = 0;
            for (Item item : items) {
                if (item != null) {
                    buf[count] = item;
                    count++;
                }
            }
            items = buf;
        }
        return wasRemoved;
    }

    @Override
    public int removeAll(String itemName) {
        boolean notAllDeleted = true;
        int count = 0;
        while (notAllDeleted){
            notAllDeleted = remove(itemName);
            count++;
        }
        return count;

    }

    @Override
    public Item[] sortedItemsByCostDesc() {
        Item[] sorted = items;
        for (int i = 0; i < size - 2;i++){
            for (int j = 0; j < size - 2;j++){
                if (sorted[j].getCost() > sorted[j+1].getCost())
                {
                    Item buf = sorted[j];
                    sorted[j] = sorted[j+1];
                    sorted[j+1] = buf;
                }
            }
        }
        return sorted;
    }

    @Override
    public double getCostTotal() {
        double total = 0;
        for (Item item : items){
            total += item.getCost();
        }
        return total;
    }

    @Override
    public String toString() {
        return "RestaurantOrder{" +
                "items=" + Arrays.toString(items) +
                '}';
    }
}
