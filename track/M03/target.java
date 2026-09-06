
import java.io.*;
import java.util.*;

public class target {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int target = Integer.parseInt(br.readLine().trim());

        int closest = arr[0];
        long closestDifference = Math.abs((long) arr[0] - target);

        for (int i = 1; i < arr.length; i++) {
            long currentDifference = Math.abs((long) arr[i] - target);
            if (currentDifference < closestDifference
                    || (currentDifference == closestDifference && arr[i] < closest)) {
                closest = arr[i];
                closestDifference = currentDifference;
            }
        }

        System.out.println(closest);
    }
}
