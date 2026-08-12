
import java.util.Scanner;

class Printer {

    void show(int number) {
        // Print the number
        System.out.println("Number: " + number);
    }

    void show(String word) {
        // Print the word
        System.out.println("Word: " + word);
    }
}

public class twoOverloadedMethods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read one number and one word
        int number = scanner.nextInt();
        String word = scanner.next();

        // Create one Printer object
        Printer printer = new Printer();

        // Call both show() methods
        printer.show(number);
        printer.show(word);
    }
}
