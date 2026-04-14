import java.util.Arrays;
import java.util.List;

public class Task19 {
    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3,4)
        );

        list.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}
