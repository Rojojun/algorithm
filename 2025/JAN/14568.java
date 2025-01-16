import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int candyCount = sc.nextInt();
        
        sc.close();
        
        int count = 0;
        
        for (int i = 1; i <= candyCount; i++) {
            for (int j = 1; j <= candyCount; j++) {
                for (int k = 1; k <= candyCount; k++) {
                    if (i + j + k == candyCount && i >= j + 2 && k % 2 != 1) {
                        count++;
                    }
                }
            } 
        }
        
        System.out.println(count);
    }
}
