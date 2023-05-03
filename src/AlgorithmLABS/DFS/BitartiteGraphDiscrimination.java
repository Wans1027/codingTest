package AlgorithmLABS.DFS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BitartiteGraphDiscrimination {
    static boolean[] visited;
    static List<Integer>[] nodes;

    static int[] color;
    static int preColor;


    static int cnt = 1;
    static int result = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//노드수
        int m = sc.nextInt();//간선수
        visited = new boolean[n + 1];
        nodes = new ArrayList[n + 1];
        color = new int[n + 1];

        for (int i = 0; i < n + 1; i++) {
            nodes[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            nodes[a].add(b);
            nodes[b].add(a);
        }
        for (int i = 1; i < n+1 ; i++) {
            cnt = 1;
            preColor = 3;
            if (!visited[i]) {
                dfs(i);
            }
        }



        if (flag) {
            System.out.println("No");
        }else System.out.println("Yes");

    }

    static boolean flag = false;
    private static void dfs(int idx) {

        if (visited[idx]) {

            return;
        }

        cnt++;
        visited[idx] = true;
        if(cnt%2==0) color[idx] = 1;
        else color[idx] = 2;


        for (int i : nodes[idx]) {

            if(visited[idx] == visited[i]){
                flag = true;
                return;
            }
            if (!visited[i]) {
                preColor = color[idx];
                dfs(i);
            }
        }
    }
}
