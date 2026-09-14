
import java.util.Scanner;

public class lowercaseanagram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();

        boolean isAnagram = true;

        // Match and remove characters, then display the result.
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

        System.out.println("Anagram: " + isAnagram);
    }
}
