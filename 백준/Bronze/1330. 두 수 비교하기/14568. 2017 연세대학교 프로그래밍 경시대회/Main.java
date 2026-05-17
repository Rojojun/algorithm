import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int quantity = Integer.parseInt(br.readLine());
        br.close();

        int result = 0;

        for (int i = 1; i <= quantity; i++) {
            for (int j = i + 2; j <= quantity; j++) {
                int k = quantity - i - j;
                if (k >= 2 && k % 2 == 0) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
