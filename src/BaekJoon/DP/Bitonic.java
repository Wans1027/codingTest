package BaekJoon.DP;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bitonic {
    static int[] arr, dp;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        arr = new int[n];
        dp = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            int max = 0;
            for (int j = 0; j < i; j++) {
                if(arr[j] < arr[i] ){
                    max = Math.max(max, dp[j]);
                }
            }
            dp[i] = max+1;
        }
        int[] dp1 = new int[n];
        for (int i = n-1; i >= 0; i--) {
            dp1[i] = 1;
            int max = 0;
            for (int j = n-1; j > i; j--) {
                if(arr[j] < arr[i] ){
                    max = Math.max(max, dp1[j]);
                }
            }
            dp1[i] = max+1;
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, dp[i] + dp1[i]);
        }
        System.out.println(max-1);
    }

}
