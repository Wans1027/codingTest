package AlgorithmLABS.DP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CardPlay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        int[] value = new int[n];
        value[0] = v[0];
        value[1] = v[1] + value[0];
        value[2] = Math.max(v[0],v[1]) + v[2];
        for (int i = 3; i < n; i++) {
            value[i] = Math.max(value[i-1],  Math.max(value[i-2]+v[i], value[i-3] + v[i-1] + v[i]) );
        }


        System.out.println(value[n-1]);
    }
}
