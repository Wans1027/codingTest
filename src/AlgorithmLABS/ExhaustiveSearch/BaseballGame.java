package AlgorithmLABS.ExhaustiveSearch;

import java.util.Scanner;

public class BaseballGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[][] p = new int[n][3];
        int cnt = 0;

        for (int a = 0; a < n; a++) {


            p[a][0] = sc.nextInt();
            p[a][1] = sc.nextInt();
            p[a][2] = sc.nextInt();
        }
        for (int i = 1; i <= 9 ; i++) {
            for (int j = 1; j <= 9 ; j++) {
                if(i == j) continue;
                for (int k = 1; k <= 9; k++) {

                    if(k == i || k == j) continue;

                    int collect = 0;

                    for (int l = 0; l < n; l++) {
                        int askNum = p[l][0];
                        int st = p[l][1];
                        int ball = p[l][2];
                        int z100 = askNum / 100;
                        int z10 = (askNum % 100) / 10;
                        int z1 = (askNum % 10);

                        int zSt = 0;
                        int zBall = 0;

                        //백의자리
                        if(i == z100) zSt++;
                        if(j == z10) zSt++;
                        if(k == z1) zSt++;
                        if(i == z10 || i == z1) zBall++;
                        if(j == z100 || j == z1) zBall++;
                        if(k == z100 || k == z10) zBall++;

                        if(zSt == st && zBall == ball) collect++;
                    }

                    if (collect >= n) {
                        cnt++;
                    }
                }
            }
        }


        System.out.println(cnt);
    }
}
