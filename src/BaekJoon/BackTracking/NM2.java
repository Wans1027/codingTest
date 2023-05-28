package BaekJoon.BackTracking;

import java.util.Scanner;

public class NM2 {
    static int[] result;
    static int n,m;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        result = new int[m];
        visited = new boolean[n];
        nm2(0,0);
        System.out.println(sb);

    }

    static StringBuilder sb = new StringBuilder();
    private static void nm2(int idx, int cnt) {
        if (cnt == m) {
            for (int i : result) {
                sb.append(i + " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = idx; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                result[cnt] = i+1;
                nm2(i+1, cnt+1);
                visited[i] = false;
            }

        }
    }
}
