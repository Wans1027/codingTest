package BaekJoon.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class FindNum {
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int m = sc.nextInt();
        int[] mArr = new int[m];
        for (int i = 0; i < m; i++) {
            mArr[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            finNum(0, arr.length-1, mArr[i]);
        }

    }

    private static void finNum(int start, int end,int num) {
        if (start > end) {
            System.out.println(0);
            return;
        }
        int mid = (start + end) / 2;
        if(arr[mid] > num) finNum(start, mid-1, num);
        else if(arr[mid] < num) finNum(mid+1, end, num);
        else if (arr[mid] == num) {
            System.out.println(1);
            return;
        }
    }
}
