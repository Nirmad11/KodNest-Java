import java.util.Scanner;

class MobilePlan {
    String planName;
    int price;

    MobilePlan() {
        // Set Basic and 199
        planName="Basic";
        price=199;
    }

    MobilePlan(String planName, int price) {
        // Store both received values
        this.planName=planName;
        this.price=price;
    }

    void display() {
        System.out.println("Plan: " + planName + ", Price: " + price);
    }
}

public class constructoroverloading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the selected plan name and price
        String selectedPlanName=scanner.nextLine();
        int selectedPlanPrice=scanner.nextInt();
        // Create the default plan
        MobilePlan defaultPlan=new MobilePlan();
        // Create the selected plan
        MobilePlan selectedPlan=new MobilePlan(selectedPlanName,selectedPlanPrice);
        // Display both plans
        defaultPlan.display();
        selectedPlan.display();
        scanner.close();
    }
}