
import java.util.Scanner;

public class sales {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int products = sc.nextInt();
        int months = sc.nextInt();

        int[][] sales = new int[products][months];

        for (int i = 0; i < products; i++) {
            for (int j = 0; j < months; j++) {
                sales[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < products; i++) {
            int productTotal = 0;
            for (int j = 0; j < months; j++) {
                productTotal += sales[i][j];
            }
            System.out.println("Product " + (i + 1) + " total: " + productTotal);
        }
    }
}
