import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());

    char[] charB = String.valueOf(b).toCharArray();

    for (int i = charB.length - 1; i >= 0; i--) {
      int num = Character.getNumericValue(charB[i]);

      System.out.println(a * num);
    }

    System.out.println(a * b);
  }
}