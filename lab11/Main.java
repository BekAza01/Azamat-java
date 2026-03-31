import java.util.Scanner;

public class Main {

    // Қосу
    public static double add(double a, double b) {
        return a + b;
    }

    // Азайту
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Көбейту
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Бөлу
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Қате: 0-ге бөлуге болмайды!");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("=== КАЛЬКУЛЯТОР ===");

        while (running) {

            try {
                System.out.print("\nБірінші санды енгіз: ");
                double num1 = scanner.nextDouble();

                System.out.print("Екінші санды енгіз: ");
                double num2 = scanner.nextDouble();

                System.out.println("\nОперация таңда:");
                System.out.println("+  Қосу");
                System.out.println("-  Азайту");
                System.out.println("*  Көбейту");
                System.out.println("/  Бөлу");
                System.out.print("Таңдау: ");

                char op = scanner.next().charAt(0);

                double result = 0;

                switch (op) {
                    case '+':
                        result = add(num1, num2);
                        break;
                    case '-':
                        result = subtract(num1, num2);
                        break;
                    case '*':
                        result = multiply(num1, num2);
                        break;
                    case '/':
                        result = divide(num1, num2);
                        break;
                    default:
                        System.out.println("Қате: дұрыс операция таңдамадың!");
                        continue;
                }

                System.out.println("Нәтиже: " + result);

            } catch (Exception e) {
                System.out.println("Қате: санды дұрыс енгіз!");
                scanner.nextLine(); // буферді тазалау
            }

            System.out.print("\nТағы есептеу керек пе? (yes/no): ");
            String choice = scanner.next();

            if (choice.equalsIgnoreCase("no")) {
                running = false;
                System.out.println("Калькулятор жабылды. Сау бол!");
            }
        }

        scanner.close();
    }
}
