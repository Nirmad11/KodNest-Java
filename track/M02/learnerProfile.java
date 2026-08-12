
import java.util.Scanner;

class Learner {

    int id;
    String name;
    int javaScore;
}

public class learnerProfile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Learner l1 = new Learner();
        l1.id = scanner.nextInt();
        l1.name = scanner.next();
        l1.javaScore = scanner.nextInt();

        Learner l2 = new Learner();
        l2.id = scanner.nextInt();
        l2.name = scanner.next();
        l2.javaScore = scanner.nextInt();

        int newScore = scanner.nextInt();

        System.out.println("Before Update");
        System.out.println(l1.id + " - " + l1.name + " - " + l1.javaScore);
        System.out.println(l2.id + " - " + l2.name + " - " + l2.javaScore);

        l1.javaScore = newScore;

        System.out.println("After Update");
        System.out.println(l1.id + " - " + l1.name + " - " + l1.javaScore);
        System.out.println(l2.id + " - " + l2.name + " - " + l2.javaScore);
    }
}
