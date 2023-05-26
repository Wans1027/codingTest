package BaekJoon.Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class NightMove {
    static int n;
    static int[] night, destination;
    static int[][] visited;
    static Queue<int[]> q;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        for (int i = 0; i < testcase; i++) {
            n = sc.nextInt();
            sc.nextLine();
            night = new int[2];
            destination = new int[2];
            visited = new int[n][n];
            night[0] = sc.nextInt();
            night[1] = sc.nextInt();
            sc.nextLine();
            destination[0] = sc.nextInt();
            destination[1] = sc.nextInt();
            q = new LinkedList<>();
            NightMoveBfs();
        }
    }

    private static void NightMoveBfs() {
        if(night[0] == destination[0] && night[1] == destination[1]) {
            System.out.println(0);
            return;
        }
        visited[night[0]][night[1]] = 0;
        q.add(new int[]{night[0], night[1], 0});
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            int a = poll[0];
            int b = poll[1];
            int c = poll[2];
            try {
                if(visited[a][b] == 0) visited[a][b] = c;
                else if (visited[a][b] > c) {
                    visited[a][b] = c;
                }
                else continue;

                q.add(new int[]{a-1,b+2,c+1});
                q.add(new int[]{a+1,b+2,c+1});
                q.add(new int[]{a-2,b+1,c+1});
                q.add(new int[]{a+2,b+1,c+1});
                q.add(new int[]{a-2,b-1,c+1});
                q.add(new int[]{a+2,b-1,c+1});
                q.add(new int[]{a-1,b-2,c+1});
                q.add(new int[]{a+1,b-2,c+1});
            } catch (Exception e) {
                continue;
            }
        }
        System.out.println(visited[destination[0]][destination[1]]);
    }
}
