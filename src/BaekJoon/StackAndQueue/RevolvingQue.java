package BaekJoon.StackAndQueue;

import java.util.LinkedList;
import java.util.Scanner;

public class RevolvingQue {
    static LinkedList<Integer> q = new LinkedList<>();
    static int[] num;
    static int result;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        num = new int[m];
        result = 0;
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }
        for (int i = 0; i <m; i++) {
            num[i] = sc.nextInt();
        }
        int cnt = 0;
        while (cnt < m){
            int targetIdx = q.indexOf(num[cnt]);
            if (q.peek() == num[cnt]) {
                cnt++;
                q.poll();
                continue;
            }
            int mid = 0;
            if(q.size()%2 == 0) mid = q.size() / 2 - 1;
            else mid = q.size()/2;
            if(targetIdx <= mid) qLeft();
            else qRight();
        }
        System.out.println(result);
    }

    private static void qLeft() {
        q.add(q.poll());
        result++;
    }

    private static void qRight() {
        q.addFirst(q.pollLast());
        result++;
    }
}
