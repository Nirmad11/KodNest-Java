
import java.util.Scanner;

public class reversestring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        // Create a builder, reverse it and display the result.
        StringBuilder builder = new StringBuilder(text);
        builder.reverse();

        System.out.println("Reversed: " + builder);
    }
}
