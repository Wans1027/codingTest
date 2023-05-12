package AlgorithmLABS.Prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Pract {
    static int[][] map;
    static boolean[][] visited;
    static int n;
    static int cnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        map = new int[n][n];
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            map[i] = Arrays.stream(sc.nextLine().split("")).mapToInt(Integer::parseInt).toArray();
        }


        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && map[i][j] == 1) {
                    cnt = 0;
                    getSt(i,j);
                    result.add(cnt);
                }
            }
        }
        System.out.println(result.size());
        for (Integer i : result) {
            System.out.println(i);
        }

    }
    static int[][] direction;

    private static void getSt(int x, int y) {
        visited[x][y] = true;

        // 오른쪽 또는 아래쪽
        if (map[x][y] == 0) {
            return;
        }
        cnt++;


        direction = new int[][]{{x,y-1},{x+1,y},{x-1,y},{x,y+1}};

        for (int[] dir : direction) {
            int a = dir[0];
            int b = dir[1];
            try {
                if (!visited[a][b]) {
                    getSt(a, b);
                }
            } catch (Exception e) {
                continue;
            }

        }
    }


}
