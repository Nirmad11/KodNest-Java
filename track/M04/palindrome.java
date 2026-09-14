
import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        // Create the reversed word and compare it.
        StringBuilder builder = new StringBuilder(word);
        builder.reverse();
        String reversed = builder.toString();

        boolean isPalindrome = word.equalsIgnoreCase(reversed);

        System.out.println("Reversed: " + reversed);
        System.out.println("Palindrome: " + isPalindrome);
    }
}
