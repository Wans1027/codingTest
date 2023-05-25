package BaekJoon.Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Virus {
    static int[] visited;
    static List<List<Integer>> li = new ArrayList<>();
    static int cnt;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int m = sc.nextInt();
        visited = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            li.add(new ArrayList<>());
        }
        cnt = 0;
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            li.get(a).add(b);
            li.get(b).add(a);
        }
        virus(1);
        System.out.println(cnt-1);

    }

    private static void virus(int x) {
        visited[x] = 1;
        cnt++;
        for (int i = 0; i < li.get(x).size(); i++) {
            Integer a = li.get(x).get(i);
            if (visited[a] == 0) {
                virus(a);
            }
        }
    }
}
