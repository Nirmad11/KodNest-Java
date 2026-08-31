
import java.util.Scanner;

public class sorting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int sorted = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] < arr[i + 1]) {
                sorted = 0;
                break;
            }
        }
        System.out.println(sorted);
        scanner.close();
    }
}
