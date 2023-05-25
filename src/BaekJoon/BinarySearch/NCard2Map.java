package BaekJoon.BinarySearch;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NCard2Map {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            map.put(a, map.getOrDefault(a,0)+1);
        }
        int m = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            Integer integer = map.get(a);
            if(integer == null) sb.append(0+" ");
            else sb.append(integer + " ");
        }
        //System.out.println(map);
        System.out.println(sb);

    }
}
