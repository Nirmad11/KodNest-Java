
public class ifstmt {

    public static void main(String[] args) {
        int day = 6;

        // Write the switch statement
        if (day >= 1 && day <= 5) {
            System.out.println("Learning Day");
        } else if (day == 6 || day == 7) {
            System.out.println("Revision Day");
        } else {
            System.out.println("Invalid Day");
        }
    }
}
