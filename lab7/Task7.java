public class Task7 {
    public static void main(String[] args) {
        double[][] B = new double[5][5];
        double[] A = new double[5];

        System.out.println("B матрицасы:");
        for (int i = 0; i < 5; i++) {
            double sum = 0;
            for (int j = 0; j < 5; j++) {
                B[i][j] = Math.random() * 20 - 10; // -10..10
                System.out.print(B[i][j] + "\t");
                if (B[i][j] > 0) {
                    sum += B[i][j];
                }
            }
            A[i] = sum;
            System.out.println();
        }

        System.out.println("\nҚатар бойынша оң элементтердің қосындысы:");
        for (int i = 0; i < 5; i++) {
            System.out.println("A[" + i + "] = " + A[i]);
        }
    }
}
