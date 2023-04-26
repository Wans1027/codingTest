package AlgorithmLABS.BinarySearch;


import java.util.Arrays;
import java.util.Scanner;

public class CuttingTree {
    private static int n,m;
    private static int[] trees;
    private static long max = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        trees = new int[n];

        for (int i = 0; i < n; i++) {
            trees[i] = sc.nextInt();
            max = Math.max(max, trees[i]);
        }

        long start = 0;
        long end = max;

        while(start<=end){
            long mid = (start+end)/2;
            long sum = 0;

            for (int tree : trees) {
                if(tree > mid){
                    sum += tree - mid;
                }
            }

            if (sum >= m) {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        System.out.println(end);
    }
}
