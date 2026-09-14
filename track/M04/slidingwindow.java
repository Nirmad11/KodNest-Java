
import java.util.Scanner;

public class slidingwindow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        int k = sc.nextInt();

        // sum of the first window
        long windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        long maxSum = windowSum;

        // slide the window: add the new element, remove the one that fell out
        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k];
            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
        }

        System.out.println(maxSum);
    }
}
