package BaekJoon.분할정복;

import java.util.Scanner;

public class Multiplication {
    // (a * b) % C = ((a % C)*(b % C)) % C 모듈러 합동 공식
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] arr = new long[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextLong();
        }
        long multiple = multiple(arr[0], arr[1], arr[2]);
        System.out.println(multiple);
    }

    private static long multiple(long a, long b, long c) {
        if (b == 1) {
            return a%c;
        }

        long temp = multiple(a,b/2, c);
        if (b % 2 == 1) {
            return (temp * temp % c) * a % c;
        }
        return (temp * temp % c);
    }
}
