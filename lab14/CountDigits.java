import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сан енгізіңіз: ");
        int number = scanner.nextInt();

        int count = 0;

        do {
            number /= 10;
            count++;
        } while (number != 0);

        System.out.println("Цифрлар саны: " + count);
    }
}
