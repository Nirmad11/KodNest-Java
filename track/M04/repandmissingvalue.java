
import java.util.Scanner;

public class repandmissingvalue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[] arr = new long[n];
        long actualSum = 0;
        long actualSumSq = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
            actualSum += arr[i];
            actualSumSq += arr[i] * arr[i];
        }

        // Expected sum and sum of squares for 1..n
        long expectedSum = (long) n * (n + 1) / 2;
        long expectedSumSq = (long) n * (n + 1) * (2L * n + 1) / 6;

        // diff1 = repeating - missing
        long diff1 = actualSum - expectedSum;
        // diff2 = repeating^2 - missing^2 = (repeating - missing)(repeating + missing)
        long diff2 = actualSumSq - expectedSumSq;

        // repeating + missing = diff2 / diff1
        long sumRM = diff2 / diff1;

        long repeating = (diff1 + sumRM) / 2;
        long missing = repeating - diff1;

        System.out.println(repeating + " " + missing);
    }
}
