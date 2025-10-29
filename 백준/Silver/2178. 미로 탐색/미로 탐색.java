import java.util.Arrays;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class Main {
    static int[] rowDirection = {-1, 1, 0, 0};
    static int[] columnDirection = {0, 0, -1, 1};

    private static int m, n;
    private static int[][] maze;
    private static int[][] move;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        m = input.nextInt();
        n = input.nextInt();
        input.nextLine();

        maze = new int[m][n];
        move = new int[m][n];

        for (int i = 0; i < m; i++) {
            String line = input.nextLine();
            for (int k = 0; k < n; k++) {
                maze[i][k] = line.charAt(k) - '0';
            }
        }

        bfs(0, 0);
        
        System.out.println(move[m - 1][n - 1]);

        input.close();
    }

    private static void bfs(int startRow, int startCol) {
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[] {startRow, startCol});
        move[startRow][startCol] = 1;

        while(!queue.isEmpty()) {
            int[] node = queue.poll();
            int row = node[0];
            int column = node[1];

            for (int i = 0; i < 4; i++) {
                int nextRow = row + rowDirection[i];
                int nexColumn = column + columnDirection[i];

                if (nextRow >= 0 && nextRow < m && nexColumn >= 0 && nexColumn < n) {
                    if (maze[nextRow][nexColumn] == 1 && move[nextRow][nexColumn] == 0) {
                        queue.add(new int[]{nextRow, nexColumn});

                        move[nextRow][nexColumn] = move[row][column] + 1;
                    }
                }
            }
        }
    }
}