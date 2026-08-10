
import java.util.Scanner;

class Student {

    int id;
    String name;
    int javaScore;
}

public class compare2objects {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create and populate the first Student object
        Student student1 = new Student();
        student1.id = scanner.nextInt();
        student1.name = scanner.next();
        student1.javaScore = scanner.nextInt();

        // Create and populate the second Student object
        Student student2 = new Student();
        student2.id = scanner.nextInt();
        student2.name = scanner.next();
        student2.javaScore = scanner.nextInt();

        // Display both records
        System.out.println(student1.id + " - " + student1.name + " - " + student1.javaScore);
        System.out.println(student2.id + " - " + student2.name + " - " + student2.javaScore);

        // Compare both scores and print one result
        if (student1.javaScore > student2.javaScore) {
            System.out.println(student1.name + " has the higher Java score.");
        } else if (student2.javaScore > student1.javaScore) {
            System.out.println(student2.name + " has the higher Java score.");
        } else {
            System.out.println("Both students have the same Java score.");
        }
    }
}
