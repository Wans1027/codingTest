package SW_ExpertAcademy;

import java.util.Arrays;
import java.util.Scanner;

public class Harvest2805 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[][] map = new int[n][n];
        for (int i = 0; i < n; i++) {
            map[i] = Arrays.stream(sc.nextLine().split("")).mapToInt(Integer::parseInt).toArray();
        }
        int sum = 0;
        for (int i = 0; i < (n/2)+1; i++) {
            for (int j = (n/2)-i; j <= n/2+i; j++) {
                sum += map[i][j];
            }
        }
        for (int i = (n/2)+1; i < n; i++) {
            for (int j = i-(n/2); j <= 3*(n/2)-i ; j++) {
                sum += map[i][j];
            }
        }
        System.out.println(sum);

    }
}
