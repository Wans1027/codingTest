package BaekJoon.Graph;

import java.util.*;

public class BfsSearch1 {
    static int[] visited;
    static List<List<Integer>> li = new ArrayList<>();
    static int n,m,r;
    static Queue<Integer> q = new LinkedList<>();
    static int cnt;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         m = sc.nextInt();
         r = sc.nextInt();
         cnt = 1;

        visited = new int[n + 1];
        for (int i = 0; i < n+1; i++) {
            li.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            li.get(a).add(b);
            li.get(b).add(a);
        }
        for (int i = 0; i < li.size(); i++) {
            Collections.sort(li.get(i), new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2-o1;
                }
            });
        }
        bfs(r);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < n + 1; i++) {
            sb.append(visited[i] + "\n");
        }
        System.out.println(sb);
    }

    private static void bfs(int x) {
        visited[x] = cnt;
        q.add(x);
        while (!q.isEmpty()) {
            int poll = q.poll();
            for (int i = 0; i < li.get(poll).size(); i++) {
                Integer a = li.get(poll).get(i);
                if (visited[a] == 0) {
                    q.add(a);
                    cnt++;
                    visited[a] = cnt;
                }
            }
        }
    }

}
