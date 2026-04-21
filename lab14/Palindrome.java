import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сан енгізіңіз: ");
        int number = scanner.nextInt();

        int original = number;
        int reversed = 0;

        do {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        } while (number > 0);

        if (original == reversed) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Палиндром емес");
        }
    }
}


