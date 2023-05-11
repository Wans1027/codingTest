package AlgorithmLABS.Recursion;

import java.util.Scanner;

public class Division {

    static int n;
    static int[] result;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        result = new int[n];
        recur(0,0);
        System.out.println(cnt);
    }
    static int cnt = 0;
    private static void recur(int sum, int idx) {

        if (sum == n) {
            for (int i = 0; i < idx; i++) {
                System.out.print(result[i]);
                if( i != idx-1) System.out.print("+");
            }
            System.out.println();
            cnt++;
        } else {
            int a;
            if (idx == 0) a = n - 1;
            else a = n - sum;
            for (int i = a; i > 0 ; i--) {
                result[idx] = i;
                if(idx > 0 && result[idx-1] < result[idx]) continue;
                recur(sum + i, idx+1);
            }
        }
    }
}
