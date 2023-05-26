package BaekJoon.Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tomato {
    static int[][] visited;
    static int[][] map;
    static Queue<int[]> q = new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        visited = new int[m][n];
        map = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            boolean isBreak = false;
            for (int j = 0; j < n; j++) {
                if(map[i][j] == 1) {
                    //tomatoDfs(i, j, 1);
                    tomatoBfs(i,j,1);
                }
            }
        }

        for (int[] ints : visited) {
            for (int i : ints) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        int result = tomatoResult(n, m);
        System.out.println(result);

    }

    private static int tomatoResult(int n, int m) {
        int max = 0;
        int cnt1 = 0;
        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {
                if(visited[i][j] == 1) cnt1++;
                max = Math.max(max, visited[i][j]);
                if(visited[i][j] == 0 && map[i][j] != -1) {

                    return -1;

                }
            }
        }
        if(cnt1 == n*m) return 0;
        else return max-1;
    }

    private static void tomatoBfs(int x, int y, int cnt) {
        visited[x][y] = cnt;
        q.add(new int[]{x, y, cnt});
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            int a = poll[0];
            int b = poll[1];
            int c = poll[2];
            try {
                if((visited[a][b] == 0 || visited[a][b] >= c) && map[a][b] != -1){
                    if(map[a][b] == 1) c = 1;
                    visited[a][b] = c;
                    q.add(new int[]{a+1,b,c+1});
                    q.add(new int[]{a-1,b,c+1});
                    q.add(new int[]{a,b+1,c+1});
                    q.add(new int[]{a,b-1,c+1});

                }
            } catch (Exception e) {
                continue;
            }
        }
    }

    private static void tomatoDfs(int x, int y, int cnt) {
        visited[x][y] = cnt;

        int[][] direction = new int[][]{{x+1,y},{x-1,y}, {x,y+1}, {x,y-1}};

        for (int[] dir : direction) {
            int a = dir[0];
            int b = dir[1];
            try {
                if((visited[a][b] == 0 || visited[a][b] > cnt) && map[a][b] != -1){
                    if(map[a][b] == 0)tomatoDfs(a,b,cnt+1);
                    else if(map[a][b] == 1) tomatoDfs(a,b,1);
                }
            } catch (Exception e) {
                continue;
            }

        }
    }


}
