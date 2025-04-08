import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        int result = 0;
        int[] results = new int[t];
        
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            for(int j = 0; j < n; j++) {
                result += sc.nextInt();
                results[i] = result;
                if (j == n - 1) {
                    result = 0;
                }
            }
            System.out.println(results[i]);
        }
    }
}
