public class Task10 {
    public static void main(String[] args) {
        double x = 1;

        double y = Math.log(5*x)
                + Math.pow(x,5)*Math.sin(Math.pow(x,3))
                + Math.pow(Math.tan(x),4);

        System.out.println(y);
    }
}
