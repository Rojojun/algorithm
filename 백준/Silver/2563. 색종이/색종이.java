import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int limiter = input.nextInt();
        int total = 0;
        
        int[][] paper = new int[100][100];
        
        for (int i = 0; i < limiter; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
             
            for (int k = x; k < x + 10; k++) {
                for (int j = y; j < y + 10; j++) {
                    paper[k][j] = 1;
                }
            }
        }
        
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j] == 1) {
                    total++;
                }
            }
        }
        
        System.out.println(total);
        input.close();
    }
}