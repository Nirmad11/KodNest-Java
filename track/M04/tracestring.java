
import java.util.Scanner;

public class tracestring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String original = scanner.nextLine();

        // Call toUpperCase() without storing the result.
        original.toUpperCase();
        System.out.println("Original: " + original);
        System.out.println("After ignored call: " + original);

        // Create and display an uppercase copy.
        String upper = original.toUpperCase();
        System.out.println("Uppercase copy: " + upper);
    }
}
