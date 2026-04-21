import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Task12 {
    public static void main(String[] args) {
        Supplier<Integer> random = () -> new Random().nextInt(100);
        System.out.println(random.get());
    }
}


