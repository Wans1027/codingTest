package BaekJoon.분할정복;

import java.util.Scanner;

public class MakeColorPaper2630 {
    static int[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        mPaper(0,0,n);
        System.out.println(whiteCnt);
        System.out.println(blueCnt);

    }
    static int blueCnt = 0;
    static int whiteCnt = 0;

    private static void mPaper(int x, int y, int size) {
        if(isColorBlue(x,y,size)){
            if (arr[x][y] == 1) blueCnt++;
            else whiteCnt++;
            return;
        }
        else {
            mPaper(x,y,size/2);
            mPaper(x,y+size/2, size/2);
            mPaper(x+size/2,y,size/2);
            mPaper(x+size/2,y+size/2, size/2);
        }
    }

    private static boolean isColorBlue(int x, int y, int size) {
        int color = arr[x][y];
        for (int i = x; i < x+size; i++) {
            for (int j = y; j < y+size; j++) {
                if(arr[i][j] != color) return false;
            }
        }
        return true;
    }

}
