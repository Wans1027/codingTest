package Softeer;

import java.util.Scanner;

public class ScoreAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            arr[i] = arr[i - 1] + a;
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < k; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a == b){
                sb.append(arr[a]-arr[a-1]);
            }
            else {
                int c = b - a + 1;
                sb.append(String.format("%.2f",(double)(arr[b]- arr[a-1])/c));
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
