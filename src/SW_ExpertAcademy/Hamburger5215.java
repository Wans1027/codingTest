package SW_ExpertAcademy;

import java.util.Scanner;

public class Hamburger5215 {

    static int n, k;
    static int[] score;
    static int[] cal;
    static int result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        sc.nextLine();
        score = new int[n];
        cal = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
            cal[i] = sc.nextInt();
        }

        hamburger(0, 0, 0);
        System.out.println(result);


    }

    private static void hamburger(int idx, int t, int kal) {
        if (kal > k) {
            return;
        }
        if (idx == n) {
            result = Math.max(result, t);
            return;
        }

        hamburger(idx+1, score[idx] + t, cal[idx] + kal);
        hamburger(idx+1, t, kal);
    }
}
