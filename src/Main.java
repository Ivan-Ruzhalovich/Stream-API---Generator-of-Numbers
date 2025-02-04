import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order("Laptop", 1200.0),
                new Order("Smartphone", 800.0),
                new Order("Laptop", 1500.0),
                new Order("Tablet", 500.0),
                new Order("Smartphone", 900.0)
        );

        orders.stream().collect(Collectors.groupingBy(Order::getProduct))
                .forEach((s,l) -> l.stream().sorted().limit(3)
                        .collect(Collectors.toList()));


        List<Order> list = orders.stream().sorted().limit(3).collect(Collectors.toList());
        System.out.println(list);
//                .forEach((s,l) -> l.stream().map(e -> e.getCost()).reduce(0, Integer::sum));
        System.out.println(map);
    }
}