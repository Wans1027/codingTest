package BaekJoon.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class CutTree {
    static int[]arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n];
        int start = 0;
        int end = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            end = Math.max(end, arr[i]);
        }

        Arrays.sort(arr);
        while (start < end) {
            int sum = 0;
            int mid = (start + end) / 2;
            for (int i : arr) {
                if(i > mid) sum += i-mid;
            }

            if(sum >= m) start = mid+1;
            else  end = mid-1;

        }
        System.out.println(end);

    }


}
