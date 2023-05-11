package AlgorithmLABS.Recursion;

import java.util.Scanner;

public class Fibona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = recur(n);
        System.out.println(a);
    }

    private static int recur(int s) {


        if(s <= 1){
            return s;
        }
        else {
            return recur(s - 1) + recur(s - 2);
        }
    }
}
