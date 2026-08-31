
import java.util.Scanner;

public class arrayidentical {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = scanner.nextInt();
        }
        int result = 1;
        if (n != m) {
            result = 0;
        } else {
            for (int i = 0; i < n; i++) {
                if (arr1[i] != arr2[i]) {
                    result = 0;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
