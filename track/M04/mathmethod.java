
import java.util.Scanner;

public class mathmethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two integers and use the three Math methods.
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int abs = Math.abs(a);

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Absolute first: " + abs);
    }
}
