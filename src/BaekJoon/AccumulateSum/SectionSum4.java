package BaekJoon.AccumulateSum;

import java.util.Scanner;

public class SectionSum4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i-1] + sc.nextInt();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sb.append(arr[b] - arr[a-1]+"\n");
        }
        System.out.println(sb);
    }
}
