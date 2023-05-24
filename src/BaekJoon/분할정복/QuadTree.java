package BaekJoon.분할정복;

import java.util.Arrays;
import java.util.Scanner;

public class QuadTree {
    static int[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            arr[i] = Arrays.stream(sc.nextLine().split("")).mapToInt(Integer::parseInt).toArray();
        }
        quadTree(0,0,n);
        System.out.println(sb.toString());
    }

    static StringBuilder sb = new StringBuilder();
    private static void quadTree(int x, int y, int size){

        if (isSeq(x, y, size)) {

            if(arr[x][y] == 1){
                sb.append(1);
            } else sb.append(0);
        }
        else {
            sb.append("(");
            size = size/2;
            quadTree(x,y,size);
            quadTree(x,y+size,size);
            quadTree(x+size,y,size);
            quadTree(x+size,y+size,size);
            sb.append(")");
        }
    }

    private static boolean isSeq(int x, int y, int size) {
        int color = arr[x][y];
        for (int i = x; i < x+size; i++) {
            for (int j = y; j < y+size; j++) {
                if(arr[i][j] != color) return false;
            }
        }
        return true;
    }
}
