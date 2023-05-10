package AlgorithmLABS.DP;

import java.util.Scanner;

public class ResourceCollect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] v = new int[n][m];


        int start = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int a = sc.nextInt();
                if(i == 0 && j ==0){
                    v[0][0] = a;
                }
                //오른쪽 또는 아래쪽
                else if (i == 0 && j > 0) {
                    v[i][j] = a + v[i][j-1];
                } else if (j == 0 && i > 0) {
                    v[i][j] = a + v[i-1][j];
                }
                else {
                    v[i][j] = a + Math.max(v[i-1][j],v[i][j-1]);
                }
            }
            //sc.nextLine();
        }

        System.out.println(v[n-1][m-1]);
    }
}
