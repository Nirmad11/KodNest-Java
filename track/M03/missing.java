
import java.io.*;
import java.util.*;

public class missing {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());

        long expectedSum = (long) n * (n + 1) / 2;
        long actualSum = 0;
        for (int i = 0; i < n - 1; i++) {
            actualSum += Integer.parseInt(st.nextToken());
        }

        long missing = expectedSum - actualSum;
        System.out.println(missing);
    }
}
