import java.util.Comparator;
import java.util.LinkedHashMap;
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

        LinkedHashMap<String,Double> map1 =  orders.stream()
                .collect(Collectors.groupingBy(Order::getProduct,Collectors.summingDouble(Order::getCost)))
                .entrySet().stream().sorted((el1,el2) -> (-1)*el1.getValue().compareTo(el2.getValue())).limit(3)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(oldVal,newVal) -> oldVal,LinkedHashMap::new));
        System.out.println(map1);
    }
}