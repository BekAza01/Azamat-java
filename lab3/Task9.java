public class Task9 {
    public static void main(String[] args) {
        double x = 1;

        double y = Math.pow(Math.exp(3*x), 1.0/4)
                + 7
                + Math.pow(Math.cos(x),5)
                + Math.log(Math.abs(3*x + 7));

        System.out.println(y);
    }
}
