import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);
        list.stream()
                .map(x -> x * x)
                .forEach(System.out::println);
    }
}
