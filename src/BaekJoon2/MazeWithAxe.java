package BaekJoon2;

import java.util.*;

public class MazeWithAxe {
    static int[][] map;
    static Queue<int[]> q = new LinkedList<>();
    static int[][] visited;
    static int[][] visited2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        map = new int[n][m];
        visited = new int[n][m];
        visited2 = new int[n][m];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        int result = n*m;
        MazeSearch(n - 1, 0, visited);
        MazeSearch(0, m - 1, visited2);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(map[i][j] == 1){
                    int a = wall(i, j, visited);
                    int b = wall(i, j, visited2);
//                    int a = MinSearch(visited, i, j,n,m);
//                    int b = MinSearch(visited2, i, j,n,m);
                    if(a!=0 && b!=0) result = Math.min(result, a+b);
                }
            }
        }
        System.out.println(result);
    }

    private static int MinSearch(int[][] visit, int x, int y, int n, int m) {
        int min = n*m;
        int[][] direction = new int[][]{{x + 1, y}, {x, y + 1}, {x - 1, y}, {x, y - 1}};
        try {
            for (int[] ints : direction) {
                if(visit[ints[0]][ints[1]] != 0){
                    min = Math.min(min, visit[ints[0]][ints[1]]);
                }
            }
        } catch (Exception ignored){

        }
        return min;
    }

    private static int wall(int x, int y, int[][] v) {
        List<Integer> result = new ArrayList<>();
        try {
            if(v[x+1][y] !=0) result.add(v[x+1][y]);
        } catch (Exception ignored) {

        }
        try {
            if(v[x-1][y] !=0) result.add(v[x-1][y]);
        } catch (Exception e) {

        }
        try {
            if(v[x][y+1] !=0) result.add(v[x][y+1]);
        } catch (Exception e) {

        }
        try {
            if(v[x][y-1] !=0) result.add(v[x][y-1]);
        } catch (Exception e) {

        }
        if(result.isEmpty()) return 0;
        else return Collections.min(result);

    }

    private static int[][] MazeSearch(int startX, int startY, int[][] visit) {
        q.add(new int[]{startX, startY, 1});

        while (!q.isEmpty()) {
            int[] poll = q.poll();
            int x = poll[0];
            int y = poll[1];
            int cnt = poll[2];

            try {
                if(map[x][y] != 1){
                    if(visit[x][y] == 0 || visit[x][y] > cnt ){
                        visit[x][y] = cnt;
                        q.add(new int[]{x + 1, y, cnt+1});
                        q.add(new int[]{x, y+1, cnt+1});
                        q.add(new int[]{x-1, y, cnt+1});
                        q.add(new int[]{x, y - 1, cnt + 1});
                    }
                }

            } catch (Exception e) {
                continue;
            }
        }
        return visit;
    }
}
