package BaekJoon2.BackTrack;

import java.util.Scanner;

public class NM1 {
    static int n, m;
    static boolean[] visited;
    static int[] result;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        visited = new boolean[n];
        result = new int[m];
        nm1(0);
        System.out.println(sb);

    }

    static StringBuilder sb = new StringBuilder();
    private static void nm1(int idx) {
        if (idx == m) {
            for (int i : result) {
                sb.append(i+" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if(!visited[i]){
                visited[i] = true;
                result[idx] = i+1;
                nm1(idx+1);
                visited[i] = false;
            }
        }
    }
}
