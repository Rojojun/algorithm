import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        int[] x = new int[size];
        int[] y = new int[size];

        for (int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        Arrays.sort(x);
        Arrays.sort(y);

        int x1 = x[(size - 1) / 2];
        int y1 = y[(size - 1) / 2];

        long sumOfx = 0;
        long sumOfy = 0;

        for (int i : x) {
            long v = i - x1;
            sumOfx += Math.abs(v);
        }

        for (int i : y) {
            long v = i - y1;
            sumOfy += Math.abs(v);
        }

        System.out.println(sumOfx + sumOfy);
    }
}
