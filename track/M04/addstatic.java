
import java.util.Scanner;

class Calculator {

    static int add(int first, int second) {
        // Return the sum.
        return first + second;
    }
}

public class addstatic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two integers and call Calculator.add().
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int result = Calculator.add(first, second);

        System.out.println("Sum: " + result);
    }
}
