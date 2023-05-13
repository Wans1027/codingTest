package AlgorithmLABS.BinarySearch;

import java.util.Scanner;

public class BSearch {
    static int[] num;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        sc.nextLine();
        num = new int[n];
        int[] ques = new int[q];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        sc.nextLine();
        for (int i = 0; i < q; i++) {
            ques[i] = sc.nextInt();
        }

        for (int que : ques) {
            getDivide(0, n-1, que);
        }

    }

    private static void getDivide( int s, int e, int value) {

        if (s >= e) {
            if (num[s] == value) {
                System.out.println("YES");
            }else System.out.println("NO");
        }
        else{
            int mid = (s + e) / 2;
            if (num[mid] > value) {
                getDivide(s, mid -1, value);
            } else if (num[mid] < value) {
                getDivide(mid + 1, e, value);
            } else if (num[mid] == value) {
                System.out.println("YES");
            }
        }
    }
}
