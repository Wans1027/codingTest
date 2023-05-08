package AlgorithmLABS.DP;

import java.util.Scanner;

public class MakeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] result = new int[n + 1];
        result[1] = 1;
        result[2] = 2;
        result[3] = 4;

        for (int i = 4; i <= n; i++) {
            int a = (result[i - 1] + result[i - 2] + result[i - 3])%1000007;
            result[i] = a;
        }

        System.out.println(result[n]);
    }
}
