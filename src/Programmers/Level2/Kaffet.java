package Programmers.Level2;

import java.util.Scanner;

public class Kaffet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int brown = sc.nextInt();
        int yellow = sc.nextInt();

        //b+y = S = w * h
        // y = w-2 * h-2
        // b = S - y;


    }

    public int[] solution(int brown, int yellow) {

        int[] answer = new int[2];

        int s = brown + yellow;

        for (int i = 3; i < s; i++) {
            int j = s/i;
            if (s % i == 0 && j >= 3) {
                int col = Math.max(i, j);
                int row = Math.min(i, j);
                int center = (col-2) * (row-2);
                if (center == yellow) {
                    answer = new int[]{col, row};
                    return answer;
                }
            }
        }

        return answer;
    }
}
