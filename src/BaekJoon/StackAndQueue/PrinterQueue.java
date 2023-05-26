package BaekJoon.StackAndQueue;

import java.util.*;

public class PrinterQueue {
    static LinkedList<int[]> q;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int testcase = sc.nextInt();
        for (int i = 0; i < testcase; i++) {
            q = new LinkedList<>();
            int n = sc.nextInt();
            int m = sc.nextInt();

            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                q.add(new int[]{j,a});

            }

            int cnt = 0;

            while (!q.isEmpty()) {
                int max = 0;

                for (int j = 0; j < q.size(); j++) {
                    max = Math.max(q.get(j)[1], max);
                }
                int[] poll = q.poll();
                if(poll[1] != max) q.add(poll);
                else {
                    cnt++;
                    if(poll[0] == m) break;
                }
            }
            sb.append(cnt+"\n");
            sc.nextLine();
        }

        System.out.print(sb);

    }
}
