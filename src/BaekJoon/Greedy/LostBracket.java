package BaekJoon.Greedy;

import java.util.Scanner;

public class LostBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] split = s.split("-");
        for (int i = 0; i < split.length; i++) {
            String[] split1 = split[i].split("\\+");
            int sum = 0;
            for (String s1 : split1) {
                sum+= Integer.parseInt(s1);
            }
            split[i] = String.valueOf(sum);
        }
        int result = Integer.parseInt(split[0]);
        for (int i = 1; i < split.length; i++) {
            result -= Integer.parseInt(split[i]);
        }

        System.out.println(result);
    }
}
