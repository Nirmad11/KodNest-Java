
import java.util.Scanner;

public class maxsubarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long currentSum = sc.nextLong();
        long bestSum = currentSum;

        for (int i = 1; i < n; i++) {
            long value = sc.nextLong();

            // either extend the previous subarray or start fresh at this value
            currentSum = Math.max(value, currentSum + value);
            bestSum = Math.max(bestSum, currentSum);
        }

        System.out.println(bestSum);
    }
}
