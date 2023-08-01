package BaekJoon2.greedy;

import java.util.Scanner;

public class LostGhalho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("-");
        int result = 0;

        for (int i = 0; i < s.length; i++) {
            String[] split = s[i].split("\\+");
            int a = 0;
            for (String s1 : split) {
                a += Integer.parseInt(s1);
            }
            if(i == 0) result += a;
            else result -= a;
        }

        System.out.println(result);
    }
}
