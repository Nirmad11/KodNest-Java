
import java.util.Scanner;

public class average {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        double average = (double) sum / n;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > average) {
                count++;
            }
        }
        System.out.println(count);
    }
}
