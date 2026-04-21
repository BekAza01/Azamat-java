import java.util.Arrays;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java","programming","code");

        list.stream()
                .filter(s -> s.length() > 5)
                .forEach(System.out::println);
    }
}


