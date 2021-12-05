import java.util.Collection;
import java.util.HashMap;

public class OrderManager {
    protected Order[] orders;
    protected  int tableCount;
    protected HashMap<String,Order> pairs = new HashMap<>();

    public OrderManager(int tableCount){
        this.tableCount = tableCount;
        orders = new Order[tableCount];
    }

    public void add(String address, Order order) {
        try {
            if (pairs.containsKey(address))
                throw new OrderAlreadyAddedException("Этот адрес уже был добавлен");
            pairs.put(address, order);
        } catch (OrderAlreadyAddedException e) {
            System.out.println(e.getMessage());
        }
    }

    public void add(Order order, int tableNumber) {
        try {
            if (tableNumber > tableCount) {
                throw new Exception("Больше нет столов");
            }
            if (orders[tableNumber] != null)
                throw new OrderAlreadyAddedException("Этот стол уже был добавлен");
            orders[tableNumber] = order;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Order getOrder(int tableNumber) {
        try {
            if (tableNumber > tableCount) {
                throw new Exception("Больше нет столов");
            }
            return orders[tableNumber];
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Order getOrder(String address) {
        return pairs.get(address);
    }

    public void addItem(String address, Item item) {
        try {
            if (!pairs.containsKey(address))
                throw new Exception("Такого адреса не существует");
            pairs.get(address).add(item);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public HashMap<String, Order> getInternetOrders() {
        return pairs;
    }

    public int getInternetCount() {
        return pairs.size();
    }

    public int getInternetDefifiniteCount(String itemName) {
        int count = 0;
        for (String key : pairs.keySet()){
            count += pairs.get(key).itemQuantity(itemName);
        }
        return count;
    }

    public void addItem(Item item, int tableNumber) {
        try {
            if (tableNumber > tableCount) {
                throw new Exception("Такого стола нет");
            }
            orders[tableNumber].add(item);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void removeOrder(int tableNumber){
        try {
            if (tableNumber > tableCount) {
                throw new Exception("Такого стола нет");
            }
            orders[tableNumber] = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void removeOrder(String address) {
        try {
            if (!pairs.containsKey(address))
                throw new Exception("Такого адреса нет");
            pairs.remove(address);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Order[] getOrders() {
        return orders;
    }

    public double ordersCostSummary() {
        double total = 0;
        for (Order order : orders) {
            if (order != null)
                total += order.getCostTotal();
        }
        Collection<Order> orders2 = pairs.values();
        for (var order : orders2){
            total += order.getCostTotal();
        }
        return total;
    }
}
