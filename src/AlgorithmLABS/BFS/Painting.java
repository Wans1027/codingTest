package AlgorithmLABS.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Painting {
    static Queue<Integer> q = new LinkedList<>();
    static int[] color;
    static int[][] nodes;
    static int n;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        color = new int[n];
        nodes = new int[n][n];
        visited = new boolean[n];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            nodes[a][b] = nodes[b][a] = 1;
        }

        bfs(0);//일단 칠하고
        /*for (int i : color) {
            System.out.print(i+" ");
        }*/
        //System.out.println();
        String s = proofBfs(0);
        System.out.println(s);
    }
    static int c = 1;
    private static void bfs(int v) {
        color[v] = 1;
        q.add(v);

        while (!q.isEmpty()) {
            v = q.poll();
            for (int i = 0; i < n; i++) {
                if (nodes[v][i] == 1 && color[i] == 0) {
                    q.add(i);
                    color[i] = color[v] * -1;

                }
            }
        }
    }

    private static String proofBfs(int v) {
        visited[v] = true;
        q.add(v);
        int cnt = n*n;
        while (cnt>0) {
            cnt--;
            v = q.poll();
            //System.out.print(color[v]+" ");
            for (int i = 0; i < n; i++) {
                if (nodes[v][i] == 1) {
                    q.add(i);
                    if(color[v] == color[i]) return "NO";
                    //System.out.println(color[v] + ", " + color[i]);
                    if(!visited[i]) visited[i] = true;
                }
            }

        }
        return "YES";
    }
}
