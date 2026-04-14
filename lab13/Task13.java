import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task13 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,2,9);

        list.sort((a,b) -> a - b);
        System.out.println(list);
    }
}


