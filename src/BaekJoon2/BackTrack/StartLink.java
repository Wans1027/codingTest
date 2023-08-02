package BaekJoon2.BackTrack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StartLink {
    static int[][] map;
    static boolean[] visited;
    static int[] result;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        map = new int[n][n];
        visited = new boolean[n];
        result = new int[n/2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        backTrack(0,0);
        /*for (int i = 0; i < li.size()-1; i++) {
            for (int j = i+1; j < li.size(); j++) {
                if(li.get(i)[0] != li.get(j)[0] || li.get(i)[1] != li.get(j)[1]){
                    int i1 = teamScore(li.get(i));
                    int i2 = teamScore(li.get(j));
                    min = Math.min(min, Math.abs(i1-i2));
                }

            }
        }*/
        System.out.println(min);


    }

    //static int min = Integer.MAX_VALUE;
    static List<int[]> li = new ArrayList<>();
    private static void backTrack(int cnt, int idx) {
        if (cnt == n/2) {

            teamScore();
            return;
        }

        for (int i = idx; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                result[cnt] = i+1;
                backTrack(cnt+1, i+1);
                visited[i] = false;
            }
        }
    }
    static int min = Integer.MAX_VALUE;
    private static void teamScore() {
        int a = 0;
        int b = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(visited[i] && visited[j]) a += map[i][j] + map[j][i];
                else if(!visited[i] && !visited[j])b += map[i][j] + map[j][i];

            }
        }
        min = Math.min(min, Math.abs(a - b));
    }
}
