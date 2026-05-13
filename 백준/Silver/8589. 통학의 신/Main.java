import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        List<Integer> results = new ArrayList<>();

        for (int i = -1000; i <= 1000; i++) {
            if ((i * i) + (2 * a * i) + b == 0) {
                results.add(i);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Integer result : results) {
            sb.append(result).append(" ");
        }

        System.out.println(sb);
    }
}
