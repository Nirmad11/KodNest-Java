
import java.util.Scanner;

public class anagram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine().toLowerCase();
        String second = scanner.nextLine().toLowerCase();

        // Match each character of first with the mutable copy of second.
        boolean isAnagram = true;

        if (first.length() != second.length()) {
            isAnagram = false;
        } else {
            StringBuilder builder = new StringBuilder(second);

            for (int i = 0; i < first.length(); i++) {
                char c = first.charAt(i);
                int pos = builder.indexOf(String.valueOf(c));

                if (pos == -1) {
                    isAnagram = false;
                    break;
                } else {
                    builder.deleteCharAt(pos);
                }
            }
        }

        // Display the result.
        System.out.println("Anagram: " + isAnagram);
    }
}
