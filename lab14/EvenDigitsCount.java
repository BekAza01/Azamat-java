import java.util.Random;
import java.util.Scanner;

public class EvenDigitsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сан енгізіңіз: ");
        int number = scanner.nextInt();

        int count = 0;

        do {
            int digit = number % 10;
            if (digit % 2 == 0) {
                count++;
            }
            number /= 10;
        } while (number > 0);

        System.out.println("Жұп цифрлар саны: " + count);
    }
}


