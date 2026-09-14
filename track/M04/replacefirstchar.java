
import java.util.Scanner;

public class replacefirstchar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        char replacement = scanner.nextLine().charAt(0);

        StringBuilder builder = new StringBuilder(text);

        // Replace the first character and display the result.
        builder.setCharAt(0, replacement);

        System.out.println("Result: " + builder);
    }
}
