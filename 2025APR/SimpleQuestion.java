import java.util.Scanner;

public class SimpleQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for (int i = 0; i < num; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            
            if (b % a == 0 && b / a >= 2) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
