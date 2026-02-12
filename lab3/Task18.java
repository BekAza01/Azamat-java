public class Task18 {
    public static void main(String[] args) {
        double a=3,b=4,c=5;

        double p=(a+b+c)/2;
        double h=2*Math.sqrt(p*(p-a)*(p-b)*(p-c))/a;

        System.out.println(h);
    }
}
