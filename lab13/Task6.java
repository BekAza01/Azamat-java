import java.util.Arrays;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java","hi","programming");

        list.stream()
                .sorted((a,b) -> a.length() - b.length())
                .forEach(System.out::println);
    }
}


