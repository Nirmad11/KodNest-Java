
import java.util.Scanner;

public class learnerProgress {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fullName = scanner.nextLine();
        int practiceDays = scanner.nextInt();

        int totalProblem = 0;

        for (int i = 1; i <= practiceDays; i++) {
            totalProblem += scanner.nextInt();
        }

        double average = (double) totalProblem / practiceDays;

        String status;
        if (average >= 5.0) {
            status = "Consistent";
        } else {
            status = "Needs consistency";
        }

        System.out.println("Learner: " + fullName);
        System.out.println("Total solved: " + totalProblem);
        System.out.println("Daily average: " + average);
        System.out.println("Status: " + status);

        scanner.close();
    }
}
