
import java.util.Scanner;

class Student {

    String name;

    void setName(String name) {
        this.name = name;
    }

    void showName() {
        System.out.println("Student Name: " + name);
    }

    void showScore(int first) {
        // Print the first score
        System.out.println("First Score: " + first);
    }

    void showScore(int first, int second) {
        // Print the total of two scores
        System.out.println("Two-Score Total: " + (first + second));
    }
}

public class studentmethods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the full name and two scores
        String fullName = scanner.nextLine();
        int firstScore = scanner.nextInt();
        int secondScore = scanner.nextInt();

        // Create one Student object
        Student student = new Student();

        // Store and print the name
        student.setName(fullName);
        student.showName();

        // Call both showScore() methods
        student.showScore(firstScore);
        student.showScore(firstScore, secondScore);
    }
}
