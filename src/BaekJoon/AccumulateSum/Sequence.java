package BaekJoon.AccumulateSum;

import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 0;
        int slide = 0;
        for (int i = 0; i < k; i++) {
            slide += arr[i];
            max = slide;
        }

        for (int i = k; i < n; i++) {
            slide = slide - arr[i - k] + arr[i];
            max = Math.max(max, slide);
        }
        System.out.println(max);
    }
}
