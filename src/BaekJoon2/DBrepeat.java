package BaekJoon2;

import java.util.*;

public class DBrepeat {
    static List<List<Integer>> li = new ArrayList<>();
    static Queue<Integer> q = new LinkedList<>();
    static int[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
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
        getDfs(n,m,0);
        visited = new int[n];
        getBfs(n,m,0);
        System.out.println(dfResult);
        System.out.println(bfResult);
    }
    static StringBuilder dfResult = new StringBuilder();
    static StringBuilder bfResult = new StringBuilder();
    private static void getDfs(int n, int m, int node) {
        visited[node] = 1;
        dfResult.append(node + " ");
        for (int i = 0; i < li.get(node).size(); i++) {
            Integer a = li.get(node).get(i);
            if(visited[a] != 1){
                getDfs(n, m, a);
            }
        }
    }

    private static void getBfs(int n, int m, int node) {
        visited[node] = 1;
        q.add(node);
        bfResult.append(node + " ");
        while (!q.isEmpty()) {
            Integer poll = q.poll();
            for (int i = 0; i < li.get(poll).size(); i++) {
                Integer a = li.get(poll).get(i);
                if (visited[a] != 1) {
                    q.add(a);
                    visited[a] = 1;
                    bfResult.append(a + " ");
                }
            }
        }
    }
}
