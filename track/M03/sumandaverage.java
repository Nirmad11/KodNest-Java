
import java.util.Scanner;

public class sumandaverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        long sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double average = (double) sum / n;

        System.out.println(sum);
        System.out.printf("%.2f%n", average);

        scanner.close();
    }
}
