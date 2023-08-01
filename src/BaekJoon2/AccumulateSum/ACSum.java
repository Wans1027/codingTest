package BaekJoon2.AccumulateSum;

import java.util.Scanner;

public class ACSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n+1];
        for (int i = 0; i < n; i++) {
            arr[i + 1] = arr[i] + sc.nextInt();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = arr[b] - arr[a-1];
            sb.append(c + "\n");
        }
        System.out.println(sb);
    }
}
