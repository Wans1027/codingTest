package AlgorithmLABS.Prac;

import java.util.Scanner;

public class Practice {

    static int[][] node;
    static boolean[] visited;
    static int result = 0;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();//노드수
        sc.nextLine();
        int m = sc.nextInt();//간선수

        node = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            node[a][b] = node[b][a] = 1;
        }
        worm(1);
        System.out.println(result-1);
    }

    private static void worm(int idx) {
        result++;
        visited[idx] = true;
        for (int i = 1; i <= n; i++) {
            if(!visited[i] && node[idx][i] == 1){
                worm(i);
            }
        }
    }

}
