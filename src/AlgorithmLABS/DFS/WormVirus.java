package AlgorithmLABS.DFS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WormVirus {
    static boolean[] visited;
    static List<Integer>[] node;
    static int result = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        visited = new boolean[n+1];
        node = new ArrayList[n+1];

        for (int i = 0; i <= n; i++) {
            node[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            node[a].add(b);
            node[b].add(a);
        }


        dfs(1);


        System.out.println(result-1);
        
    }

    private static void dfs(int idx) {

        result++;
        visited[idx] = true;
        for (int i : node[idx]) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }
}
