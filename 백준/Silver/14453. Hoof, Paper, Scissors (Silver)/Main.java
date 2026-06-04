import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        String[] chars = new String[N];
        int[] cntH = new int[N+1];
        int[] cntS = new int[N+1];
        int[] cntP = new int[N+1];

        for (int i = 0; i < N; i++) {
            chars[i] = bufferedReader.readLine();
        }

        int answer = 0;

        for (int i = 1; i <= N; i++) {
            cntH[i] = cntH[i - 1] + (chars[i - 1].equals("H") ? 1 : 0);
            cntS[i] = cntS[i - 1] + (chars[i - 1].equals("S") ? 1 : 0);
            cntP[i] = cntP[i - 1] + (chars[i - 1].equals("P") ? 1 : 0);
        }

        for (int i = 1; i <= N; i ++) {
            int s = Math.max(cntH[i], Math.max(cntS[i], cntP[i]));
            int e = Math.max(cntH[N] - cntH[i], Math.max(cntS[N] - cntS[i], cntP[N] - cntP[i]));
            answer = Math.max(answer, s + e);
        }

        System.out.println(answer);
    }
}
