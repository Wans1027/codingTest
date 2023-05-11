package AlgorithmLABS.Recursion;

import java.util.Scanner;

public class ToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        bin(n);
        System.out.println(st);
    }
    static StringBuilder st = new StringBuilder();
    private static void bin(int n) {

        if (n <= 1) {
            //System.out.print(n);
            st.append(n);
        } else {
            bin(n/2);
            //System.out.print(n%2);
            st.append(n%2);
        }
    }
}
