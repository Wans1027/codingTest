package AlgorithmLABS.BFS;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SearchMaze1234 {

    static int[][] map;
    static int[][] visited;
    static int n;
    static int m;
    static Queue<int[]> q = new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        map = new int[n][m];
        //map[0][m-1] = 2;
        visited = new int[n][m];
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            int[] s = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            map[i] = s;
        }



        bfs();




    }

    private static void bfs() {
        int cnt = 0;
        //좌,우,위,아래
        int x = 0;
        int y = 0;
        //visited[x][y] = 1;
        q.add(new int[]{x, y, cnt});
        while (!q.isEmpty()) {
            int[] tmp = q.poll();
            int a = tmp[0];
            int b = tmp[1];
            cnt = tmp[2];
            //if(a==0 && b == m-1) break;
            try {
                if (map[a][b] != 0) {//벽이 아니라면


                    if (cnt < visited[a][b]) {
                        visited[a][b] = cnt;

                    } else if (visited[a][b] == 0) {
                        visited[a][b] = cnt;
                    } else continue;

                    cnt ++;
                    //좌
                    q.add(new int[]{a - 1, b, cnt});
                    //우
                    q.add(new int[]{a + 1, b, cnt});
                    //상
                    q.add(new int[]{a, b + 1, cnt});
                    //하
                    q.add(new int[]{a, b - 1, cnt});

                }
            }catch (Exception e){
                continue;
            }
        }
        System.out.println(visited[n-1][m-1]);
    }
}
