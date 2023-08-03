package Softeer;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class RobotMoving {
    static int[][] visited;
    static char[][] map;
    static Queue<int[]> q = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        map = new char[n][m];
        visited = new int[n][m];


    }

    private static void robot(int x, int y, String s) {
        visited[x][y] = 1;

        int[][] direction = new int[][]{{x + 2, y}, {x - 2, y}, {x, y + 2}, {x, y - 2}};
        for (int[] dir : direction) {
            int a = dir[0];
            int b = dir[1];
            try {
                if (visited[a][b] == 0 && map[a][b] == '.') {
                    robot(a,b,s+"A");
                }
            } catch (Exception e) {
                continue;
            }

        }

    }
}
