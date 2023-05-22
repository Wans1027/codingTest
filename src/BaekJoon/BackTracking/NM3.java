package BaekJoon.BackTracking;

import java.util.Scanner;

public class NM3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        result = new int[m];
        nm3(0,0);
        System.out.println(sb);
    }
    static int n,m;

    static int[] result;

    static StringBuilder sb = new StringBuilder();
    private static void nm3(int at, int x) {
        if (x == m) {
            for (int i : result) {
                sb.append(i + " ");
            }
            sb.append('\n');
        }
        else {
            for (int i = at; i < n; i++) {
                result[x] = i+1;
                nm3(i,x + 1);
            }
        }
    }
}
