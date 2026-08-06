
public class wreport {

    public static void main(String[] args) {
        // write your code here
        int cTopics = 17;
        int tTopics = 20;
        int learningHours = 3;
        int learningDays = 5;
        int rTopics = tTopics - cTopics;
        int weeklyhours = learningHours * learningDays;
        double percentage = (double) cTopics / tTopics * 100;
        System.out.println("Completed Topics:" + " " + cTopics);
        System.out.println("Remaining Topics:" + " " + rTopics);
        System.out.println("Weekly Learning Hours:" + " " + weeklyhours);
        System.out.println("Progress Percentage:" + " " + percentage);
    }
}
