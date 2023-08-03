package Softeer;

import java.util.Scanner;

public class Jake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.MAX_VALUE;
            for (int j = 1; j <= i; j++) {
                if(i-j*j == 0) arr[i] = 1;
                else if (i - j*j < 0) {
                    break;
                } else arr[i] = Math.min(arr[i], arr[i - j * j] + 1);
            }
        }
        System.out.println(arr[n]);
    }
}
