import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int consumePerDailyOfSheep = Integer.parseInt(st.nextToken());
        int consumePerDailyOfGoat = Integer.parseInt(st.nextToken());
        int quantity = Integer.parseInt(st.nextToken());
        int totalConsumePerDaily = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= quantity; i++) {
            int s = i;
            int g = quantity - i;
            if (g == 0) {
                System.out.println(-1);
                break;
            }
            if ((consumePerDailyOfSheep * s) + (consumePerDailyOfGoat * g) == totalConsumePerDaily) {
                System.out.println(s + " " + g);
                break;
            }
        }
    }
}
