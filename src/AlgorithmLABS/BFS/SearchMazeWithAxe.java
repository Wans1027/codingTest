package AlgorithmLABS.BFS;

import java.util.*;

public class SearchMazeWithAxe {
    static int[][] map;
    static int[][] visited;
    static int[][] visited1;
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
        visited1 = new int[n][m];
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            int[] s = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            map[i] = s;
        }
        int result = n*m;
        int result1 = n*m;

        int finalResult = n*m;

        int start = bfs(n-1, 0, 0, m-1, visited);
        int end = bfs(0, m-1, n-1, 0, visited1);

        List<Integer> wall = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(map[i][j] == 1){


                     result = wall(i, j, visited);
                     result1 = wall(i, j, visited1);

                    if(result != 0 && result1 != 0) finalResult = Math.min(finalResult, result1+result);
                }
            }
        }

        System.out.println(finalResult+2);

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

    private static int bfs(int x, int y, int x1, int y1, int[][] visit) {
        int cnt = 0;
        //좌,우,위,아래

        q.add(new int[]{x, y, cnt});
        while (!q.isEmpty()) {
            int[] tmp = q.poll();
            int a = tmp[0];
            int b = tmp[1];
            cnt = tmp[2];

            try {
                if (map[a][b] != 1) {//벽이 아니라면


                    if (cnt < visit[a][b]) {
                        visit[a][b] = cnt;

                    } else if (visit[a][b] == 0) {
                        visit[a][b] = cnt;
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

        return(visit[x1][y1]);
    }
}
