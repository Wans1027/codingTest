package AlgorithmLABS.DP;

import java.util.Scanner;

public class PressButton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] value = new int[n][3];

        value[0][0] = sc.nextInt();
        value[0][1] = sc.nextInt();
        value[0][2] = sc.nextInt();

        for (int i = 1; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int[] v = {a,b,c};

            for (int j = 0; j < 3; j++) {
                int idx1 = (j+1)%3;
                int idx2 = (j+2)%3;
                value[i][j] = Math.max(value[i - 1][idx1], value[i - 1][idx2]) + v[j];
            }
        }

        int result = 0;
        for (int i = 0; i < 3; i++) {
            result = Math.max(result, value[n-1][i]);
        }
        System.out.println(result);
    }
}
