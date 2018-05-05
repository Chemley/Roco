import java.util.LinkedList;

public class Cashier {

    private LinkedList<Order> orders = new LinkedList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public int getOrderSize() {
        return this.orders.size();
    }

    public Order getOrder(int index) {
        return this.orders.get(index);
    }

}
