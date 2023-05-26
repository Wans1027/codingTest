package BaekJoon.Graph;

import java.util.*;

public class JustAttackNum {
    static int[][] map;
    static boolean[][] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        map = new int[n][n];
        visited = new boolean[n][n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            map[i] = Arrays.stream(sc.nextLine().split("")).mapToInt(Integer::parseInt).toArray();
        }
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    count = 0;
                    cnt++;
                    JAN(i,j,0);
                    result.add(count);
                }
            }
        }
        Collections.sort(result);
        for (Integer integer : result) {
            sb.append(integer + "\n");
        }
        System.out.println(cnt);
        System.out.println(sb);


    }
    static int count;
    private static void JAN(int x, int y, int cnt) {
        visited[x][y] = true;
        count++;

        int[][] direction = new int[][]{{x+1,y},{x,y+1},{x-1,y},{x,y-1}};
        for (int[] dir : direction) {
            int a = dir[0];
            int b = dir[1];
            try {
                if(!visited[a][b] && map[a][b] == 1){
                    JAN(a,b,cnt+1);
                }
            } catch (Exception e) {
                continue;
            }
        }
    }
}
