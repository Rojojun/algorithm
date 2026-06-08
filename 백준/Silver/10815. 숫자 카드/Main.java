import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arrayOfN = new int[N];

        for (int i = 0; i < N; i++) {
            arrayOfN[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] arrayOfM = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            arrayOfM[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arrayOfN);
        StringBuilder sb = new StringBuilder();

        for (int target : arrayOfM) {
            int start = 0;
            int end = arrayOfN.length - 1;
            boolean found = false;

            while (start <= end) {
                int mid = (start + end) / 2;
                int value = arrayOfN[mid];

                if (value == target) {
                    found = true;
                    break;
                } else if (value < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            sb.append(found ? 1 : 0).append(' ');
        }
        System.out.println(sb.toString().trim());
    }
}
