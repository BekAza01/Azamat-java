import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int i = 1;

        do {
            int j = 1;
            do {
                System.out.print(i * j + "\t");
                j++;
            } while (j <= 10);
            System.out.println();
            i++;
        } while (i <= 10);
    }
}

