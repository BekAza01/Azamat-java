import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Task2 {
    public static void main(String[] args) {
        Function<String, String> upper = s -> s.toUpperCase();
        System.out.println(upper.apply("hello"));
    }
}


