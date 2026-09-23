
import java.util.Scanner;

class Student {

    String name;
    static int count;

    Student(String name) {
        // Store the name and increase the count.
        this.name = name;
        count++;
    }
}

public class countstudents {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two names, create two objects and display the result.
        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();

        Student first = new Student(firstName);
        Student second = new Student(secondName);

        System.out.println("Student: " + first.name);
        System.out.println("Student: " + second.name);
        System.out.println("Total students: " + Student.count);
    }
}
