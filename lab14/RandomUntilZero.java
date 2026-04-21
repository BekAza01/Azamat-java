import java.util.Random;
import java.util.Scanner;

public class RandomUntilZero {
    public static void main(String[] args) {
        Random random = new Random();
        int num;

        do {
            num = random.nextInt(10); // 0-9
            System.out.println(num);
        } while (num != 0);
    }
}


