package BaekJoon.Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SearchMaze {
    static int[][] map;
    static int[][] visited;
    static Queue<int[]> q = new LinkedList<>();
    static int n, m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         m = sc.nextInt();
        map = new int[n][m];
        visited = new int[n][m];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
           map[i] = Arrays.stream(sc.nextLine().split("")).mapToInt(Integer::parseInt).toArray();
        }
        for (int[] ints : map) {
            for (int i : ints) {
                System.out.print(i);
            }
            System.out.println();
        }
        SMazeBfs(0,0,0);
        //System.out.println(visited[n-1][m-1]);
    }

    private static void SMazeBfs(int x, int y, int cnt) {
        visited[x][y] = 1;
        q.add(new int[]{0, 0, 0});


        while (!q.isEmpty()) {
            int[] poll = q.poll();
            int a = poll[0];
            int b = poll[1];
            int c = poll[2];
            try {

                if(map[a][b] == 1){

                    if(visited[a][b] == 0) visited[a][b] = c;
                    else if (visited[a][b] > c) {
                        visited[a][b] = c;
                    }
                    else continue;
                    q.add(new int[]{a-1, b, c+1});
                    q.add(new int[]{a+1, b, c+1});
                    q.add(new int[]{a, b+1, c+1});
                    q.add(new int[]{a, b-1, c+1});
                }
            } catch (Exception e) {
                continue;
            }
        }
        System.out.println(visited[n-1][m-1]+1);
    }
}
