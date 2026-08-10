
import java.util.Scanner;

public class interactiveLearner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read and display the profile
        String firstName = scanner.next();
        int solvedProblems = scanner.nextInt();
        double assessmentPercentage = scanner.nextDouble();
        System.out.println("Learner: " + firstName);
        System.out.println("Problems solved: " + solvedProblems);
        System.out.println("Assessment: " + assessmentPercentage);

        scanner.close();
    }
}
