package AlgorithmLABS.Tree;

import java.sql.Array;
import java.util.*;

public class TreeHigh {
    static List<Integer>[] nodes;
    static boolean[] visited;
    static int n;
    static int startNode;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        startNode = sc.nextInt();
        sc.nextLine();

        nodes = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new ArrayList<>();
        }
        for (int i = 0; i < n-1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            nodes[a].add(b);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            visited = new boolean[n];
            cnt = 0;
            getDistance(i);
            //System.out.println(cnt);
            result.add(cnt);
        }
        Integer max = Collections.max(result);
        System.out.println(max);
    }
    static int cnt = 0;
    private static void getDistance(int x) {
        if (x == startNode) {
            return;
        }
        if(!visited[x]) cnt++;
        visited[x] = true;
        for (int i = 0; i < n; i++) {
            for (Integer integer : nodes[i]) {
                if (x == integer) {
                    getDistance(i);
                }
            }
        }
    }
}
