package BaekJoon.BackTracking;

import java.util.Arrays;
import java.util.Scanner;

public class SAndLink14889 {

    static int[][] map;
    static int n;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        map = new int[n][n];
        visited = new boolean[n];
        result = Integer.MAX_VALUE;
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            map[i] = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        SAL_Permutation(0,0);
        System.out.println(result);
    }
    static int result;
    private static void SAL_Permutation(int idx, int count) {
        if (count == n / 2) {
            SAL_minResult();
            return;
        }
        for (int i = idx; i < n; i++) {
            if(!visited[i]){
                visited[i] = true;
                SAL_Permutation(i+1, count+1);
                visited[i] = false;
            }
        }
    }

    private static void SAL_minResult() {
        int teamA = 0;
        int teamB = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if((visited[i] && visited[j])) teamA += map[i][j] + map[j][i];
                else if (!visited[i] && !visited[j]) {
                    teamB += map[i][j] + map[j][i];
                }
            }
        }

        int a = Math.abs(teamA - teamB);

        result = Math.min(result, a);
    }
}
