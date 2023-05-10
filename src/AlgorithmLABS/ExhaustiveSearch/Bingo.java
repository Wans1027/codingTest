package AlgorithmLABS.ExhaustiveSearch;

import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] map = new int[5][5];
        int[][] value = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                map[i][j] = sc.nextInt();
            }
        }





        for (int i = 0; i < 25; i++) {
            int a = sc.nextInt();
            int bingo = 0;

            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    if(map[j][k] == a) map[j][k] = 0;
                }
            }

            int aCnt = 0;
            int bCnt = 0;
            int rowCnt = 0;
            int colCnt = 0;

            for (int j = 0; j < 5; j++) {
                rowCnt = 0;
                colCnt = 0;
                for (int k = 0; k < 5; k++) {


                    if(map[k][j] == 0){
                        colCnt += 1;
                    }
                    if(map[j][k] == 0){
                        rowCnt += 1;
                    }
                    if (k == j && map[j][k] == 0) {
                        aCnt++;
                    }
                    if (k + j == 4 && map[j][k] == 0) {
                        bCnt++;
                    }
                }

                if(colCnt >= 5){
                    bingo++;
                }
                if(rowCnt >= 5){
                    bingo++;
                }


            }


            if(aCnt >= 5){
                bingo++;
            }
            if(bCnt >= 5){
                bingo++;
            }
            if(bingo >= 3){
                System.out.println(i+1);
                break;
            }

        }
    }
}
