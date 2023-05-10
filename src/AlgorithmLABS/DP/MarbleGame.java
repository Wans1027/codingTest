package AlgorithmLABS.DP;

import java.util.Scanner;

public class MarbleGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 4 == 0) {
            System.out.println("NO");

        }else System.out.println("YES");


    }
}
