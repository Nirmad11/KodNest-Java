
public class nested {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println(j);
            }
            System.out.println("");
        }
        int k = 1;
        while (k <= 5) {
            int l = 1;
            while (l <= 5) {
                System.out.println(l);
            }
            System.out.println("");
            l++;
        }
        k++;
        int m = 1;
        do (m <= 5) {
            int n = 1;
            do (n <= 5) {
                System.out.println(l);
            }while(n<=5);
            System.out.println("");
        }while(n<=5);
    }
}
