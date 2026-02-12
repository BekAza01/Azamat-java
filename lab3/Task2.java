public class Task2 {
    public static void main(String[] args) {
        double x = 2;

        double y = Math.log(Math.abs(x - 1.5))
                + Math.cbrt(Math.pow(x,4))
                + Math.cbrt(Math.exp(3*x))
                + 4;

        System.out.println(y);
    }
}
