package SW_ExpertAcademy;

import java.util.Scanner;

public class View {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int j = 0; j < 10; j++) {
            int cnt = 0;


            int n = sc.nextInt();
            sc.nextLine();
            int[] h = new int[n];
            for (int i = 0; i < n; i++) {
                h[i] = sc.nextInt();
            }


            for (int i = 2; i < n-2 ; i++) {
                int leftMax = Math.max(h[i - 1], h[i - 2]);
                int rightMax = Math.max(h[i + 1], h[i + 2]);
                int totalMax = Math.max(leftMax, rightMax);
                if (totalMax < h[i]) {
                    cnt += h[i] - totalMax;
                }

            }
            System.out.println();
            System.out.print("#" +(j+1) + " " +cnt);
        }
    }

}
