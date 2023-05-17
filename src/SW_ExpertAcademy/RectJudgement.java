package SW_ExpertAcademy;

import java.util.Arrays;
import java.util.Scanner;

public class RectJudgement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Character[][] arr = new Character[n][n];
        for (int i = 0; i < n; i++) {
            String split = sc.nextLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = split.charAt(j);
            }

        }

        int[] start = {0,0};
        int[] end = {0, 0};
        //start catch
        for (int i = 0; i < n; i++) {
            boolean isBreak = false;
            for (int j = 0; j < n; j++) {
                if (arr[i][j].equals('#')) {
                    start = new int[]{i, j};
                    isBreak = true;
                    break;
                }
            }
            if (isBreak) break;
        }
        for (int i = n-1; i >= 0 ; i--) {
            boolean isBreak = false;
            for (int j = n-1; j >= 0 ; j--) {
                if (arr[i][j].equals('#')) {
                    end = new int[]{i,j};
                    isBreak = true;
                    break;
                }

            }
            if(isBreak) break;
        }
        //System.out.println(Arrays.toString(start));
        //System.out.println(Arrays.toString(end));

        boolean rect = isRect(arr, start, end);
        if(rect) System.out.println("yes");
        else System.out.println("no");
    }

    private static boolean isRect(Character[][] arr, int[] start, int[] end) {
        for (int i = start[0]; i <= end[0]; i++) {
            for (int j = start[1]; j <= end[1]; j++) {
                if (arr[i][j].equals('.')) {
                    return false;
                }
            }
        }
        return (start[0] - end[0]) == (start[1] - end[1]);
    }
}
