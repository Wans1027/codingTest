package Programmers.Level2;

import java.util.Arrays;

import java.util.Scanner;

public class MakeMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }

    public int solution(int []A, int []B)
    {
        int ans = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = A.length-1, j = 0; i >= 0 ; i--, j ++) {
            ans += A[j] * B[i];
        }

        return ans;
    }




}
