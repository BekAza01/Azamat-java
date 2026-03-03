public class Task13 {
    public static void main(String[] args) {
        int[] C = new int[20];
        int sum = 0;

        for (int i = 0; i < 20; i++) {
            C[i] = (int)(Math.random() * 100);
            System.out.print(C[i] + " ");
            sum += C[i];
        }

        System.out.println("\nОрта мән: " + (double)sum / 20);
    }
}
