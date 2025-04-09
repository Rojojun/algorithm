import java.util.Scanner;

public class Bicycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int x = sc.nextInt();
        int b = sc.nextInt();
        int y = sc.nextInt();
        int T = sc.nextInt();
        
        int sumA = a;
        int sumB = b;
        
        if (T > 30) {
            int x_temp = (T - 30) * x;
            sumA += (x_temp * 21);
        }
        
        if (T > 45) {
            int x_temp = (T - 45) * y;
            sumB += (x_temp * 21);
        }
        
        System.out.println(sumA + " " + sumB);
    }
}
