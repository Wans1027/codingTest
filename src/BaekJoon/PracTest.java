package BaekJoon;


import java.util.*;

public class PracTest {
    static int[][] map;
    static int n,m;
    static int[][] visit;
    static Queue<int[]> q = new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         m = sc.nextInt();

        map = new int[n][m];
        visit = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m; j++) {
                map[i][j] = sc.nextInt();
                visit[i][j] = Integer.MAX_VALUE;
            }
        }
        searchMaze(n-1,0);
    }

    private static void searchMaze(int x, int y) {
        q.add(new int[]{x, y, 0});
        visit[x][y] = 0;
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            int a = poll[0];
            int b = poll[1];
            int c = poll[2];
            try {
                if(map[a][b] == 0){
                    if (visit[a][b] < c) {
                        continue;
                    }
                    visit[a][b] = Math.min(visit[a][b], c);
                    q.add(new int[]{a-1,b,c+1});
                    q.add(new int[]{a+1,b,c+1});
                    q.add(new int[]{a,b-1,c+1});
                    q.add(new int[]{a,b+1,c+1});
                }
            } catch (Exception e) {
                continue;
            }
        }

        System.out.println(visit[0][m-1]);
    }
}
