package Programmers.Level2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = fibo(n);
        System.out.println(a);

    }

    private static int fibo(int n){

        int[] v = new int[n+1];
        v[0] = 0;
        v[1] = 1;
        for (int i = 2; i <= n; i++) {
            v[i] = (v[i-1] + v[i-2])%1234567;
        }

        return v[n];
    }
}
