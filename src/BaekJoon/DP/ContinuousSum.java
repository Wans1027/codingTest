package BaekJoon.DP;

import java.util.Scanner;

public class ContinuousSum {
    static int[] arr;
    static int[] result ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        result = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println( CSum());

    }

    private static int CSum() {
        int max = arr[0];
        result[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result[i] = Math.max(result[i - 1] + arr[i], arr[i]);
            max = Math.max(max, result[i]);
        }

        return max;
    }
}
