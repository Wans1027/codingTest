package BaekJoon2;

import java.util.*;

public class AttachNUM {
    static int[][] map;
    static int[][] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        map = new int[n][n];
        visited = new int[n][n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int[] ints = Arrays.stream(sc.nextLine().split("")).mapToInt(Integer::parseInt).toArray();
            map[i] = ints;
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(visited[i][j] != 1 && map[i][j] == 1 ){
                    num = 0;
                    cnt++;
                    int a = numSearch(i, j, 1);
                    result.add(num);
                }
            }
        }
        Collections.sort(result);
        System.out.println(cnt);
        StringBuilder sb = new StringBuilder();
        for (Integer integer : result) {
            sb.append(integer + "\n");
        }
        System.out.println(sb);
    }

    static List<Integer> result = new ArrayList<>();
    static int num = 0;
    private static int numSearch(int x, int y, int cnt) {
        visited[x][y] = 1;
        num++;
        int[][] direction = new int[][]{{x + 1, y}, {x, y + 1}, {x - 1, y}, {x, y - 1}};
        for (int[] dir : direction) {
            int a = dir[0];
            int b = dir[1];
            try{
                if(visited[a][b] != 1 && map[a][b] == 1){
                    numSearch(a,b, cnt+1);
                }
            }catch (Exception e){
                continue;
            }

        }
        return cnt;
    }


}
