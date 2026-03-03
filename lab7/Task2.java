public class Task2 {
    public static void main(String[] args) {
        int[] B = new int[15];
        int sum = 0;

        for (int i = 0; i < 15; i++) {
            B[i] = (int)(Math.random() * 40 - 20);
            System.out.print(B[i] + " ");
            if (B[i] > 0) sum += B[i];
        }

        System.out.println("\nОң элементтер қосындысы: " + sum);
    }
}
