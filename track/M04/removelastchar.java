
import java.util.Scanner;

public class removelastchar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        StringBuilder builder = new StringBuilder(text);

        // Remove the last character and display the result.
        int lastIndex = builder.length() - 1;
        builder.deleteCharAt(lastIndex);

        System.out.println("Result: " + builder);
    }
}
