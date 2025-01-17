import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int col = sc.nextInt();
        int row = sc.nextInt();
        
        for (int i = 0; i < col; i++) {
            if ((i + 1) % 2 != 0) {
                            for (int j = 0; j < row; j++) {
                if ((j + 1) % 2 == 0) {
                    System.out.print(".");
                } else {
                    System.out.print("*");
                }
            }
            } else {
                         for (int j = 0; j < row; j++) {
                if ((j + 1) % 2 != 0) {
                    System.out.print(".");
                } else {
                    System.out.print("*");
                }
            }   
            }
            System.out.println();
        }
    }
}
