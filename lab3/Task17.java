public class Task17 {
    public static void main(String[] args) {
        double c=5, a=3;

        double b = Math.sqrt(c*c-a*a);
        double r = (a+b-c)/2;

        System.out.println(b);
        System.out.println(Math.PI*r*r);
    }
}
