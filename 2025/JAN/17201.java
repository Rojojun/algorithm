import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        char[] values = sc.next().toCharArray();
        
        sc.close();        
        
        boolean flag = true;
        
        for(int i = 0; i < values.length - 1; i++) {
            if (values[i] == values[i + 1]) {
                flag = false;
            }            
        }
        
        if(flag == true) System.out.println("Yes");
        else System.out.println("No");
    }
}
