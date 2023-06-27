package BaekJoon.분할정복;

import java.util.Scanner;

public class Fibonacci6 {
    static int[] fib;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fibo = fibo(n);
        System.out.println(fibo);
    }

    private static int fibo(int n){

        int[] v = new int[n+1];
        v[0] = 0;
        v[1] = 1;
        for (int i = 2; i <= n; i++) {
            v[i] = (v[i-1] + v[i-2])% 1000000007;
        }

        return v[n];
    }
}
