package BaekJoon2.BackTrack;

import java.util.Scanner;

public class NM4 {
    static int n, m;
    static int[] result;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        visited = new boolean[n];
        result = new int[m];
        nm4(0, 0);
        System.out.println(sb);
    }

    static StringBuilder sb = new StringBuilder();
    private static void nm4(int idx, int cnt) {
        if (cnt == m) {
            for (int i : result) {
                sb.append(i + " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = idx; i < n; i++) {
            result[cnt] = i + 1;
            nm4(i, cnt+1);
        }
    }
}
