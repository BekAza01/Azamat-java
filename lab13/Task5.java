import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,9,2,8);
        int max = list.stream().max(Integer::compare).orElse(0);
        System.out.println(max);
    }
}


