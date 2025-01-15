import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int s = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
    
        sc.close();
        
        String message = "happy";
        
        if (s * 1 + m * 2 + l * 3 < 10) {
            message = "sad";
        }
        
        System.out.println(message);
    }
}
