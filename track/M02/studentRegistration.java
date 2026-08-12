
import java.util.Scanner;

class Student {

    int registrationId;
    String name;
    double attendancePercentage;
}

public class studentRegistration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student firstStudent = new Student();
        firstStudent.registrationId = scanner.nextInt();
        firstStudent.name = scanner.next();
        firstStudent.attendancePercentage = scanner.nextDouble();

        Student secondStudent = new Student();
        secondStudent.registrationId = scanner.nextInt();
        secondStudent.name = scanner.next();
        secondStudent.attendancePercentage = scanner.nextDouble();

        int selectedId = scanner.nextInt();
        double newAttendance = scanner.nextDouble();

        Student selectedStudent = null;

        if (firstStudent.registrationId == selectedId) {
            selectedStudent = firstStudent;
        } else if (secondStudent.registrationId == selectedId) {
            selectedStudent = secondStudent;
        }

        if (selectedStudent != null) {
            selectedStudent.attendancePercentage = newAttendance;
            System.out.println("Selected Student: " + selectedStudent.name);
        } else {
            System.out.println("Student not found.");
        }

        System.out.println(firstStudent.registrationId + " - " + firstStudent.name + " - " + firstStudent.attendancePercentage + "%");
        System.out.println(secondStudent.registrationId + " - " + secondStudent.name + " - " + secondStudent.attendancePercentage + "%");
    }
}
