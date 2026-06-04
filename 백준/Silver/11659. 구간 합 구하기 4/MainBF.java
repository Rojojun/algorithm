import java.io.*;
import java.util.*;

public class MainBF {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String first = bufferedReader.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(first);

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        String second = bufferedReader.readLine();
        StringTokenizer st = new StringTokenizer(second);
        int[] candidate = new int[N];
        int[] results = new int[M];

        for (int i = 0; i < N; i++) {
            candidate[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine());
            int s = Integer.parseInt(tokenizer.nextToken());
            int e = Integer.parseInt(tokenizer.nextToken());
            int result = 0;
            for (int j = s - 1; j <= e - 1; j++) {
                result += candidate[j];
            }
            results[i] = result;
        }

        for (int result : results) {
            System.out.println(result);
        }
    }
}
