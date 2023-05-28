package BaekJoon.DP;

import java.util.Scanner;

public class MakeIt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new Integer[n + 1];
        dp[0] = 0;
        dp[1] = 0;
        System.out.println(makeIt(n));
    }
    static Integer[] dp;
    private static int makeIt(int x) {
        if( dp[x] == null){
            if(x % 6 == 0){
                dp[x] = Math.min(makeIt(x / 3), Math.min(makeIt(x / 2), makeIt(x - 1)))+1;
            }
            else if(x % 2 == 0){
                dp[x] = Math.min(makeIt(x / 2), makeIt(x-1))+1;
            }
            else if (x % 3 == 0) {
                dp[x] = Math.min(makeIt(x / 3), makeIt(x-1))+1;
            }
            else dp[x] = makeIt(x-1)+1;
        }
        return dp[x];
    }
}
