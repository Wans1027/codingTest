package AlgorithmLABS.Tree;

import java.sql.Array;
import java.util.*;

public class TreeHigh {
    static int[][] nodes;
    static boolean[] visited;
    static int n;
    static int startNode;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        startNode = sc.nextInt();
        sc.nextLine();

        nodes = new int[n][n];
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            nodes[b][a] = 1;
        }

        for (int i = 0; i < n; i++) {
            visited = new boolean[n];
            cnt = 0;
            dfs(i);
            //System.out.print(cnt+" ");
            result.add(cnt);
        }
        System.out.println(Collections.max(result));

    }
    static int cnt = 0;
    private static void dfs(int v) {
        if(v == startNode) return;
        visited[v] = true;
        cnt ++;
        for (int i = 0; i < n; i++) {
            if (nodes[v][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }
}
