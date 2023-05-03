package AlgorithmLABS.DFS;

import java.util.*;

public class JustAttackNum {
    static int[][] nodes;
    static boolean[][] visited;
    static int[][] map;
    static int cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        map = new int[n][n];
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            int[] ints = Arrays.stream(sc.nextLine().split("")).mapToInt(Integer::parseInt).toArray();
            map[i] = ints;
        }

        List<Integer> result = new ArrayList<>();
        int result0 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(!visited[i][j] && map[i][j]!=0){
                    cnt = 0;
                    result0++;
                    dfs(i, j);
                    result.add(cnt);
                }
            }
        }
        Collections.sort(result);
        System.out.println(result0);
        for (Integer integer : result) {
            System.out.println(integer);
        }


    }

    private static void dfs(int x, int y) {

        visited[x][y] = true;
        if (map[x][y] == 0) {
            return;
        }
        nodes = new int[][]{{x-1, y}, {x+1, y}, {x, y+1}, {x, y-1}};
        cnt++;

        for (int[] node : nodes) {
            int a = node[0];
            int b = node[1];
            try{
                if(!visited[a][b]){
                    dfs(a,b);
                }
            }catch (ArrayIndexOutOfBoundsException e){
                continue;
            }
        }


    }
}
