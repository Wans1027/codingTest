package BaekJoon.Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HideAndSeek {
    static int[] visited;
    static Queue<int[]> q = new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        visited = new int[100000];

        hideAndSeek(n,k);

    }

    private static void hideAndSeek(int start, int dest) {
        if(start == dest) {
            System.out.println(0);
            return;
        }
        visited[start] = 0;
        q.add(new int[]{start, 0});

        while (!q.isEmpty()) {
            int[] poll = q.poll();
            int a = poll[0];
            int b = poll[1];
            try {
                if(visited[a] == 0) visited[a] = b;
                else if (visited[a] > b) {
                    visited[a] = b;
                }
                else continue;
                q.add(new int[]{a+1,b+1});
                q.add(new int[]{a-1,b+1});
                q.add(new int[]{a*2,b+1});
            } catch (Exception e) {
                continue;
            }

        }

        System.out.println(visited[dest]);
    }

}
