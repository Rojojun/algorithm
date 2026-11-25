import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int len = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    br.close();

    int[] arr = new int[len];
    int max = 0;
    double sum = 0;

    for (int i = 0; i < len; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
      if (i == 0) {
        max = arr[i];
      } else {
        max = Math.max(max, arr[i]);
      }
    }

    for (int i = 0; i < len; i++) {
      sum += (double) arr[i] / max * 100;
    }

    System.out.println((double) sum / len);
  }
}