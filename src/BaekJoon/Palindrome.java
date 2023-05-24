package BaekJoon;

import java.util.Scanner;

public class Palindrome {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            cnt = 0;
            int recur = recur(s, 0, s.length() - 1);
            System.out.println(recur+" "+cnt);

        }
        sc.close();

    }
    static int cnt;
    private static int recur(String s, int start, int end) {
        cnt++;
        if (start >= end) {
            return 1;
        } else if (s.charAt(start) != s.charAt(end)) {
            return 0;
        }
        else {
            return recur(s, start + 1, end - 1);
        }
    }
}
