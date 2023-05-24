package BaekJoon.BinarySearch;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class NumberCard2 {
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
            start = 0;
            end = 0;
            getsNum(0, arr.length-1, mArr[i]);
            getENum(0, arr.length-1, mArr[i]);
            System.out.println(end+" "+start);
        }
    }

    static int start;
    static int end;

    private static void getsNum(int s, int e, int value) {
        if(arr[s] == value){
            start = 0;
            return;
        }

        if (s+1 >= e) {
            if(arr[e] == value) start = e;
            else start = 0;
        }
        else{
            int mid = (s+e)/2;
            if(arr[mid] >= value) getsNum(s, mid, value);
            else if (arr[mid] < value) {
                getsNum(mid, e, value);
            }
        }
    }

    private static void getENum(int s, int e, int value) {
        if(arr[e-1] == value){
            end = e;
            return;
        }
        if (s+1 >= e) {
            if(arr[s] == value) end = s;
            else end = 0;
        }
        else{
            int mid = (s+e)/2;
            if(arr[mid] > value) getENum(s, mid, value);
            else if (arr[mid]<= value) {
                getENum(mid, e, value);
            }
        }
    }


}
