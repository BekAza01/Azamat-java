public class Task9 {
    public static void main(String[] args) {
        int[][] C = new int[5][5];
        int product = 1;
        boolean hasPositive = false;

        System.out.println("Матрица:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                C[i][j] = (int) (Math.random() * 20 - 10);
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            if (C[i][i] > 0) {
                product *= C[i][i];
                hasPositive = true;
            }
        }

        if (hasPositive)
            System.out.println("\nНегізгі диагональдың оң элементтер көбейтіндісі: " + product);
        else
            System.out.println("\nОң элемент жоқ.");
    }
}
