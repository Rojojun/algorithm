import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;

class Main {
    private static int[][] apt;
    private static boolean[][] visited;
    
    static int[] directionRow = {-1, 1, 0, 0};
    static int[] directionColumn = {0, 0, -1, 1};
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int side = input.nextInt();
        input.nextLine();
        
        apt = new int[side][side];
        visited = new boolean[side][side];
        
        for (int i = 0; i < side; i++) {
            String line = input.nextLine();
            for (int j = 0; j < side; j++) {
                apt[i][j] = line.charAt(j) - '0';
            }
        }
        
        ArrayList<Integer> houseCounts = new ArrayList<>();
        int totalComplex = 0;
        
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                if (apt[i][j] == 1 && !visited[i][j]) {
                    totalComplex++;
                    
                    houseCounts.add(bfs(i, j));
                }
            }
        }
        
        Collections.sort(houseCounts);
        
        System.out.println(totalComplex);
        for (int count : houseCounts) {
            System.out.println(count);
        }
    }
    
    private static int bfs(int first, int second) {
        Queue<int[]> queue = new LinkedList<>();
        
        queue.add(new int[] {first, second});
        visited[first][second] = true;
        int houseCount = 1;
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentRow = current[0];
            int currentColumn = current[1];
            
            for (int i = 0; i < 4; i++) {
                int nextRow = currentRow + directionRow[i];
                int nextColumn = currentColumn + directionColumn[i];
                
                if (nextRow >= 0 && nextColumn >= 0 && nextRow < apt.length && nextColumn < apt.length) {
                    if (apt[nextRow][nextColumn] == 1 && !visited[nextRow][nextColumn]) {
                        visited[nextRow][nextColumn] = true;
                        queue.add(new int[] {nextRow, nextColumn});
                        houseCount++;
                    }
                }
            }
        }
        return houseCount;
    }
}