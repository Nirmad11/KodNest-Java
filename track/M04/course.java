
import java.util.Scanner;

public class course {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read and display the course and trainer names.
        String course = scanner.nextLine();
        String trainer = scanner.nextLine();

        System.out.println("Course: " + course);
        System.out.println("Trainer: " + trainer);
    }
}
