import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

class Main {
    public static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<>();
    Scanner input = new Scanner(System.in);
    int limiter = input.nextInt();
    input.nextLine();

    
    for (int i = 0; i < limiter; i++) {
        String command = input.nextLine();
        if (command.startsWith("push_front")) {
            int value = Integer.parseInt(command.substring(11));
            deque.offerFirst(value);
        } else if (command.startsWith("push_back")) {
            int value = Integer.parseInt(command.substring(10));
            deque.offerLast(value);
        } else if (command.equals("pop_front")) {
            Integer value = deque.pollFirst();
            System.out.println(value == null ? "-1" : value);
        } else if (command.equals("pop_back")) {
            Integer value = deque.pollLast();
            System.out.println(value == null ? "-1" : value);
        } else if (command.equals("size")) {
            System.out.println(deque.size());
        } else if (command.equals("empty")) {
            System.out.println(deque.isEmpty() ? "1" : 0);
        } else if (command.equals("front")) {
            Integer value = deque.peekFirst();
            System.out.println(value == null ? "-1" : value);
        } else if (command.equals("back")) {
            Integer value = deque.peekLast();
            System.out.println(value == null ? "-1" : value);
        }
    }
    
    input.close();
    }
}