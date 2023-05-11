package AlgorithmLABS.Recursion;

import java.util.Scanner;

public class ToBin {
    static int[] result;
    static int n;
    public static void main(String[] args) {
        //k개의 1을 가진 n자리 이진 패턴
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int k = sc.nextInt();
        result = new int[n];
        tobin(0,k);
        
    }

    private static void tobin(int x, int k) {

        if (k == 0) {
            for (int i = 0; i < n; i++) {
                System.out.print(result[i]);
            }
            System.out.println();
        }
        else{
            for (int i = x; i < n; i++) {
                result[i] = 1;
                tobin(i+1, k-1);
                result[i] = 0;

            }
        }
    }


}
