package Softeer;

import java.util.*;

public class SearchMaze {

    static int[][] map;
    static int[][] visited;
    static int n,m;
    static Queue<int[]> q = new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        map = new int[n][m];
        visited = new int[n][m];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int[] a = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            map[i] = a;
        }

        //searchMaze(n-1, 0);
        dfsMazeSearch(n-1, 0, 0);
        System.out.println(visited[0][m-1]);
    }

    private static void searchMaze(int x, int y){
        visited[x][y] = 0;
        q.add(new int[]{x,y,1});

        while (!q.isEmpty()) {
            int[] poll = q.poll();
            int a = poll[0];
            int b = poll[1];
            int c = poll[2];

            int[][] direction = new int[][]{{a + 1, b, c + 1}, {a - 1, b, c + 1}, {a, b + 1, c + 1}, {a, b - 1, c + 1}};
            try{
                if(map[a][b]==0){
                    if(visited[a][b] > c || visited[a][b] == 0){
                        visited[a][b] = c;
                        for(int[] dir : direction) {
                            q.add(dir);
                        }
                    }
                }

            }catch (Exception e){
                continue;
            }

        }

        System.out.println(visited[0][m-1]-1);
    }

    private static void dfsMazeSearch(int a, int b, int c) {
        visited[a][b] = c;
        int[][] direction = new int[][]{{a + 1, b, c + 1}, {a - 1, b, c + 1}, {a, b + 1, c + 1}, {a, b - 1, c + 1}};
        for (int[] dir : direction) {
            int x = dir[0];
            int y = dir[1];
            int cnt = dir[2];
            try {
                if(map[x][y] == 0){
                    if (visited[x][y] == 0 || visited[x][y] > cnt) {
                        dfsMazeSearch(x,y,cnt);
                    }
                    else continue;

                }
            } catch (Exception e) {
                //return;
            }

        }
    }
}
