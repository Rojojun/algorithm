import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int limiter = input.nextInt();
        input.nextLine();
        
        Queue<Integer> queue = new LinkedList<>();
        Integer last = -1;
        
        for (int i = 0; i < limiter; i++) { 
            String command = input.nextLine().trim();
            
            if (command.startsWith("push")) {
                int value = Integer.parseInt(command.substring(5));
                queue.offer(value);
                last = value;
            } else if (command.equals("pop")) {
                System.out.println(queue.isEmpty() ? "-1" : queue.poll());
            } else if (command.equals("size")) {
                System.out.println(queue.size());
            } else if (command.equals("empty")) {
                System.out.println(queue.isEmpty() ? "1" : "0");
            } else if (command.equals("front")) {
                System.out.println(queue.isEmpty() ? "-1" : queue.peek());
            } else if (command.equals("back")) {
                System.out.println(queue.isEmpty() ? "-1" : last);
            }
        }
        
        input.close();
    }
}