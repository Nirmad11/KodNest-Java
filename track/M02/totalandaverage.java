
public class totalandaverage {

    public static void main(String[] args) {

        int[] marks = {70, 80, 60, 90, 50};
        int total = 0;
        double average;

        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }

        average = (double) total / marks.length;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}
