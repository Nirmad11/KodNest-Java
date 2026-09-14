
import java.util.Scanner;

public class reverseoneword {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        // Reverse and display the word.
        StringBuilder builder = new StringBuilder(word);
        builder.reverse();

        System.out.println("Reversed: " + builder);
    }
}
