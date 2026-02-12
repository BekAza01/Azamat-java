public class Task11 {
    public static void main(String[] args) {
        double x = 1;

        double y = Math.tan(Math.sin(Math.PI*x))
                + Math.pow(x,7)
                + Math.cbrt(Math.exp(2*x + 3));

        System.out.println(y);
    }
}
