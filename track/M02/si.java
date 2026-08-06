
public class si {

    public static void main(String[] args) {
        // write your code here
        double principal = 10000.0;
        double rate = 6.5;
        double time = 2.0;
        double totalAmount = 0.0;
        double simpleInterest = principal * rate * time / 100;
        totalAmount = principal + simpleInterest;
        System.out.println("Simple Interest:" + " " + simpleInterest);
        System.out.println("Total Amount:" + " " + totalAmount);
        double weight = 72.0;
        double height = 1.8;
        double bmi = 0.0;
        bmi = weight / (height * height);
        System.out.println("BMI:" + " " + bmi);
        int marks1 = 78;
        int marks2 = 84;
        int marks3 = 69;
        int marks4 = 91;
        int marks5 = 88;
        int totalmarks = marks1 + marks2 + marks3 + marks4 + marks5;
        double percentage = (double) totalmarks / 500 * 100;
        System.out.println("Total Marks:" + " " + totalmarks);
        System.out.println("Percentage:" + " " + percentage);
    }
}
