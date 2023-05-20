package AlgorithmLABS.Prac;

import java.util.*;

public class Pract {
    static int n;
    static int[] result;
    static int cnt;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cnt = 0;
        n = sc.nextInt();
        result = new int[n];
        pac(0,0);
        System.out.println(cnt);
    }

    private static void pac(int idx, int sum) {
        if (sum == n) {
            for (int i = 0; i < idx; i++) {
                System.out.print(result[i]);
                if(i != idx-1) System.out.print("+");
            }
            System.out.println();
            cnt++;
        } else if (sum > n) {
            return;
        } else {

            for (int i = n-1; i > 0 ; i--) {
                result[idx] = i;
                if(idx == 0) pac(idx + 1, sum + i);
                else if(result[idx] <= result[idx-1]) pac(idx + 1, sum + i);
            }
        }
    }

}
