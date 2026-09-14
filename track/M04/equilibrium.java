
import java.util.Scanner;

public class equilibrium {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[] arr = new long[n];
        long totalSum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
            totalSum += arr[i];
        }

        long leftSum = 0;
        int answer = -1;

        for (int i = 0; i < n; i++) {
            long rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                answer = i;
                break;
            }

            leftSum += arr[i];
        }

        System.out.println(answer);
    }
}
