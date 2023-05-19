package SW_ExpertAcademy;

import java.util.Scanner;

public class HMoon1216 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Character[][] map = new Character[100][100];
        for (int i = 0; i < 100; i++) {
            String split = sc.nextLine();
            for (int j = 0; j < 100; j++) {
                map[i][j] = split.charAt(j);
            }
        }

        int maxLen = 0;

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                int rowLen = 0;
                int colLen = 0;
                int rowLen1 = 0;
                int colLen1 = 0;
                boolean isRowEnd = false;
                boolean isColEnd = false;
                boolean isRowEnd1 = false;
                boolean isColEnd1 = false;
                for (int k = 0; k < 50; k++) {
                    try {
                        if (map[i][j + k] == map[i][j - k] && k!=0) {
                            if (!isRowEnd ){
                                rowLen++;
                                maxLen = Math.max(maxLen, rowLen*2+1);
                            }
                        } else if (map[i][j + k] != map[i][j - k]) {
                            rowLen = 0;
                            isRowEnd = true;
                        }
                    } catch (Exception e) {
                        isRowEnd = true;
                    }

                    try {
                        if (map[i + k][j] == map[i- k][j] && k!=0) {
                            if(!isColEnd){
                                colLen++;
                                maxLen = Math.max(maxLen, colLen*2+1);
                            }

                        } else if (map[i + k][j] != map[i- k][j]) {
                            colLen = 0;
                            isColEnd = true;
                        }

                    } catch (Exception e) {
                        isColEnd = true;
                    }

                    try {
                        if (map[i][j - k] == map[i][j + k+1]) {
                            if (!isRowEnd1){
                                rowLen1++;
                                maxLen = Math.max(maxLen, rowLen1*2);
                            }
                        } else if (map[i][j - k] != map[i][j + k+1]) {
                            rowLen1 = 0;
                            isRowEnd1 = true;
                        }
                    } catch (Exception e) {
                        isRowEnd1 = true;
                    }

                    try {
                        if (map[i - k][j] == map[i+ k+1][j]) {
                            if(!isColEnd1){
                                colLen1++;
                                maxLen = Math.max(maxLen, colLen1*2);
                            }

                        } else if (map[i - k][j] != map[i+ k+1][j]) {
                            colLen1 = 0;
                            isColEnd1 = true;
                        }

                    } catch (Exception e) {
                        isColEnd1 = true;
                    }

                    if(isRowEnd && isColEnd && isColEnd1 && isRowEnd1) {
                        break;
                    }
                }
            }
        }



        System.out.println(maxLen);

    }
}
