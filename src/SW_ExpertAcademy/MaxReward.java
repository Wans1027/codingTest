package SW_ExpertAcademy;

import java.util.Arrays;
import java.util.Scanner;

public class MaxReward {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //strings = sc.nextLine().split("");
        int n = sc.nextInt();
        strings = String.valueOf(n).split("");
        int m = sc.nextInt();
        result = new int[2];
        visited = new boolean[strings.length];
        maxResult = 0;

        permutation(0);
        for (int i = 0; i < m-1; i++) {
            strings = String.valueOf(maxResult).split("");
            maxResult = 0;
            permutation(0);
        }

        System.out.println(maxResult);
    }

    static boolean[] visited;
    static String[] strings;
    static int[] result;
    static int maxResult;

    private static void permutation(int x) {
        int n = strings.length;

        if (x >= 2) {
            String[] st = Arrays.copyOf(strings, strings.length);
            StringBuilder str = new StringBuilder();
            String tmp = st[result[0]];
            st[result[0]] = st[result[1]];
            st[result[1]] = tmp;
            for (int i = 0; i < st.length; i++) {
                str.append(st[i]);
            }

            //System.out.println(Integer.parseInt(String.valueOf(str)));
            maxResult = Math.max(maxResult, Integer.parseInt(String.valueOf(str)));
        }
        else{
            for (int i = 0; i < n; i++) {
                if (!visited[i]) {
                    result[x] = i;
                    visited[i] = true;
                    permutation(x + 1);
                    visited[i] = false;
                }
            }
        }

    }
}
