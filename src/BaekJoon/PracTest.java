package BaekJoon;


import java.util.Scanner;

public class PracTest {
    static int n,k;
    static boolean[] visited;
    static int[] result;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        visited = new boolean[n];
        result = new int[k];

        backTracking(0);
    }

    private static void backTracking(int idx) {
        if (idx == k) {
            for (int i : result) {
                System.out.print(i);
            }
            System.out.print(" ");
            for (int i = 0; i < n; i++) {
                if(visited[i]) System.out.print(i + 1);
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                result[idx] = i+1;
                backTracking(idx+1);
                visited[i] = false;
            }
        }
    }
}
