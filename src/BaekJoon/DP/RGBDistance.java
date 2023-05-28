package BaekJoon.DP;

import java.util.Scanner;

public class RGBDistance {
    static int[][] rgb;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        rgb = new int[n][3];

        for (int i = 0; i < n; i++) {
            rgb[i][0] = sc.nextInt();
            rgb[i][1] = sc.nextInt();
            rgb[i][2] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            rgb[i][0] += Math.min(rgb[i-1][1],rgb[i-1][2]);
            rgb[i][1] += Math.min(rgb[i-1][0],rgb[i-1][2]);
            rgb[i][2] += Math.min(rgb[i-1][0],rgb[i-1][1]);
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            min = Math.min(min, rgb[n-1][i]);
        }
        System.out.println(min);
    }
}
