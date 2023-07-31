package BaekJoon2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Repeat1 {
    static int[][] map;
    static int[][] visited;
    static Queue<int[]> q = new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        map = new int[n][m];
        visited = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        searchMaze(n,m,n-1,0);

    }

    private static void searchMaze(int n, int m, int startX, int startY) {
        q.add(new int[]{startX, startY, 0});

        while (!q.isEmpty()) {
            int[] poll = q.poll();
            int x = poll[0];
            int y = poll[1];
            int cnt = poll[2];

            try {
                if (map[x][y] != 1) {
                    if (visited[x][y] == 0 || visited[x][y] > cnt) {
                        visited[x][y] = cnt;
                        q.add(new int[]{x + 1, y, cnt + 1});
                        q.add(new int[]{x, y + 1, cnt + 1});
                        q.add(new int[]{x - 1, y, cnt + 1});
                        q.add(new int[]{x, y - 1, cnt + 1});
                    }
                }
            } catch (Exception e) {
                continue;
            }
        }
        System.out.println(visited[0][m-1]);
    }
}
