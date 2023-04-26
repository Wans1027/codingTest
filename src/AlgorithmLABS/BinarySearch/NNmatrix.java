package AlgorithmLABS.BinarySearch;

import java.util.Scanner;

public class NNmatrix {
    private static long n,k;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        k = sc.nextLong();
        /*
        1 2 3 4
        2 4 6 8
        3 6 9 12
        4 8 12 16

        1223344466889121216
         */
        //이진트리
        //12보다 작은 수의 개수를 구하고 싶다
        /**
         * 1행 마지막 요소가 12보다 작음 4
         * 2행 마지막 요소가 12보다 작음 4
         * 3행 12/3 -1 개 3
         * 4행 12/4 -1 개 2
         */

        long start =0, end = n*n+1;
        while (start+1 < end){
            long mid = (start+end)/2;
            long lowerCnt = getLowerCnt(mid);

            //k보다 중간값이 작거나 같은 경우
            if(lowerCnt<=k){
                start = mid;
            }
            //k보다 중간값이 큰 경우
            else end = mid;

        }
        System.out.println(start);
    }

    private static long getLowerCnt(long x) {
        long cnt = 0;

        for (int i = 1; i <= n; i++) {
            if ((i * n) < x) {
                cnt += n;
            }
           else{
                if(x%i==0)cnt += x/i -1;
                else cnt += x/i;
            }
        }
        return cnt+1;
    }


}
