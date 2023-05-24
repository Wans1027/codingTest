package AlgorithmLABS.Prac;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Practice {
    //이진탐색
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] num = new int[n];
        int[] ques = new int[q];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        sc.nextLine();
        for (int i = 0; i < q; i++) {
            ques[i] = sc.nextInt();
        }
        for (int que : ques) {
            bSearch(num, que, 0, num.length - 1);

        }

    }

    private static void bSearch(int[] num, int q, int start, int end) {
        if (start >= end) {
            if (num[start] == q) {
                System.out.println("YES");

            }
            else System.out.println("NO");
        }
        else {
            int mid = (start + end) / 2;

            if (q == num[mid]) {
                System.out.println("YES");
            }
            else if (q > num[mid]) bSearch(num, q, mid+1, end);
            else if(q < num[mid]) bSearch(num, q, start, mid-1);
        }
    }
}
