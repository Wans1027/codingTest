package BaekJoon.PriorityQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MinHeap {
    static PriorityQueue<Integer> q = new PriorityQueue<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a == 0) {
                if (q.size() == 0) {
                    sb.append(0 + "\n");
                } else sb.append(q.poll() + "\n");
            } else q.add(a);
        }

        System.out.println(sb);
    }
}
