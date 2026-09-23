
import java.util.Scanner;

class Learner {

    String learnerName;
    static String instituteName;

    Learner(String learnerName) {
        // Store the object-specific name.
        this.learnerName = learnerName;
    }

    void display() {
        // Display the name and shared institute.
        System.out.println(learnerName + " - " + instituteName);
    }
}

public class institute {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the shared institute and two names.
        String instituteName = scanner.nextLine();
        Learner.instituteName = instituteName;
        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();

        // Create and display two learners.
        Learner first = new Learner(firstName);
        Learner second = new Learner(secondName);
        first.display();
        second.display();
    }
}
