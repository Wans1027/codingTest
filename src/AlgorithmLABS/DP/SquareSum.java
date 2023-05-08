package AlgorithmLABS.DP;

import java.util.Scanner;

public class SquareSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] result = new int[n + 1];

        for (int i = 1; i <= n; i++) {

            result[i] = Integer.MAX_VALUE;

            for (int j = 1; j <=i ; j++) {
                if(i - j*j == 0 ) {
                    result[i] = 1;

                } else if (i - j*j < 0) {
                    break;
                } else{
                    result[i] = Math.min(result[i], result[i-j*j] + 1);

                }

            }
        }

        System.out.println(result[n]);
//        for (int i : result) {
//            System.out.println(i+" ");
//        }
    }
}
