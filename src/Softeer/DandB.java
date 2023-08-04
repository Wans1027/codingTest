package Softeer;

import java.util.*;

public class DandB {
    static List<List<Integer>> li = new ArrayList<>();
    static int[] visited;
    static Queue<Integer> q = new LinkedList<>();
    static int n,m;
    static StringBuilder sb = new StringBuilder();
    static StringBuilder sb2 = new StringBuilder();
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

    }

    private static void dfs(int idx) {
        visited[idx] = 1;
        sb.append(idx +" ");
        for (int i = 0; i < li.get(idx).size(); i++) {
            int a = li.get(idx).get(i);
            if (visited[a] == 0) {
                dfs(a);
            }
        }
    }

    private static void bfs(int idx){
        visited[idx] = 1;
        sb2.append(idx + " ");
        q.add(idx);
        while (!q.isEmpty()) {
            int a = q.poll();
            for (int i = 0; i < li.get(a).size(); i++) {
                int b  = li.get(a).get(i);
                if(visited[b] == 0){
                    visited[b] = 1;
                    q.add(b);
                    sb2.append(b + " ");
                }
            }
        }

    }

    private static int bSearch(int[] arr, int x) {
        int start = 0;
        int end = arr.length;

        while (start < end) {
            int mid = (start + end) / 2;
            if (x <= arr[mid]) {
                end = mid;
            }
            else start = mid+1;
        }

        return start;
    }
}
