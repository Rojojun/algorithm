import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int first = input.nextInt();
        int second = input.nextInt();
        
        int result = Integer.compare(first, second);
        
        if (result == -1) {
            System.out.println("<");
        } else if (result == 1) {
            System.out.println(">");
        } else {
            System.out.println("==");
        }
    }
}