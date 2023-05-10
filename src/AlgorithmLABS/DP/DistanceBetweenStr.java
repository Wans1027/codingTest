package AlgorithmLABS.DP;

import java.util.Scanner;

public class DistanceBetweenStr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        int aLen = a.length();
        int bLen = b.length();

        int[][] map = new int[aLen+1][bLen+1];

        for (int i = 0; i <= aLen; i++) {
            map[i][0] = i;
        }

        for (int i = 0; i <= bLen; i++) {
            map[0][i] = i;
        }

        for (int i = 1; i <= aLen; i++) {
            for (int j = 1; j <= bLen; j++) {
                if (a.charAt(i-1) == b.charAt(j-1)) {
                    map[i][j] = map[i-1][j-1];
                }
                else {
                    map[i][j] = Math.min(map[i - 1][j], map[i][j - 1]) + 1;

                }
            }
        }

        System.out.println(map[aLen][bLen]);

    }
}
