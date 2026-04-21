import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task15 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        list.stream()
                .filter(x -> x > 2)
                .map(x -> x * 2)
                .forEach(System.out::println);
    }
}


