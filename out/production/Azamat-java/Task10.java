import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Task10 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7,2,9);

        int min = list.stream()
                .min(Integer::compare)
                .orElse(0);

        System.out.println(min);
    }
}


