
import java.util.Scanner;

public class textmatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expectedText = scanner.nextLine();
        String enteredText = scanner.nextLine();

        // Compare and display the result.
        boolean matches = expectedText.equals(enteredText);
        System.out.println("Match: " + matches);
    }
}
