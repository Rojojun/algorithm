import java.util.Scanner;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String command = input.nextLine();
        input.close();
        
        int[] count = new int[10];
        
        for (char c : command.toCharArray()) {
            int num = c - '0';
            count[num]++;
        }
        
        count[6] = (count[6] + count[9] + 1) / 2;
        
        int max = 0;
        for (int i = 0; i < 9; i++) {
            max = Math.max(max, count[i]);
        }

        System.out.println(max);
    }
}