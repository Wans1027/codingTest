package SW_ExpertAcademy;

import java.util.Scanner;

public class InfinityString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = infStr();
            System.out.println(s);
        }
    }

    private static String infStr() {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        String a = s[0];
        String b = s[1];
        int gCd = getGCd(a.length(), b.length());
        int lcm = a.length() * b.length() / gCd; // 최소공배수
        String A = a;
        String B = b;
        while (A.length() != lcm) {
            A += a;
        }
        while (B.length() != lcm) {
            B += b;
        }

        if (A.equals(B)) {
            return "yes";
        } else return "no";


    }

    private static int getGCd(int a, int b) {
        //최대공약수
        if (a % b == 0) {
            return b;
        } else {
            return getGCd(b, a % b);
        }
    }
}
