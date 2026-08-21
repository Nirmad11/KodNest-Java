
import java.util.Scanner;

public class seatanalyzer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int seat = sc.nextInt();

                if (seat == 0) {
                    count++;
                }
            }
        }

        System.out.println("Available seats: " + count);

        sc.close();
    }
}
