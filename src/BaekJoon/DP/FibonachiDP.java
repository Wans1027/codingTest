package BaekJoon.DP;

import java.util.Scanner;

public class FibonachiDP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new int[n+1];
        rCnt = 0;
        int i = fibDP(n);
        fibRecur(n);
        System.out.print(rCnt+" ");
        System.out.println(i);


    }
    static int[] dp;
    private static int fibDP(int x) {
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        int cnt  = 0;
        for (int i = 3; i <= x; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
            cnt++;
        }
        return cnt;
    }
    static int rCnt;
    private static int fibRecur(int x) {

        if(x == 2 || x== 1){
            rCnt++;
            return 1;
        }
        else return fibRecur(x - 2) + fibRecur(x - 1);
    }
}
