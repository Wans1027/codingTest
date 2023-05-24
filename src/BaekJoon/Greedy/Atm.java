package BaekJoon.Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }

        Arrays.sort(p);
        int result = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += p[i];
            result += sum;
        }

        System.out.println(result);
    }
}
