package AlgorithmLABS.Recursion;

import java.awt.*;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fac(n));

    }
    private static int fac(int n) {
        if (n == 1) {
            return 1;
        }
        else{
           return fac(n-1) * n;
        }
    }
}
