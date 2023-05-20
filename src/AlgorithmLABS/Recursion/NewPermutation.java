package AlgorithmLABS.Recursion;

import java.util.Scanner;

public class NewPermutation {
    static String num;
    static boolean[] visited;
    static char[] result;
    static int r;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        num = sc.nextLine();
        r = sc.nextInt();
        //숫자중에 n개를 뽑자
        visited = new boolean[num.length()];
        result = new char[r];

        perm(0);
    }

    private static void perm(int x){
        if(r == x){
            System.out.println(result);
            return;
        }
        for (int i = 0; i < num.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                result[x] = num.charAt(i);

                perm(x + 1);

                visited[i] = false;

            }
        }

    }


}
