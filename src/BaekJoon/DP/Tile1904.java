package BaekJoon.DP;

import java.io.*;
import java.util.Scanner;

public class Tile1904 {
    static long[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        dp = new long[n + 2];
        tile(n);
    }

    private static void tile(int x) {
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        if(x < 2) {
            System.out.println(dp[x]);
            return;
        }

        for (int i = 3; i <= x; i++) {
            dp[i] = (dp[i-1] + dp[i-2])%15746;
        }

        System.out.println(dp[x]);
    }
}
