import java.util.Scanner;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int limiter = input.nextInt();
        int sum = 0;
        
        for (int i = 0; i < limiter; i++) {
            int command = input.nextInt();
            if (command == 0) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(command);
            }
        }
        
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        input.close();
        
        System.out.println(sum);
    }
}