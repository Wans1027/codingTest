package BaekJoon2.AccumulateSum;

import java.util.Arrays;
import java.util.Scanner;

public class sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int max = 0;
        int slide = 0;
        for (int i = 0; i < m; i++) {
            slide += arr[i];
        }
        max = slide;
        for (int i = m; i < n; i++) {
            slide = slide - arr[i-m] + arr[i];
            max = Math.max(slide, max);
        }
        System.out.println(max);
    }
}
