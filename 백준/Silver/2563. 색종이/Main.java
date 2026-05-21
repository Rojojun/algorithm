import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        boolean[][] paper = new boolean[100][100];
        int count = 0;

        for (int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int f1 = Integer.parseInt(st.nextToken());
            int f2 = Integer.parseInt(st.nextToken());
            for (int j = f1; j < f1 + 10; j++) {
                for (int k = f2; k < f2 + 10; k++) {
                    paper[j][k] = true;
                }
            }
        }
        br.close();

        for (int j = 0; j < 100; j++) {
            for (int k = 0; k < 100; k++) {
                if (paper[j][k]) count++;
            }
        }

        System.out.println(count);
    }
}
