package BaekJoon.Greedy;

import java.util.Scanner;

public class Coin0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int price = sc.nextInt();
        int[] coin = new int[n];

        for (int i = 0; i < n; i++) {
            coin[i] = sc.nextInt();
        }
        int cnt = 0;
        for (int i = n-1; i >= 0 ; i--) {
            if (coin[i] <= price) {
                cnt += price/coin[i];
                price = price % coin[i];
            }
        }

        System.out.println(cnt);
    }
}
