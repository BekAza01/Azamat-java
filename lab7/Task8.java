public class Task8 {
    public static void main(String[] args) {
        double[][] A = new double[12][6];

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 6; j++) {
                A[i][j] = Math.random() * 20 - 10;
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nБағана бойынша теріс көбейтінді:");
        for (int j = 0; j < 6; j++) {
            double product = 1;
            boolean hasNegative = false;

            for (int i = 0; i < 12; i++) {
                if (A[i][j] < 0) {
                    product *= A[i][j];
                    hasNegative = true;
                }
            }

            if (hasNegative)
                System.out.println("Бағана " + j + ": " + product);
            else
                System.out.println("Бағана " + j + ": Теріс элемент жоқ");
        }
    }
}
