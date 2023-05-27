package BaekJoon;

import java.util.Scanner;

public class PracTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(fact(n)/(fact(r)*fact(n-r)));
    }

    private static int fact(int x){
        if (x == 0 || x == 1) {
            return 1;
        }else return fact(x-1) * x;
    }

    private static int fact2(int a, int b) {
        if(a == 1 || a == 0) return 1;
        else if(a == b) return b;
        else return fact2(a-1,b) * a;
    }
}
