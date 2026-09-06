import java.io.*;
import java.util.*;

public class segment {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int increasingCount = 1;
        int increasingMax = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                increasingCount++;
                if (increasingCount > increasingMax) {
                    increasingMax = increasingCount;
                }
            } else {
                increasingCount = 1;
            }
        }
        System.out.println(increasingMax);
    }
}