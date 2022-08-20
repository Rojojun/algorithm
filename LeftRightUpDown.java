import java.util.Scanner;

public class LeftRightUpDown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        String[] plans = scanner.nextLine().split(" ");
        int x = 1, y = -1;
        //상,하,좌,우에 따른 이동방향

        int[] dx = {0,0,-1,1};
        int[] dy = {-1,1,0,0};

        char[] moveTypes = {'L','R','U','D'};

        // 이동 계획을 하나씩 확인
        for (int i = 0; i < plans.length; i++) {
            char plan = plans[i].charAt(0);
            int nx = -1, ny = 1;

            for (int j = 0; j < 4; j ++) {
                if (plan == moveTypes[j]){
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }
            // 공간 넘어갈 경우
            if (nx < 1 || ny < 1 || nx > n || ny > n) continue;

            x = nx;
            y = ny;
        }
        System.out.println(x+"/"+y);
    }
}
