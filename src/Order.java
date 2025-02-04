import static java.util.Arrays.compare;

public class Order implements Comparable<Order>{
    private String product;
    private double cost;

    public Order(String product, double cost) {
        this.product = product;
        this.cost = cost;
    }

    public String getProduct() {
        return product;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Order{" +
                "product='" + product + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public int compareTo(Order o) {
        return  -1*(int) (this.cost - o.cost);
    }
}
