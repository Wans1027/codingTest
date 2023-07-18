package BaekJoon2;

import java.util.*;

public class ColorNode {
    static List<List<Integer>> li = new ArrayList<>();
    static int n,m;
    static Queue<Integer> q = new LinkedList<>();
    static int[] visited;
    static int[] color;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         m = sc.nextInt();
        visited = new int[n];
        color = new int[n];
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

        boolean b = colorBFS(0);
        if(b) System.out.println("YES");
        else System.out.println("NO");

    }

    private static boolean colorBFS(int x) {
        int c = 1;
        visited[x] = 1;
        color[x] = c;
        q.add(x);
        while (!q.isEmpty()) {
            Integer poll = q.poll();
            for (int i = 0; i < li.get(poll).size(); i++) {
                Integer a = li.get(poll).get(i);
                if (visited[a] == 0 && color[a] == 0) {
                    q.add(a);
                    visited[a] = 1;
                    color[a] = color[poll]*-1;

                } else if (visited[a] == 1 && color[a] == color[poll]) {
                    return false;
                }

            }
        }
        return true;
    }
}
