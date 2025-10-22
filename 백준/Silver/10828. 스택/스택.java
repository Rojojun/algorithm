import java.util.Scanner;
import java.util.Stack;

class Main {
    private static Stack<Integer> STACK = new Stack<>();
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()) {
            String command = input.nextLine().trim();
            if (command.isEmpty()) break;
            showResult(command);
        }
        input.close();
    }
    
    private static void showResult(String command) {
        if (command.startsWith("push")) {
            int num = Integer.parseInt(command.substring(5).trim());
            STACK.push(num);
        } else if (command.equals("pop")) {
            if (STACK.isEmpty()) {
                print("-1");
            } else {
                print(STACK.pop());
            }
        } else if (command.equals("size")) {
            print(STACK.size());
        } else if (command.equals("empty")) {
            print(STACK.isEmpty() ? "1" : "0");
        } else if (command.equals("top")) {
            String result = STACK.isEmpty() ? "-1" : STACK.peek().toString();
            print(result);
        }
    }
    
    private static void print(String target) {
        System.out.println(target);
    }

    private static void print(int target) {
        System.out.println(target);
    }
}