import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.LinkedList;

class Main {
    private static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    private static boolean[] visited;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int v = input.nextInt();
        
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        
        for (int i = 0; i < m; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            
            graph.get(x).add(y);
            graph.get(y).add(x);
        }
        
        for (int i = 1; i <= n; i++) {
            Collections.sort(graph.get(i));
        }
        
        input.close();
        
        visited = new boolean[n + 1];
        dfs(v);
        System.out.println();
        
        visited = new boolean[n + 1];
        bfs(v);
    }
    
    private static void dfs(int node) {
        visited[node] = true;
        
        System.out.print(node + " ");
        
        for (int next : graph.get(node)) {
            if (!visited[next])
                dfs(next);
        }
    }
    
    private static void bfs(int node) {
        Queue<Integer> queue = new LinkedList<>();
        
        queue.add(node);
        visited[node] = true;
        
        while (!queue.isEmpty()) {
            int pop = queue.poll();
            System.out.print(pop + " ");
            
            for (int next : graph.get(pop)) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
    }
}