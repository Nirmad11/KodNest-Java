
import java.util.Scanner;

class Employee {

    String name;
    double salary;

    void setDetails(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class shadowing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double salary = scanner.nextDouble();

        Employee emp = new Employee();

        emp.setDetails(name, salary);
        emp.displayDetails();

        scanner.close();
    }
}
