package BaekJoon2.BackTrack;

import java.util.Scanner;

public class NM3 {
    static int n, m;
    static boolean[] visited;
    static int[] result;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        visited = new boolean[n];
        result = new int[m];
        nm3(0);
        System.out.println(sb);
    }

    static StringBuilder sb = new StringBuilder();
    private static void nm3(int idx) {
        if (idx == m) {
            for (int i : result) {
                sb.append(i + " ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 0; i < n; i++) {
            result[idx] = i+1;
            nm3(idx+1);
        }
    }
}
