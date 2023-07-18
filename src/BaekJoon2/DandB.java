package BaekJoon2;

import java.util.*;

public class DandB {
    static List<List<Integer>> li = new ArrayList<>();
    static int[] visited;
    static int n,m;
    static Queue<Integer> q = new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         m = sc.nextInt();

        visited = new int[n];

        for (int i = 0; i < n; i++) {
            li.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            li.get(a).add(b);
            li.get(b).add(a);
        }

        for (int i = 0; i < n; i++) {
            Collections.sort(li.get(i));
        }
        dfs(0);
        visited = new int[n];
        bfs(0);

        System.out.println(dfsResult);
        System.out.println(bfsResult);

    }
    static StringBuilder dfsResult =  new StringBuilder();
    private static void dfs(int x) {
        visited[x] = 1;
        dfsResult.append(x + " ");
        for (int i = 0; i < li.get(x).size(); i++) {
            Integer a = li.get(x).get(i);
            if (visited[a] != 1) {
                dfs(a);
            }
        }
    }

    static StringBuilder bfsResult = new StringBuilder();

    private static void bfs(int x) {
        visited[x] = 1;
        q.add(x);
        bfsResult.append(x + " ");
        while (!q.isEmpty()) {
            Integer poll = q.poll();
            for (int i = 0; i < li.get(poll).size(); i++) {
                Integer a = li.get(poll).get(i);
                if (visited[a] != 1) {
                    visited[a] = 1;
                    q.add(a);
                    bfsResult.append(a+" ");
                }
            }
        }
    }
}
