
import java.util.Scanner;

class ResultCalculator {

    int getTotal(int first, int second) {
        // Return the total of two marks
        return first + second;
    }

    int getTotal(int first, int second, int third) {
        // Return the total of three marks
        return first + second + third;
    }
}

public class total {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three marks
        int firstMark = scanner.nextInt();
        int secondMark = scanner.nextInt();
        int thirdMark = scanner.nextInt();

        // Create one ResultCalculator object
        ResultCalculator calculator = new ResultCalculator();

        // Call both overloaded methods and print both totals
        int twoMarkTotal = calculator.getTotal(firstMark, secondMark);
        int threeMarkTotal = calculator.getTotal(firstMark, secondMark, thirdMark);

        System.out.println("Two-Mark Total: " + twoMarkTotal);
        System.out.println("Three-Mark Total: " + threeMarkTotal);
    }
}
