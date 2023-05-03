package AlgorithmLABS.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DistanceFromTree {
    static List<Integer>[] nodes;
    static boolean[] visited;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.nextLine();
        nodes = new ArrayList[n];
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new ArrayList<>();
        }
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            nodes[a].add(b);
        }

        getNode(x);
        getNode(y);
        getDistance(x, cnt);
        getDistance(y, cnt);
        //System.out.println(cnt);

        System.out.println(result);

    }
    static int result = 0;
    private static void getDistance(int x, int c) {
        if(x==c) {
            return;
        }
        result++;
        for (int i = 0; i < n; i++) {
            for (Integer integer : nodes[i]) {
                if (integer == x) {
                    getDistance(i,c);
                }
            }
        }
    }

    static int cnt = 0;
    private static void getNode(int x) {
        //공통 부모 노드찾기
        if(visited[x]) {
            cnt = x;
            return;
        }
        visited[x] = true;

        for (int i = 0; i < n; i++) {
            for (Integer integer : nodes[i]) {
                if (integer == x) {
                    getNode(i);
                }
            }
        }
    }
}
