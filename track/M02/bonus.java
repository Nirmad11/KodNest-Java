
public class bonus {

    public static void main(String[] args) {
        int[] values = {10, 20, 30, 40, 50};
        int bonus = 5;

        for (int i = 0; i < values.length; i++) {
            values[i] = values[i] + bonus;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Updated values: ");
        for (int i = 0; i < values.length; i++) {
            sb.append(values[i]);
            if (i != values.length - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
