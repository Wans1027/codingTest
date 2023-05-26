package BaekJoon.Graph;

import java.util.Scanner;

public class OrganicBaechu {
    static int[][] map;
    static boolean[][] visited;
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < testcase; i++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int k = sc.nextInt();
            map = new int[n][m];
            visited = new boolean[n][m];
            sc.nextLine();
            for (int j = 0; j < k; j++) {
                int y = sc.nextInt();
                int x = sc.nextInt();
                map[x][y] = 1;
            }
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < m; l++) {
                    if (map[j][l] == 1 && !visited[j][l]) {
                        organicDfs(j,l);
                        cnt++;
                    }
                }
            }
            sb.append(cnt + "\n");
        }
        System.out.println(sb);
    }

    private static void organicDfs(int x, int y) {
        visited[x][y] = true;

        int[][] direction = new int[][]{{x+1,y},{x-1,y},{x,y+1},{x,y-1}};
        for (int[] dir : direction) {
            int a = dir[0];
            int b = dir[1];
            try {
                if(!visited[a][b] && map[a][b] == 1) organicDfs(a,b);
            } catch (Exception e) {
                continue;
            }

        }
    }
}
