import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Task11 {
    public static void main(String[] args) {
        Consumer<String> print = s -> System.out.println(s);
        print.accept("Hello");
    }
}

