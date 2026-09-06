
import java.io.*;
import java.util.*;

public class prefixsum {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());

        long sum = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(st.nextToken());
            sum += value;
            sb.append(sum);
            if (i < n - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
