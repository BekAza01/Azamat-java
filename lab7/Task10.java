public class Task10 {
    public static void main(String[] args) {
        double[][] D = new double[7][7];
        double sum = 0;

        System.out.println("Матрица:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                D[i][j] = Math.random() * 50;
                System.out.print(D[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < 7; i++) {
            sum += D[i][i];
        }

        System.out.println("\nНегізгі диагональдың орта мәні: " + (sum / 7));
    }
}
