
import java.util.Scanner;

public class subarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        long target = sc.nextLong();

        int left = 0;
        long sum = 0;
        int ansStart = -1, ansEnd = -1;

        for (int right = 0; right < n; right++) {
            sum += arr[right];

            // shrink from the left while the window is too big,
            // but never shrink past the right pointer (window must stay non-empty)
            while (sum > target && left < right) {
                sum -= arr[left];
                left++;
            }

            if (sum == target) {
                ansStart = left;
                ansEnd = right;
                break;
            }
        }

        if (ansStart == -1) {
            System.out.println(-1);
        } else {
            System.out.println(ansStart + " " + ansEnd);
        }
    }
}
