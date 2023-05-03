package AlgorithmLABS.BFS;

import java.util.*;

public class DAndB {
    static int[][] nodes;
    static boolean[] visited;
    static int n;

    static Queue<Integer> q = new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        //int v = sc.nextInt();

        nodes = new int[n][n];
        visited = new boolean[n];



        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            nodes[a][b] = nodes[b][a] = 1;

        }

        /*for (int[] node : nodes) {
            for (int i : node) {
                System.out.print(i);
            }
            System.out.println();
        }*/
        dfs(0);
        visited = new boolean[n];
        System.out.println();
        bfs(0);

    }
    public static void dfs(int v){
        visited[v] = true;
        System.out.print(v+" ");

        for (int i = 0; i < n; i++) {
            if(!visited[i] && nodes[v][i] == 1){
                dfs(i);
            }
        }
    }

    public static void bfs(int v) {
        q.add(v);
        visited[v] = true;

        while (!q.isEmpty()) {

            v = q.poll();
            System.out.print(v + " ");

            for (int i = 0; i < n ; i++) {
                if (nodes[v][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
