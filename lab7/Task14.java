public class Task14 {
    public static void main(String[] args) {
        int[] D = new int[30];
        int evenSum = 0, oddSum = 0;

        for (int i = 0; i < 30; i++) {
            D[i] = (int)(Math.random() * 100);
            System.out.print(D[i] + " ");

            if (D[i] % 2 == 0)
                evenSum += D[i];
            else
                oddSum += D[i];
        }

        System.out.println("\nЖұп элементтер қосындысы: " + evenSum);
        System.out.println("Тақ элементтер қосындысы: " + oddSum);
    }
}
