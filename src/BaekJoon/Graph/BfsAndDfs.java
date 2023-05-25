package BaekJoon.Graph;

import java.util.*;

public class BfsAndDfs {
    static int[] visited;
    static int n, m, r;
    static List<List<Integer>> li = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();
    static StringBuilder sb2 = new StringBuilder();
    static Queue<Integer> q = new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        r = sc.nextInt();
        visited = new int[n+1];

        for (int i = 0; i < n + 1; i++) {
            li.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            li.get(a).add(b);
            li.get(b).add(a);
        }
        for (int i = 0; i < n+1; i++) {
            Collections.sort(li.get(i));
        }
        cnt = 1;
        dfs(r);
        visited = new int[n+1];
        bfs(r);

        System.out.println(sb);
        System.out.println(sb2);
    }
    static int cnt;

    private static void dfs(int x) {

        visited[x] = 1;
        sb.append(x+" ");

        for (int i = 0; i < li.get(x).size(); i++) {
            Integer a = li.get(x).get(i);
            if (visited[a] == 0) {
                cnt++;
                dfs(a);
            }
        }
    }

    private static void bfs(int x) {
        visited[x] = 1;
        q.add(x);
        sb2.append(x+" ");
        while (!q.isEmpty()) {
            int poll = q.poll();
            for (int i = 0; i < li.get(poll).size(); i++) {
                Integer a = li.get(poll).get(i);
                if (visited[a] == 0) {
                    q.add(a);
                    cnt++;
                    visited[a] = 1;
                    sb2.append(a + " ");
                }
            }
        }
    }
}
