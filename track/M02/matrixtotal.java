
import java.util.Scanner;

public class matrixtotal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int columns = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            int rowTotal = 0;

            for (int j = 0; j < columns; j++) {
                rowTotal += sc.nextInt();
            }

            System.out.println("Row " + (i + 1) + " total: " + rowTotal);
        }

        sc.close();
    }
}
