package AlgorithmLABS.Prac;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Practice {
    static boolean[] visited;
    static int[][] nodes;
    static int n;
    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();

        nodes = new int[n][n];
        visited = new boolean[n];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            nodes[a][b] = nodes[b][a] = 1;

        }
        dfs(0);
    }

    private static void dfs(int v) {
        visited[v] = true;
        System.out.print(v + " ");
        for (int i = 0; i < n; i++) {
            if (!visited[i] && nodes[v][i] == 1) {
                dfs(i);
            }
        }
    }

    private static void bfs(int v) {
        visited[v] = true;
        q.add(v);
        while (!q.isEmpty()) {
            Integer poll = q.poll();
            for (int i = 0; i < n; i++) {
                if (!visited[i] && nodes[poll][i] == 1) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
