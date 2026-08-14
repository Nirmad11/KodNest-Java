import java.util.Scanner;

class FoodOrder {
    String item;
    int quantity;

    FoodOrder(String item) {
        this.item = item;
        this.quantity = 1;
    }

    FoodOrder(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Order: " + item + ", Quantity: " + quantity);
    }
}

public class foodorder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item = scanner.nextLine();
        int quantity = scanner.nextInt();

        FoodOrder order1 = new FoodOrder(item);
        FoodOrder order2 = new FoodOrder(item, quantity);

        order1.display();
        order2.display();
    }
}