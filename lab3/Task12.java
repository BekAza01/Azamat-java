public class Task12 {
    public static void main(String[] args) {
        double x = 1;

        double y = Math.log(Math.abs(5*x + 3))
                + Math.cos(Math.PI*Math.pow(x,2))
                + Math.tan(Math.pow(x,3));

        System.out.println(y);
    }
}
