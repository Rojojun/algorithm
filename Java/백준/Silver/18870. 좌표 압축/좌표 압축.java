import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int len = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    br.close();

    int[] arr = new int[len];
    int[] sorted = new int[len];

    for (int i = 0; i < len; i++) {
      int v = Integer.parseInt(st.nextToken());
      arr[i] = v;
      sorted[i] = v;
    }

    // 순서 정렬
    Arrays.sort(arr);

    int rank = 0;

    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      if (map.get(arr[i]) == null) {

        map.put(arr[i], rank);
        rank++;
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < len; i++) {
      if (i != 0) {
        sb.append(" ");
      }
      sb.append(map.get(sorted[i]));
    }
    System.out.println(sb.toString());
  }
}