import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        
        sc.close();
        
        if (n <= Short.MAX_VALUE && n >= Short.MIN_VALUE) {
            System.out.println("short");
        } else if (n <= Integer.MAX_VALUE && n >= Integer.MIN_VALUE) {
            System.out.println("int");
        } else {
            System.out.println("long long");
        }
    }
}
