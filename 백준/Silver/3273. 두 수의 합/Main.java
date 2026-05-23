import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int target = Integer.parseInt(br.readLine());
        int s = 0;
        int e = arr.length - 1;
        int count = 0;

        Arrays.sort(arr);

        while (s < e) {
            if (arr[s] + arr[e] == target) {
                s += 1;
                e -= 1;
                count++;
            } else if (arr[s] + arr[e] < target) {
                s++;
            }else {
                e -= 1;
            }
        }

        System.out.println(count);
    }
}
