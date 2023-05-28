package BaekJoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PracTest {
    static Map<Integer, Integer> m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            m.put(a,m.getOrDefault(a,0)+1);
        }
        StringBuilder sb = new StringBuilder();
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int a = sc.nextInt();
            int b = m.getOrDefault(a,0);
            sb.append(b + " ");
        }
        System.out.println(sb);
    }
}
