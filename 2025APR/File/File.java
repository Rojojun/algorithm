import java.util.Scanner;

public class File {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] first = new int[2];
        first[0] = sc.nextInt();
        first[1] = sc.nextInt();
        
        int[] second = new int[2];
        second[0] = sc.nextInt();
        second[1] = sc.nextInt();
        
        System.out.println(Math.min(first[0] + second[1], first[1] + second[0]));
    }
}
