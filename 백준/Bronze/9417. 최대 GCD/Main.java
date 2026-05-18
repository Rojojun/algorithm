import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        int result = 0;

        for (int i = 0; i < size; i++) {
            result = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] candidates = new int[st.countTokens()];
            for (int j = 0; j < candidates.length; j++) {
                candidates[j] = Integer.parseInt(st.nextToken());
            }

            for (int j = 0; j < candidates.length; j++) {
                for (int k = 0; k < candidates.length; k++) {
                    BigInteger a = BigInteger.valueOf(candidates[j]);
                    BigInteger b = BigInteger.valueOf(candidates[k]);

                    if (j == k) continue;
                    if (result == 0) result = a.gcd(b).intValue();
                    else if (a.gcd(b).intValue() < result) continue;
                    else if (a.gcd(b).intValue() > result) result = a.gcd(b).intValue();
                }
            }
            System.out.println(result);
        }
    }
}
