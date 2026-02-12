import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();

        double y = Math.cbrt(Math.exp(2*x))
                - Math.sin(Math.PI*x)/(x + 2.0/3)
                + 1.7;

        System.out.println("f(x) = " + y);
    }
}
