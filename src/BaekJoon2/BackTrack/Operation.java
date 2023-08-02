package BaekJoon2.BackTrack;

import java.util.Scanner;

public class Operation {
    static int n;
    static int[] operation, num;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        operation = new int[4];
        calculate(num[0], 1);
        System.out.println(max);
        System.out.println(min);
    }
    static int max = 0;
    static int min = Integer.MAX_VALUE;
    private static void calculate(int sum, int idx) {
        if(idx == n){
            max = Math.max(max, sum);
            min = Math.min(min, sum);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if(operation[i] > 0){
                operation[i]--;
                switch (i) {
                    case 0: calculate(sum + num[idx], idx + 1); break;
                    case 1: calculate(sum - num[idx], idx + 1); break;
                    case 2: calculate(sum * num[idx], idx + 1); break;
                    case 3: calculate(sum / num[idx], idx + 1); break;
                }
                operation[i]++;
            }
        }

    }
}
