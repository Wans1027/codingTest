package AlgorithmLABS.Recursion;

import java.util.Scanner;

public class Permutation {

    static char[] result;
    static boolean[] visted;
    static int n,r;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        r = sc.nextInt();

        visted = new boolean[n];
        result = new char[r];

        permutation(0);

    }

    private static void permutation(int x) {

        if (x >= r) {
            System.out.println(result);
        }
        else {
            for (int i = 0; i < n; i++) {
                if (!visted[i]) {
                    result[x] = (char) (i + 'a');
                    visted[i] = true;

                    permutation(x + 1);

                    visted[i] = false;
                    result[x] = 0;

                }


            }
        }
    }

    private static void combination(int x) {

        if (x >= r) {
            System.out.println(result);
        }
        else {
            for (int i = 0; i < n; i++) {

                result[x] = (char) (i + 'a');

                combination(x + 1);

                result[x] = 0;

            }
        }
    }
}
