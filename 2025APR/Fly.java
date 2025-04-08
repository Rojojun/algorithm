import java.util.Scanner;

public class Fly {
   public static void main(String args[]) {
       Scanner scanner = new Scanner(System.in);
       
       var s = scanner.nextInt();
       var t = scanner.nextInt();
       var d = scanner.nextInt();
       
       var trainVelocity = d / (s * 2);
       System.out.println(trainVelocity * t);
   }
}
