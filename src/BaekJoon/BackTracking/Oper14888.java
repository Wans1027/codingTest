package BaekJoon.BackTracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Oper14888 {
    static int[] num;
    static int[] operator;
    static int min, max;
    static int n, m;



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        num = new int[n];

        operator = new int[4];
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;


        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            operator[i] = sc.nextInt();

        }




        permute(1, num[0]);
        System.out.println(max);
        System.out.println(min);
    }


    private static void permute(int x, int sum) {
        if (x == n) {
            max = Math.max(max, sum);
            min = Math.min(min, sum);
        }
        else{
            for (int i = 0; i < 4; i++) {
                if (operator[i] > 0) {
                    operator[i]--;
                    switch (i) {
                        case 0 : permute(x+1, sum + num[x]); break;
                        case 1 : permute(x+1, sum - num[x]); break;
                        case 2 : permute(x+1, sum * num[x]); break;
                        case 3 : permute(x+1, sum / num[x]); break;
                    }
                    operator[i]++;
                }
            }
        }
    }
}
