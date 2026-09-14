
import java.util.Scanner;

public class preservetext {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String original = scanner.nextLine();

        // Create a lowercase copy and display both values.
        String lower = original.toLowerCase();

        System.out.println("Original: " + original);
        System.out.println("Lowercase copy: " + lower);
    }
}
