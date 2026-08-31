
import java.util.Scanner;

public class posneg {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int positivecount = 0;
        int negativecount = 0;
        int zerocount = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                negativecount++;
            } else if (arr[i] == 0) {
                zerocount++;
            } else {
                positivecount++;
            }
        }

        System.out.println(positivecount + " " + negativecount + " " + zerocount);

        scanner.close();
    }
}
