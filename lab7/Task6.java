public class Task6 {
    public static void main(String[] args) {
        int[][] A = new int[10][10];
        int[] B = new int[10];

        for (int i = 0; i < 10; i++) {
            int sum = 0;
            for (int j = 0; j < 10; j++) {
                A[i][j] = (int)(Math.random() * 20 - 10);
                System.out.print(A[i][j] + "\t");
                if (A[i][j] < 0) sum += A[i][j];
            }
            B[i] = sum;
            System.out.println();
        }

        System.out.println("\nҚатар бойынша теріс қосынды:");
        for (int i = 0; i < 10; i++)
            System.out.println("B[" + i + "] = " + B[i]);
    }
}
