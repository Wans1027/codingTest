package AlgorithmLABS.DP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RectangleArrangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] result = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            if(i<3) result[i] = i;
            else{
                int a = (result[i - 1] + result[i - 2])%1000007;
                result[i] = a;
            }
        }


        System.out.println(result[n]);
        sc.close();
    }
}
