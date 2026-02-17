import java.util.Scanner;

public class Main {

    // Return task 1
    public static double square(double x) {
        return x * x;
    }

    // Return task 2
    public static boolean isPrime(double n) {
        if (n <= 1 || n % 1 != 0) return false; // тек бүтін сан болса ғана жай сан
        int num = (int) n;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== IF ELSE =====
        System.out.print("Сан енгіз: ");
        double a = sc.nextDouble();

        if (a > 0) System.out.println("Оң сан");
        else if (a < 0) System.out.println("Теріс сан");
        else System.out.println("Нөл");

        if (a % 3 == 0 && a % 5 == 0)
            System.out.println("3-ке де, 5-ке де бөлінеді");
        else
            System.out.println("3 және 5-ке бірге бөлінбейді");

        // ===== SWITCH =====
        System.out.print("Ай номерін енгіз (1-12): ");
        int month = sc.nextInt();

        switch (month) {
            case 1: System.out.println("Қаңтар"); break;
            case 2: System.out.println("Ақпан"); break;
            case 3: System.out.println("Наурыз"); break;
            case 4: System.out.println("Сәуір"); break;
            case 5: System.out.println("Мамыр"); break;
            case 6: System.out.println("Маусым"); break;
            case 7: System.out.println("Шілде"); break;
            case 8: System.out.println("Тамыз"); break;
            case 9: System.out.println("Қыркүйек"); break;
            case 10: System.out.println("Қазан"); break;
            case 11: System.out.println("Қараша"); break;
            case 12: System.out.println("Желтоқсан"); break;
            default: System.out.println("Қате ай!");
        }

        // ===== FOR =====
        System.out.println("1-100 жұп сандар:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("\nN енгіз: ");
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) sum += i;
        System.out.println("Қосынды: " + sum);

        // ===== WHILE =====
        double num;
        do {
            System.out.print("Оң сан енгіз: ");
            num = sc.nextDouble();
        } while (num <= 0);

        int fact = 1;
        int t = (int) num;
        while (t > 0) {
            fact *= t;
            t--;
        }
        System.out.println("Факториал: " + fact);

        // ===== DO WHILE =====
        String pass;
        sc.nextLine();
        do {
            System.out.print("Пароль енгіз: ");
            pass = sc.nextLine();
        } while (!pass.equals("1234"));

        System.out.println("Дұрыс пароль!");

        // ===== ARRAY =====
        int[] arr = {5, 12, 7, 20, 3};
        int max = arr[0];
        int evenCount = 0;

        for (int i : arr) {
            if (i > max) max = i;
            if (i % 2 == 0) evenCount++;
        }

        System.out.println("Max: " + max);
        System.out.println("Жұп саны: " + evenCount);

        // ===== 2D ARRAY =====
        int[][] matrix = {
                {1, 2, 3},
                {4, 9, 6},
                {7, 8, 5}
        };

        int total = 0;
        for (int i = 0; i < matrix.length; i++) {
            int rowMax = matrix[i][0];
            for (int j = 0; j < matrix[i].length; j++) {
                total += matrix[i][j];
                if (matrix[i][j] > rowMax)
                    rowMax = matrix[i][j];
            }
            System.out.println("Row " + i + " max: " + rowMax);
        }
        System.out.println("Matrix sum: " + total);

        // ===== BREAK =====
        for (int i = 1; i <= 100; i++) {
            if (i % 13 == 0) break;
            System.out.print(i + " ");
        }
        System.out.println();

        // ===== CONTINUE =====
        for (int i = 1; i <= 50; i++) {
            if (i % 4 == 0) continue;
            System.out.print(i + " ");
        }
        System.out.println();

        // ===== RETURN =====
        System.out.println("\nКвадрат: " + square(5));
        System.out.println("Жай сан ба: " + isPrime(17));

        // ===== FUNCTION f(x) =====
        System.out.print("\nx енгіз: ");
        double x = sc.nextDouble();
        double fx;

        if (x < 0) fx = x * x;
        else if (x == 0) fx = 0;
        else fx = Math.sin(x);

        System.out.println("f(x) = " + fx);

        System.out.println("\nБағдарлама аяқталды ✅");
    }
}