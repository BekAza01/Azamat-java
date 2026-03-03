public class Task12 {
    public static void main(String[] args) {
        int[] B = new int[25];

        for (int i = 0; i < 25; i++) {
            B[i] = (int)(Math.random() * 100);
            System.out.print(B[i] + " ");
        }

        for (int i = 0; i < 24; i++) {
            for (int j = i + 1; j < 25; j++) {
                if (B[i] > B[j]) {
                    int temp = B[i];
                    B[i] = B[j];
                    B[j] = temp;
                }
            }
        }

        System.out.println("\n\nСұрыпталған массив:");
        for (int i = 0; i < 25; i++)
            System.out.print(B[i] + " ");
    }
}
