package BaekJoon.분할정복;

import java.util.Scanner;

public class PaperNum {
    static int[][] arr;
    static int[] result = new int[3];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n][n];
        //sc.nextLine();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
            //sc.nextLine();
        }
        cutPaper(0, 0, n);
        for (int i : result) {
            System.out.println(i);
        }

    }

    private static void cutPaper(int x, int y, int size) {
        if (isTrue(x, y, size)) {
            int a = arr[x][y];
            if(a == -1) result[0]++;
            else if (a == 0) result[1]++;
            else if (a == 1) result[2]++;
        }
        else {
            size = size/3;
            cutPaper(x, y, size);
            cutPaper(x+size,y,size);
            cutPaper((x + size*2), y, size);
            cutPaper(x, y+size, size);
            cutPaper(x+size,y+size,size);
            cutPaper((x + size*2), y+size, size);
            cutPaper(x, (y+size*2), size);
            cutPaper(x+size,(y+size*2),size);
            cutPaper((x + size*2), (y+size*2), size);
        }
    }

    private static boolean isTrue(int x, int y, int size) {
        int color = arr[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if(arr[i][j] != color) return false;
            }
        }
        return true;
    }
}
