import java.util.Scanner;
import java.util.HashMap;

public class Password {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      int N = scanner.nextInt();
      int M = scanner.nextInt();
      scanner.nextLine();
      
      String[] n_array = new String[N];
      String[] m_array = new String[M];
          
      HashMap<String, String> password = new HashMap<>();
      
      for (int i = 0; i < N; i++) {
          String line = scanner.nextLine();
          String[] parts = line.split(" ");
          password.put(parts[0], parts[1]);
      }
    
      for (int i = 0; i < M; i++) {
          String scanner_i = scanner.nextLine();
          System.out.println(password.get(scanner_i));
      }
    }
}
