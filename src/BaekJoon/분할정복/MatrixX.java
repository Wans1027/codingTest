package BaekJoon.분할정복;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        int[][] mat1 = new int[n][m];
        for (int i = 0; i < n; i++) {
            mat1[i] = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        int n1 = sc.nextInt();
        int m1 = sc.nextInt();
        int[][] mat2 = new int[n1][m1];
        sc.nextLine();
        for (int i = 0; i < n1; i++) {
            mat2[i] = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int[][] result = new int[n][m1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m1; j++) {
                for (int k = 0; k < m; k++) {
                    result[i][j] += mat1[i][k]*mat2[k][j];
                }
            }
        }
        for (int[] ints : result) {
            for (int i : ints) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
