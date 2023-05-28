package BaekJoon.BackTracking;

import java.util.Scanner;

public class NM1 {
    static int n,k;
    static boolean[] visited;
    static int[] result;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        visited = new boolean[n];
        result = new int[k];

        backTracking(0);
        System.out.println(sb);
    }

    static StringBuilder sb = new StringBuilder();
    private static void backTracking(int idx) {
        if (idx == k) {
            for (int i : result) {
                sb.append(i+" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                result[idx] = i+1;
                backTracking(idx+1);
                visited[i] = false;
            }
        }
    }
}