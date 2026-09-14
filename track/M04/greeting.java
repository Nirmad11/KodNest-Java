
import java.util.Scanner;

public class greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String learnerName = scanner.nextLine();

        // Build and display the greeting.
        StringBuilder builder = new StringBuilder();
        builder.append("Hello, ");
        builder.append(learnerName);
        builder.append("!");

        System.out.println(builder);
    }
}
