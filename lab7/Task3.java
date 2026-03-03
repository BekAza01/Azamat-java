public class Task3 {
    public static void main(String[] args) {
        double[] A = new double[12];
        double product = 1;
        boolean hasNegative = false;

        for (int i = 0; i < 12; i++) {
            A[i] = Math.random() * 20 - 10;
            System.out.print(A[i] + " ");
            if (A[i] < 0) {
                product *= A[i];
                hasNegative = true;
            }
        }

        if (hasNegative)
            System.out.println("\nТеріс элементтер көбейтіндісі: " + product);
        else
            System.out.println("\nТеріс элемент жоқ.");
    }
}
