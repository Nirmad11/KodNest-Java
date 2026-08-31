
import java.util.Scanner;

public class range {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int lower = scanner.nextInt();
        int upper = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= lower && arr[i] <= upper) {
                count++;
            }
        }
        System.out.println(count);
    }
}
