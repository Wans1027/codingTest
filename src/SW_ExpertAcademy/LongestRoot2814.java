package SW_ExpertAcademy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LongestRoot2814 {

    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        nodes = new int[n][n];
        visited = new boolean[n];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            nodes[a-1][b-1] = nodes[b-1][a-1] = 1;
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            visited[i] = true;
            cnt = 0;
            dfs(i,1);
            visited[i] = false;
            result = Math.max(result, cnt);
        }

        System.out.println(result);

    }
    static boolean[] visited;
    static int[][] nodes;
    static int cnt = 0;
    private static void dfs(int start, int cntt) {
        if(cntt > cnt){
            cnt = cntt;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i] && nodes[start][i] == 1) {
                visited[i] = true;
                dfs(i, cntt+1);
                visited[i] = false;
            }
        }
    }


}
