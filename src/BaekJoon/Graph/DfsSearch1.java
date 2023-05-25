package BaekJoon.Graph;

import java.util.*;

public class DfsSearch1 {
    static int[] visited;
    static int n, m, r;
    static List<List<Integer>> li = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();
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
            Collections.sort(li.get(i), new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2-o1;
                }
            });
        }
        cnt = 1;
        dfs(r);
        for (int i = 1; i < n+1; i++) {
            sb.append(visited[i] + "\n");
        }
        System.out.println(sb);
    }
    static int cnt;

    private static void dfs(int x) {

        visited[x] = cnt;


        for (int i = 0; i < li.get(x).size(); i++) {
            Integer a = li.get(x).get(i);
            if (visited[a] == 0) {
                cnt++;
                dfs(a);
            }
        }
    }
}
