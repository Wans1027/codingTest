package AlgorithmLABS.Prac;

import java.util.*;

public class Pract {
    //Search Maze
    // BFS를 이용한 최단 거리 경로 계산

    static int[][] visited;
    static int[][] map;
    static Queue<int[]> q = new LinkedList<>();
    static int n;
    static int m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        map = new int[n][m];
        visited = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
                visited[i][j] = Integer.MAX_VALUE;
            }
        }

        bfsSearch(n-1,0,0);
    }

    private static void bfsSearch(int x, int y, int cnt) {

        q.add(new int[]{x, y, cnt});

        while (!q.isEmpty()) {
            int[] poll = q.poll();
            x = poll[0];
            y = poll[1];
            cnt = poll[2];
            try {
                if (map[x][y] != 1) {

                    if (cnt < visited[x][y]) {
                        visited[x][y] = cnt;
                    }else continue;
                    cnt++;
                    q.add(new int[]{x, y + 1, cnt});
                    q.add(new int[]{x, y - 1, cnt});
                    q.add(new int[]{x + 1, y, cnt});
                    q.add(new int[]{x - 1, y, cnt});
                }
            } catch (Exception e) {
                continue;
            }
        }
        System.out.println(visited[0][m-1]);
    }


}
