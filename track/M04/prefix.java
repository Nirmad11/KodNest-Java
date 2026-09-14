
import java.util.Scanner;

public class prefix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String baseText = scanner.nextLine();
        String prefix = scanner.nextLine();

        StringBuilder builder = new StringBuilder(baseText);

        // Insert the prefix and display the result.
        builder.insert(0, prefix + " ");

        System.out.println("Result: " + builder);
    }
}
