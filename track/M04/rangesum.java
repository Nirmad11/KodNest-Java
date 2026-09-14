import java.util.Scanner;

public class rangesum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // prefix[i] = sum of arr[0..i-1], so prefix has length n+1
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }

        int q = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();

            long sum = prefix[right + 1] - prefix[left];
            sb.append(sum).append("\n");
        }

        System.out.print(sb);
    }
}